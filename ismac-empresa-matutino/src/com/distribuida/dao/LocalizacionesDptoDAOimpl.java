package com.distribuida.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.LocalizacionesDpto;

@Repository
public class LocalizacionesDptoDAOimpl implements LocalizacionesDptoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<LocalizacionesDpto> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from LocalizacionesDpto", LocalizacionesDpto.class).getResultList();
    }

    @Override
    @Transactional
    public LocalizacionesDpto findOne(int numeroDpto, String ubicacionDpto) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(LocalizacionesDpto.class, numeroDpto);
    }

    @Override
    @Transactional
    public void add(LocalizacionesDpto localizacionesDpto) {
        Session session = sessionFactory.getCurrentSession();
        session.save(localizacionesDpto);
    }

    @Override
    @Transactional
    public void update(LocalizacionesDpto localizacionesDpto) {
        Session session = sessionFactory.getCurrentSession();
        session.update(localizacionesDpto);
    }

    @Override
    @Transactional
    public void delete(int numeroDpto, String ubicacionDpto) {
        Session session = sessionFactory.getCurrentSession();
        LocalizacionesDpto localizacionesDpto = session.get(LocalizacionesDpto.class, numeroDpto);
        if (localizacionesDpto != null) {
            session.delete(localizacionesDpto);
        }
    }
}
