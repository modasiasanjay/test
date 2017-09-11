package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Vo.StateVo;

public class StateDao {
	public void insertdata(StateVo vo) {
		// TODO Auto-generated method stub
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(vo);
			tr.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
