package rooms.model;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Chair {

    private long id;
    @NotNull
    private String chairType;

    private List<Room> room;

    public Chair() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChairType() {
        return chairType;
    }

    public void setChairType(String chairType) {
        this.chairType = chairType;
    }


    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }
}
