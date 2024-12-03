package com.distribuida.entities;

public class Libro {
	private int idLibro;
	private String titulo;
	private String editorial;
	private String numpaginas;
	private String edicion;
	private String idioma;
	private String fechapublicacion;
	private String descripcion;
	private String tipo_pasta;
	private String ISBN;
	private String numejemplares;
	private String portada;
	private String presentacion;
	private String precio;
	private Categoria Categoria;
	private Autor Autor;
	public Libro () {
		
	}
	public Libro(int idLibro, String titulo, String editorial, String numpaginas, String edicion, String idioma,
			String fechapublicacion, String descripcion, String tipo_pasta, String iSBN, String numejemplares,
			String portada, String presentacion, String precio, com.distribuida.entities.Categoria categoria,
			com.distribuida.entities.Autor autor) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.numpaginas = numpaginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fechapublicacion = fechapublicacion;
		this.descripcion = descripcion;
		this.tipo_pasta = tipo_pasta;
		ISBN = iSBN;
		this.numejemplares = numejemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		Categoria = categoria;
		Autor = autor;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getNumpaginas() {
		return numpaginas;
	}
	public void setNumpaginas(String numpaginas) {
		this.numpaginas = numpaginas;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getFechapublicacion() {
		return fechapublicacion;
	}
	public void setFechapublicacion(String fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo_pasta() {
		return tipo_pasta;
	}
	public void setTipo_pasta(String tipo_pasta) {
		this.tipo_pasta = tipo_pasta;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getNumejemplares() {
		return numejemplares;
	}
	public void setNumejemplares(String numejemplares) {
		this.numejemplares = numejemplares;
	}
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return Categoria;
	}
	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
	public Autor getAutor() {
		return Autor;
	}
	public void setAutor(Autor autor) {
		Autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numpaginas="
				+ numpaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechapublicacion=" + fechapublicacion
				+ ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", ISBN=" + ISBN + ", numejemplares="
				+ numejemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", Categoria=" + Categoria + ", Autor=" + Autor + "]";
	}
	

}
