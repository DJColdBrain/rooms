package rooms.service;

import rooms.model.Chair;

import java.util.List;

public interface ChairService {

    List<Chair> findAll();

    Chair findById(long id);

}
