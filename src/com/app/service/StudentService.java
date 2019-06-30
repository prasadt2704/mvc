package com.app.service;

import java.util.List;

import com.app.pojos.Student;

public interface StudentService {
	Student Validation(String email,String password);
	List<Student> StudentList();
	String UpdateStudent(Student s);
	String DeleteStudent(int id);
	String AddStudent(Student s);
	Student Detailbyname();
	Student Detailbyid(int id);
}
