package com.distribuida.entities;

public class Factura_detalle {
	private int idFactura_detalle;
	private double Cantidad;
	private double subtotal;
	private Factura Factura;
	public Factura_detalle () {
		
		
	}
	public Factura_detalle(int idFactura_detalle, double cantidad, double subtotal,
			com.distribuida.entities.Factura factura) {
		super();
		this.idFactura_detalle = idFactura_detalle;
		Cantidad = cantidad;
		this.subtotal = subtotal;
		Factura = factura;
	}
	public int getIdFactura_detalle() {
			return idFactura_detalle;
		}
		public void setIdFactura_detalle(int idFactura_detalle) {
			this.idFactura_detalle = idFactura_detalle;
		}
		public double getCantidad() {
			return Cantidad;
		}
		public void setCantidad(double cantidad) {
		Cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Factura getFactura() {
		return Factura;
	}
	public void setFactura(Factura factura) {
		Factura = factura;
	}
	@Override
	public String toString() {
		return "Factura_detalle [idFactura_detalle=" + idFactura_detalle + ", Cantidad=" + Cantidad + ", subtotal="
				+ subtotal + ", Factura=" + Factura + "]";
	}
	
	

}
