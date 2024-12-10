package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Factura;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

@Repository
public class FacturaDAOImpl implements FacturaDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Factura> findall() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("FROM Factura",Factura.class).getResultList();
	}

	@Override
	@Transactional
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Factura.class,id) ;
	}

	@Override
	@Transactional
	
	public void add(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Session.saveOrUpdate(factura);

	}

	@Override
	@Transactional
	public void up(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Session.saveOrUpdate(factura);


	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Factura.class,id);


	}

}
