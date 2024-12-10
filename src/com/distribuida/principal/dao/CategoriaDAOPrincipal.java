package com.distribuida.principal.dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class CategoriaDAOPrincipal {
	public static void main (String[]args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		
		CategoriaDAO categoriaDAO = (CategoriaDAO) context.getBean("categoriaDAOImpl",Categoria.class);
		
		List <Categoria> categorias = categoriaDAO.findaAll();
		for (Categoria categoria : categorias) {
			System.out.println(categoria.toString());
		}
		
	}

}
