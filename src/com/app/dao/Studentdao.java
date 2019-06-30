package com.app.dao;

import java.util.List;

import com.app.pojos.Student;

public interface Studentdao {
	Student Validation(String email,String password);
	List<Student> StudentList();
	String UpdateStudent(Student s);
	String DeleteStudent(int id);
	String AddStudent(Student s);
	Student Detailbyname();
	Student Detailbyid(int id);
	

}
