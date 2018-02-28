package rooms.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import rooms.model.Chair;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ChairDaoImpl implements ChairDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Chair> findAll() {
        SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT * FROM chair");
        List<Chair> result = new ArrayList<>();
        while (rs.next()) {
            Chair chair = new Chair();
            chair.setId(rs.getLong("id"));
            chair.setChairType(rs.getString("name"));
            result.add(chair);
        }
        return result;
    }

    @Override
    public Chair findById(long id) {
        SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT * FROM chair WHERE id = ?", id);
            rs.next();
        Chair chair = new Chair();
        chair.setId(rs.getLong("id"));
        chair.setChairType(rs.getString("name"));
        return chair;
    }

}
