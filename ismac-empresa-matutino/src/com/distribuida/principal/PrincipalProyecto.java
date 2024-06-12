package com.distribuida.principal;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ProyectoDAO;
import com.distribuida.entities.Proyecto;

public class PrincipalProyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	        
	        ProyectoDAO proyectoDAO = context.getBean("proyectoDAOImpl", ProyectoDAO.class);
	        
	        List<Proyecto> proyectos = proyectoDAO.findAll();
	        
	        proyectos.forEach(proyecto -> {
	            System.out.println(proyecto.toString());
	        });
	        
	        context.close();
	}

}
