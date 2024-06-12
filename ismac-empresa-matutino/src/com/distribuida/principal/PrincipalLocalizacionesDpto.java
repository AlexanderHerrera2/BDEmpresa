package com.distribuida.principal;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LocalizacionesDptoDAO;
import com.distribuida.entities.LocalizacionesDpto;


public class PrincipalLocalizacionesDpto {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	        
	        LocalizacionesDptoDAO localizacionesDptoDAO = context.getBean("localizacionesDptoDAOimpl", LocalizacionesDptoDAO.class);
	        
	        List<LocalizacionesDpto> localizacionesDptos = localizacionesDptoDAO.findAll();
	        
	        localizacionesDptos.forEach(localizacionesDpto -> {
	            System.out.println(localizacionesDpto.toString());
	        });
	        
	        context.close();
	}

}
