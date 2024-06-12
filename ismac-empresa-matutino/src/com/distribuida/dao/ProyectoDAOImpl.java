package com.distribuida.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Proyecto;

@Repository
public class ProyectoDAOImpl implements ProyectoDAO {
	@Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Proyecto> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Proyecto", Proyecto.class).getResultList();
    }

    @Override
    @Transactional
    public Proyecto findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Proyecto.class, id);
    }

    @Override
    @Transactional
    public void add(Proyecto proyecto) {
        Session session = sessionFactory.getCurrentSession();
        session.save(proyecto);
    }

    @Override
    @Transactional
    public void update(Proyecto proyecto) {
        Session session = sessionFactory.getCurrentSession();
        session.update(proyecto);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Proyecto proyecto = session.get(Proyecto.class, id);
        if (proyecto != null) {
            session.delete(proyecto);
        }
    }
}
