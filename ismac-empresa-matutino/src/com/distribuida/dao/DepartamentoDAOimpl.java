package com.distribuida.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Departamento;

@Repository
public class DepartamentoDAOimpl implements DepartamentoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Departamento> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Departamento", Departamento.class).getResultList();
    }

    @Override
    @Transactional
    public Departamento findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Departamento.class, id);
    }

    @Override
    @Transactional
    public void add(Departamento departamento) {
        Session session = sessionFactory.getCurrentSession();
        session.save(departamento);
    }

    @Override
    @Transactional
    public void update(Departamento departamento) {
        Session session = sessionFactory.getCurrentSession();
        session.update(departamento);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Departamento departamento = session.get(Departamento.class, id);
        if (departamento != null) {
            session.delete(departamento);
        }
    }
}
