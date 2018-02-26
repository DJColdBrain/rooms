package com.hotels.demo.dao;

import com.hotels.demo.model.Room;

import java.time.LocalDate;
import java.util.List;

public interface RoomDao {


    List<Room> roomList(LocalDate date, int startTime, int endTime, boolean liveStream, String chairType, String tableType);
}
