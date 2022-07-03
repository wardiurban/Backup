package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Subject;
import com.dao.SubjectDao;



public class SubjectService {
	
	SubjectDao su = new SubjectDao();
	public List<Subject> getAllSubject() {
		List<Subject> listOfSubject = su.getAllSubject();
		Iterator<Subject> li = listOfSubject.iterator();
		while(li.hasNext()) {
			 Subject c = li.next();	

		}
		return listOfSubject;
	}	
	
	

}
