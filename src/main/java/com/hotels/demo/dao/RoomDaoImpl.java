package com.hotels.demo.dao;

import com.hotels.demo.model.Room;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.util.List;

@Repository
public class RoomDaoImpl implements RoomDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Room> roomList(LocalDate date, int startTime, int endTime, boolean liveStream, String chairType, String tableType) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Room> query = builder.createQuery(Room.class);
        Root<Room> root = query.from(Room.class);
     //   query.select(root).where(builder.equal(root.get("liveStream")))


        return null;
    }

//    Session session = sessionFactory.openSession();
//    CriteriaBuilder builder = session.getCriteriaBuilder();
//    CriteriaQuery<Category> query = builder.createQuery(Category.class);
//    Root<Category> root = query.from(Category.class);
//        query.select(root).where(builder.equal(root.get("id"), id));
//    Query<Category> q  = session.createQuery(query);
//    Category category = q.getSingleResult();
//        Hibernate.initialize(category.getGifs());
//        session.close();
//        return category;
}
