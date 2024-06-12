package com.distribuida.dao;
import java.util.List;

import com.distribuida.entities.Proyecto;


public interface ProyectoDAO {
	List<Proyecto> findAll();
    Proyecto findOne(int id);
    void add(Proyecto proyecto);
    void update(Proyecto proyecto);
    void delete(int id);
}
