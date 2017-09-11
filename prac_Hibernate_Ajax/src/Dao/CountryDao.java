package Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Vo.CountryVo;


public class CountryDao {

	public void insertdata(CountryVo vo) {
		// TODO Auto-generated method stub
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(vo);
			tr.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	
}
