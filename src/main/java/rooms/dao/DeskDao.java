package rooms.dao;

import rooms.model.Desk;

import java.util.List;

public interface DeskDao {

    List<Desk> findAll();

    Desk findById(long id);
}
