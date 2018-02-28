package rooms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rooms.dao.ChairDao;
import rooms.dao.DeskDao;
import rooms.dao.RoomDao;
import rooms.model.Calendar;
import rooms.model.Chair;
import rooms.model.Desk;
import rooms.model.Room;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    private RoomDao roomDao;

    @Override
    public List roomListPage(Calendar calendar, String chair, String desk, String live, int page) {

        int startTime = calendar.getStartTime().getHour();

        int endTime = calendar.getEndTime().getHour();
        if (calendar.getEndTime().getMinute() > 0){
            endTime += 1;
        }
        if (calendar.getStartTime().compareTo(calendar.getEndTime()) >= 0){
            return new ArrayList();
        }

        int offset = page * 5;

        return roomDao.roomListPage(calendar.getDate(), startTime, endTime, live, chair, desk, offset);
    }

    @Override
    public List<Room> findPageedRoom(Calendar calendar, String chair, String desk, String liveStream, int page) {
        int startTime = calendar.getStartTime().getHour();

        page = page*5;

        int endTime = calendar.getEndTime().getHour();
        if (calendar.getEndTime().getMinute() > 0){
            endTime += 1;
        }
        if (calendar.getStartTime().compareTo(calendar.getEndTime()) >= 0){
            return new ArrayList();
        }

        return roomDao.findPageedRoom(calendar.getDate(), startTime, endTime, liveStream, chair, desk, page);
    }


    @Override
    public List roomList(Calendar calendar, String chair, String desk, String live) {

        int startTime = calendar.getStartTime().getHour();

        int endTime = calendar.getEndTime().getHour();
        if (calendar.getEndTime().getMinute() > 0){
            endTime += 1;
        }
        if (calendar.getStartTime().compareTo(calendar.getEndTime()) >= 0){
            return new ArrayList();
        }

        return roomDao.roomList(calendar.getDate(), startTime, endTime, live, chair, desk);
    }

    @Override
    public List roomsPrice(List<Room> rooms) {
        return null;
    }
}
