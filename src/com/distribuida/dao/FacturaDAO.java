package com.distribuida.dao;

import com.distribuida.entities.Factura;
import java.util.List;


public interface FacturaDAO {
	public List <Factura > findall();
	public Factura findOne (int id);
	public void add(Factura factura);
	public void up(Factura factura);
	public void del(int id);
	
	

}
