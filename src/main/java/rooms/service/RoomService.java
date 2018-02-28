package rooms.service;

import rooms.model.Calendar;
import rooms.model.Chair;
import rooms.model.Desk;
import rooms.model.Room;
import sun.security.krb5.internal.crypto.Des;

import java.util.List;

public interface RoomService {

    List<Room> roomList(Calendar calendar, String chair, String desk, String liveStream);

    List<Room> roomListPage(Calendar calendar, String chair, String desk, String liveStream, int page);

    List<Room> findPageedRoom(Calendar calendar, String chair, String desk, String liveStream, int page);

    List roomsPrice(List<Room> rooms);
}
