package com.distribuida.principal;
import com.distribuida.entities.Autor;

import com.distribuida.entities.Libro;
public class Libroprincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor Autor = new Autor (12,"1723623447","Danny","Garcia","Ecuador","Pifo","0978574211","Danny123@correo.com");
		Libro Libro = new Libro();
		System.out.println(Libro.toString());
		

	}

}
