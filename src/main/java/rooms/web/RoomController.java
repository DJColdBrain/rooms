package rooms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rooms.model.Calendar;
import rooms.model.Chair;
import rooms.model.Desk;
import rooms.model.Room;
import rooms.service.ChairService;
import rooms.service.DeskService;
import rooms.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Controller
@SessionAttributes(value = {"room", "calendar", "desk", "chair","page"})
public class RoomController {

    @Autowired
    private DeskService deskService;

    @Autowired
    private ChairService chairService;

    @Autowired
    private RoomService roomService;

    @RequestMapping("/")
    public String searchForm(
            Room room, Calendar calendar,Chair chair, Desk desk, Model model, @RequestParam(defaultValue = "0", value = "page") int page){
            model.addAttribute("page", page);
        if (!model.containsAttribute("rooms")){
            model.addAttribute("rooms", new ArrayList<>());
        }
        model.addAttribute("chairs", chairService.findAll());
        model.addAttribute("desks", deskService.findAll());
        return "index";
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String search(
            @PathVariable("id") int page,
            @ModelAttribute(value = "calendar") Calendar calendar,
            @ModelAttribute(value = "room") Room room,
            @ModelAttribute(value = "chair") Chair chair,
            @ModelAttribute(value = "desk") Desk desk, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("calendar" , calendar);
        redirectAttributes.addFlashAttribute("desk", desk);
        redirectAttributes.addFlashAttribute("chair", chair);
        redirectAttributes.addFlashAttribute("room", room);
        redirectAttributes.addFlashAttribute("page", page);
        if ((calendar.getDate() == null)||(room.getLiveStream() == null)||
                (chair.getChairType() == null) || (desk.getDeskType() == null)||
                (calendar.getEndTime() == null) || (calendar.getStartTime() == null)){
            redirectAttributes.addFlashAttribute("err", "WRONG ARGUMENTS");
            return "redirect:/";
        }

        redirectAttributes.addFlashAttribute("rooms", roomService.findPageedRoom(calendar, chair.getChairType(), desk.getDeskType(),room.getLiveStream(), page));

        return "redirect:/";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String searchGet(
            @PathVariable("id") int page,
            Model model,
            @ModelAttribute(value = "calendar") Calendar calendar,
            @ModelAttribute(value = "room") Room room,
            @ModelAttribute(value = "chair") Chair chair,
            @ModelAttribute(value = "desk") Desk desk, RedirectAttributes redirectAttributes){

        model.addAttribute("chairs", chairService.findAll());
        model.addAttribute("desks", deskService.findAll());
        model.addAttribute("calendar" , calendar);
        model.addAttribute("desk", desk);
        model.addAttribute("chair", chair);
        model.addAttribute("room", room);
        model.addAttribute("page", page);
        if ((calendar.getDate() == null)||(room.getLiveStream() == null)||
                (chair.getChairType() == null) || (desk.getDeskType() == null)||
                (calendar.getEndTime() == null) || (calendar.getStartTime() == null)){
            redirectAttributes.addFlashAttribute("err", "WRONG ARGUMENTS");
            return "redirect:/";
        }

        model.addAttribute("rooms", roomService.findPageedRoom(calendar, chair.getChairType(), desk.getDeskType(),room.getLiveStream(), page));

        return "index";
    }


}
