package com.distribuida.principal.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;

public class FacturaDAOPrincipal {
	
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		FacturaDAO facturaDAO =  context.getBean("facturaDAOImpl",FacturaDAO.class);
		
		facturaDAO.findall().forEach(item ->{
			System.out.println(item.toString());
			
		});
		context.close();
		
	}

}
 