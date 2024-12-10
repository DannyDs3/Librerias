package com.distribuida.principal.dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class ClienteDAOPrincipal {
	public static void main (String[]args) {
		
		ClassPathXmlApplicationContext context = new 	ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		Cliente cliente = new Cliente(35, "1754896551","Griselda","Sures","Tumbaco","0963542971","Grisel123@com" );
		
		clienteDAO.del(35);
		
		Cliente cliente3 = clienteDAO.findOne(35);
		System.out.println(cliente3.toString());
		
		
		
		List <Cliente> clientes = clienteDAO.findAll();
		for (Cliente item : clientes) {
			System.out.println(item.toString());
			
		}
		
		
		context.close();
		
	}

}

