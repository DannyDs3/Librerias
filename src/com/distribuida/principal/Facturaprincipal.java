package com.distribuida.principal;
import java.util.Date;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class Facturaprincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1,"1725013667","Botas","Tinaco","Av.Pifo","0963459822","BotasT@correo.com");
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-222");
		factura.setFecha(new Date ());
		factura.setTotalNeto(100.50);
		factura.setIva(4.54);
		factura.setTotal(44);
		
		//Inyeccion de dependencias
		factura.setCliente(cliente);
		System.out.println(factura.toString());

	}

}
