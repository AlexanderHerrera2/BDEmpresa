package com.distribuida.dao;

import com.distribuida.entities.Departamento;
import java.util.List;


public interface DepartamentoDAO {
	 List<Departamento> findAll();
	 
	    Departamento findOne(int id);
	    
	    void add(Departamento departamento);
	    
	    void update(Departamento departamento);
	    
	    void delete(int id);
    
}
