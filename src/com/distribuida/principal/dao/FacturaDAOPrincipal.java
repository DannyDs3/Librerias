package com.distribuida.principal.dao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaDAOPrincipal {
	
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		FacturaDAO facturaDAO =  context.getBean("facturaDAOImpl",FacturaDAO.class);
		//add
		Cliente cliente= clienteDAO.findOne(1);
		Factura factura = new Factura();
		factura.setIdFactura(0);
		factura.setNumfactura("FAC-001");
		factura.setFecha(new Date());
		factura.setTotalNeto(100.30);
		factura.setIva(15.32);
		factura.setTotal(116.32);
		factura.setCliente(cliente);
		
		facturaDAO.add(factura);
		
		
		
		
		facturaDAO.findall().forEach(item ->{
			System.out.println(item.toString());
			
		});
		context.close();
		
	}

}
 