package com.distribuida.entities;

public class Categoria {
	private int idCategoria;
	private String categoria;
	private String descripcion;
	
	public Categoria(int i, String string, String string2, String string3, String string4, String string5, String string6) {
		
	}

	public Categoria(int idCategoria, String categoria, String descripcion) {
		
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.descripcion = descripcion;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria + ", descripcion=" + descripcion
				+ ", getIdCategoria()=" + getIdCategoria() + ", getCategoria()=" + getCategoria()
				+ ", getDescripcion()=" + getDescripcion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
