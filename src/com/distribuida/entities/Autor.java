package com.distribuida.entities;

public class Autor {
	private int idAutor;
	private String cedula;
	private String nombre;
	private String apellido;
	private String pais;
	private String dirreccion;
	private String telefono;
	private String correo;
	//Constructores
	public Autor () {
		
	}
	public Autor(int idAutor, String cedula, String nombre, String apellido, String pais, String dirreccion,
			String telefono, String correo) {
		super();
		this.idAutor = idAutor;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		this.dirreccion = dirreccion;
		this.telefono = telefono;
		this.correo = correo;
	}
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDirreccion() {
		return dirreccion;
	}
	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", pais=" + pais + ", dirreccion=" + dirreccion + ", telefono=" + telefono + ", correo=" + correo
				+ "]";
	}
	

}
