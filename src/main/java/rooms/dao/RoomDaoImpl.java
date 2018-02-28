package rooms.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import rooms.model.Calendar;
import rooms.model.Room;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RoomDaoImpl implements RoomDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Room> findAll() {
        return null;
    }

    @Override
    public List roomList(LocalDate date, int startTime, int endTime, String liveStream, String chairType, String deskType) {

        String s = "TRUE IN(";
        boolean isIterated = false;
        for (int i = startTime; i < endTime; i++) {
            s += "c.availableFrom" + i + "Till" + (1 + i) + ", ";
            isIterated = true;
        }

        String avg = ", (";
        for (int i = startTime; i < endTime; i++) {
            avg += "p.priceFrom" + i + "Till" + (1 + i) + " + ";
        }
        avg = avg.substring(0, avg.length() - 3) + ") /" + Math.abs(startTime - endTime) + " AS average";


        s = s.substring(0, s.length() - 2) + ") AND ";
        if (!isIterated) {
            s = "";
            avg = "";
        }

        List<Room> result = new ArrayList<>();

        SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT DISTINCT r.name " + avg + " FROM room AS r " +
                "JOIN calendar AS c ON r.id = c.room_id " +
                "JOIN price AS p on p.room_id = r.id " +
                "JOIN chair AS chr ON r.chair_id = chr.id " +
                "JOIN desk AS d ON r.desk_id = d.id " +
                "WHERE " + s + " c.date = p.date AND chr.name = '" + chairType + "' " +
                "AND d.name = '" + deskType + "' AND r.liveStream = '" + liveStream + "' " +
                "AND c.date = '" + date.toString() + "'");
        while (rs.next()) {
            Room room = new Room();
            room.setName(rs.getString("name"));
            room.setPrice(rs.getBigDecimal("average"));
            result.add(room);
        }
        return result;
    }


    @Override
    public List roomListPage(LocalDate date, int startTime, int endTime, String liveStream, String chairType, String deskType, int page) {

        String s = "TRUE IN(";
        boolean isIterated = false;
        for (int i = startTime; i < endTime; i++) {
            s += "c.availableFrom" + i + "Till" + (1 + i) + ", ";
            isIterated = true;
        }

        String avg = ", (";
        for (int i = startTime; i < endTime; i++) {
            avg += "p.priceFrom" + i + "Till" + (1 + i) + " + ";
        }
        avg = avg.substring(0, avg.length() - 3) + ") /" + Math.abs(startTime - endTime) + " AS average";

        s = s.substring(0, s.length() - 2) + ") AND ";
        if (!isIterated) {
            s = "";
            avg = "";
        }
        List<Room> result = new ArrayList<>();

        SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT DISTINCT r.name " + avg + " FROM room AS r " +
                "JOIN calendar AS c ON r.id = c.room_id " +
                "JOIN price AS p on p.room_id = r.id " +
                "JOIN chair AS chr ON r.chair_id = chr.id " +
                "JOIN desk AS d ON r.desk_id = d.id " +
                "WHERE " + s + " c.date = p.date AND chr.name = '" + chairType + "' " +
                "AND d.name = '" + deskType + "' AND r.liveStream = '" + liveStream + "' " +
                "AND c.date = '" + date.toString() + "' LIMIT " + page + " , 5");
        while (rs.next()) {
            Room room = new Room();
            room.setName(rs.getString("name"));
            room.setPrice(rs.getBigDecimal("average"));
            result.add(room);
        }
        return result;

    }


    public List findPageedRoom(LocalDate date, int startTime, int endTime, String liveStream, String chairType, String deskType, int page) {
        List<Room> result = new ArrayList<>();

        String s = "r.hour IN(";
        boolean isIterated = false;
        for (int i = startTime; i < endTime; i++) {
            s += "'" + i + "-" + (1 + i) + "', ";
            isIterated = true;
        }
        s = s.substring(0, s.length() - 2) + ") AND ";
        if (!isIterated) {
            s = "";
        }
        SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT r.name, AVG(r.price) AS average FROM room AS r " +
                "JOIN chair AS c ON r.chair_id = c.id " +
                "JOIN desk AS d ON r.desk_id = d.id " +
                "JOIN (SELECT AVG(r.available) AS available , r.name AS title FROM room AS r " +
                "JOIN chair AS c ON r.chair_id = c.id " +
                "JOIN desk AS d ON r.desk_id = d.id " +
                "WHERE " + s + " c.name = '" + chairType + "' " +
                "AND d.name = '" + deskType + "' AND r.liveStream = '" + liveStream + "' " +
                "AND r.date = '" + date.toString() + "' AND r.name = r.name " +
                "GROUP BY r.name, r.date ) AS jn ON jn.title = r.name " +
                "WHERE " + s + "  r.available = 1 AND c.name = '" + chairType + "' " +
                "AND d.name = '" + deskType + "' AND r.liveStream = '" + liveStream + "' AND " +
                " jn.available = 1 " +
                "AND r.date = '" + date.toString() + "' " +
                "GROUP BY r.name, r.date " +
                "LIMIT " + page + " , 5");

        while (rs.next()) {
            Room room = new Room();
            room.setName(rs.getString("name"));
            room.setPrice(rs.getBigDecimal("average"));
            result.add(room);
        }
        return result;
    }


}
