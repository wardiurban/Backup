package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {
	
	StudentDao st = new StudentDao();
	public List<Student> getAllStudent() {
		List<Student> listOfStudent = st.getAllStudent();
		Iterator<Student> li = listOfStudent.iterator();
		while(li.hasNext()) {
			 Student c = li.next();	

		}
		return listOfStudent;
	}	

}
