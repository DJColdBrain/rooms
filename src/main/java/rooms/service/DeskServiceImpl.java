package rooms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rooms.dao.DeskDao;
import rooms.model.Desk;

import java.util.List;

@Service
public class DeskServiceImpl implements DeskService {

    @Autowired
    private DeskDao deskDao;

    @Override
    public List<Desk> findAll() {
        return deskDao.findAll();
    }

    @Override
    public Desk findById(long id) {
        return deskDao.findById(id);
    }
}
