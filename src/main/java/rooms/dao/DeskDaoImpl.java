package rooms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import rooms.model.Chair;
import rooms.model.Desk;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DeskDaoImpl implements DeskDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Desk> findAll() {
        SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT * FROM desk");
        List<Desk> result = new ArrayList<>();
        while (rs.next()) {
            Desk desk = new Desk();
            desk.setId(rs.getLong("id"));
            desk.setDeskType(rs.getString("name"));
            result.add(desk);
        }
        return result;
    }

    @Override
    public Desk findById(long id) {
        SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT * FROM desk WHERE id = ?", id);
           rs.next();
            Desk desk = new Desk();
            desk.setId(rs.getLong("id"));
            desk.setDeskType(rs.getString("name"));
        return desk;
    }
}
