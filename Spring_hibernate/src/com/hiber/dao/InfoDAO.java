package com.hiber.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hiber.vo.InfoVO;

@Transactional
@Repository
public class InfoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	List ls = new ArrayList();
	
	public void insert(InfoVO vo){
		
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(vo);
		tr.commit();
	}
	
	public List search(){
		
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from InfoVO");
		ls = q.list();
		return ls;
	}

	public List edit(InfoVO vo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from InfoVO where id = '"+vo.getId()+"'");
		ls = q.list();
		return ls;
	}

	public void update(InfoVO vo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(vo);
		tr.commit();
	}
}
