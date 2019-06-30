package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.Studentdao;
import com.app.pojos.Student;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
     Studentdao dao;
	@Override
	public Student Validation(String email, String password) {
		// TODO Auto-generated method stub
		return dao.Validation(email, password);
	}

	@Override
	public List<Student> StudentList() {
		// TODO Auto-generated method stub
		return dao.StudentList();
	}

	@Override
	public String UpdateStudent(Student s) {
		// TODO Auto-generated method stub
		return dao.UpdateStudent(s);
	}

	@Override
	public String DeleteStudent(int id) {
		// TODO Auto-generated method stub
		return dao.DeleteStudent(id);
	}

	@Override
	public String AddStudent(Student s) {
		// TODO Auto-generated method stub
		return dao.AddStudent(s);
	}

	@Override
	public Student Detailbyname() {
		// TODO Auto-generated method stub
		return dao.Detailbyname();
	}

	@Override
	public Student Detailbyid(int id) {
		// TODO Auto-generated method stub
		
		return dao.Detailbyid(id);
	}

}
