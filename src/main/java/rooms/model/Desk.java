package rooms.model;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Desk {

    private long id;
    @NotNull
    private String deskType;
    private List<Room> room;

    public Desk() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeskType() {
        return deskType;
    }

    public void setDeskType(String deskType) {
        this.deskType = deskType;
    }

    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }
}

