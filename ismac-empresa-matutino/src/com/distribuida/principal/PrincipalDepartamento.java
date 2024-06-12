package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.DepartamentoDAO;
import com.distribuida.entities.Departamento;

public class PrincipalDepartamento{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	        
	        DepartamentoDAO departamentoDAO = context.getBean("departamentoDAOimpl", DepartamentoDAO.class);
	        
	        List<Departamento> departamentos = departamentoDAO.findAll();
	        
	        departamentos.forEach(departamento -> {
	            System.out.println(departamento.toString());
	        });
	        
	        context.close();
	}

}
