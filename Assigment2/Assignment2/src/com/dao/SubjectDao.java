package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Student;
import com.bean.Subject;

public class SubjectDao {
	
	public List<Subject> getAllSubject() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Query qry = session.createQuery("select s from Subject s order by s.sname asc");
		List<Subject> listOfSubject = qry.getResultList();
		return listOfSubject;
	}

}
