package com.hiber.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hiber.vo.InfoVO;

@Repository
@Transactional
public class InfoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void insert(InfoVO vo){
		
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(vo);
		tr.commit();
	}
}
