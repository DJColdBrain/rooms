package rooms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rooms.dao.ChairDao;
import rooms.model.Chair;

import java.util.List;

@Service
public class ChairServiceImpl implements ChairService {

    @Autowired
    private ChairDao chairDao;

    @Override
    public List<Chair> findAll() {
        return chairDao.findAll();
    }

    @Override
    public Chair findById(long id) {
        return chairDao.findById(id);
    }
}
