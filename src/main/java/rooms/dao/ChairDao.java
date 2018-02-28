package rooms.dao;

import rooms.model.Chair;

import java.util.List;

public interface ChairDao {

    List<Chair> findAll();

    Chair findById(long id);
}
