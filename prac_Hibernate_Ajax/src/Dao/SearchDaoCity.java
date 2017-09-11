package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SearchDaoCity {

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
	
}
		

	
	
	
	
	
	
	

