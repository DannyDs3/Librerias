package com.distribuida.principal.dao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaDAOPrincipal {
	
	public static void main(String[]args) {
		
		// Todo Auto-generated method stub
		
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
		
		//facturaDAO.add(factura);
		 //up
		Cliente cliente2 = clienteDAO.findOne(2);
		Factura factura2 = new Factura ();
		factura2.setIdFactura(86);
		factura2.setNumfactura("Fac-0099");
		factura2.setFecha(new Date());
		factura2.setTotalNeto(100.3086);
		factura2.setIva(15.3286);
		factura2.setTotal(116.3286);
		factura2.setCliente(cliente2);
		
		//facturaDAO.up(factura2);
		//facturaDAO.del(86);
		
		//findOne
		try {System.out.println(facturaDAO.findOne(86).toString());  } catch (Exception e) {e.printStackTrace();
			
		}
		
		//findALL
		
		facturaDAO.findall().forEach(item ->{
			System.out.println(item.toString());
			
		});
		context.close();
		
	}

}
 