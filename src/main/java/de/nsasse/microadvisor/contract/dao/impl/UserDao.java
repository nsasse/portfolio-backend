package de.nsasse.microadvisor.contract.dao.impl;

import de.nsasse.microadvisor.contract.dao.Dao;
import de.nsasse.microadvisor.contract.model.User;
import de.nsasse.microadvisor.portfolio.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class UserDao implements Dao<User> {

    Session session = HibernateUtils.getSessionFactory().openSession();

    @Override
    public void create(User User) {
        session.beginTransaction();
        session.save(User);
    }

    @Override
    public void update(User User) {
        session.beginTransaction();
        session.saveOrUpdate(User);
    }

    @Override
    public void delete(User User) {
        session.beginTransaction();
        session.delete(User);
    }

    @Override
    public List<User> findAll() {
        session.beginTransaction();
        return session.createQuery("SELECT p FROM User p", User.class).getResultList();
    }

    @Override
    public User findById(long id) {
        session.beginTransaction();
        return session.createQuery("SELECT p FROM User p WHERE p.id = id", User.class).getSingleResult();
    }
}
