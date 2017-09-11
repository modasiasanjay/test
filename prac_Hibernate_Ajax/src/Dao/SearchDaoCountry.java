package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Vo.StateVo;

public class SearchDaoCountry {

	public List searchcountry() {
		// TODO Auto-generated method stub
		
		
		List ls = new ArrayList();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Query q = session.createQuery("from CountryVo");
		ls = q.list();
		tr.commit();
		return ls;
	}

	public List searchState(StateVo stateVo) {
		// TODO Auto-generated method stub
		
		List ls = new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("from StateVo where cvo = '"+stateVo.getCvo().getCid()+"' ");
			ls = q.list();
			tr.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return ls;
	
	}
	
	

}
