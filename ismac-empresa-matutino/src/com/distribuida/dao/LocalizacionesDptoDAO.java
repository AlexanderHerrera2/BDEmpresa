package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.LocalizacionesDpto;

public interface LocalizacionesDptoDAO {
	 List<LocalizacionesDpto> findAll();
	    LocalizacionesDpto findOne(int numeroDpto, String ubicacionDpto);
	    void add(LocalizacionesDpto localizacionesDpto);
	    void update(LocalizacionesDpto localizacionesDpto);
	    void delete(int numeroDpto, String ubicacionDpto);
}
