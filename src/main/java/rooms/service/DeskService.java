package rooms.service;

import rooms.model.Desk;

import java.util.List;

public interface DeskService  {

    List<Desk> findAll();

    Desk findById(long id);
}
