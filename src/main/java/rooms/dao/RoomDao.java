package rooms.dao;

import rooms.model.Room;

import java.time.LocalDate;
import java.util.List;

public interface RoomDao {

    List<Room> findAll();

    List roomList(LocalDate date, int startTime, int endTime, String liveStream, String chairType, String tableType);

    List roomListPage(LocalDate date, int startTime, int endTime, String liveStream, String chairType, String tableType, int page);

    List findPageedRoom(LocalDate date, int startTime, int endTime, String liveStream, String chairType, String tableType, int page);
}
