package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Student;
@Repository
public class StudentImplDao implements Studentdao {
	@Autowired
SessionFactory sf;
	@Override
	public Student Validation(String email, String password) {
		// TODO Auto-generated method stub
		String jpql="select s from Student s where s.email=:email and s.password=:password";
		return sf.getCurrentSession().createQuery(jpql,Student.class).setParameter("email", email).setParameter("password", password).getSingleResult();
		
}

	@Override
	public List<Student> StudentList() {
		// TODO Auto-generated method stub
		String jpql="select s from Student s";
		System.out.println("in list dao");
		return sf.getCurrentSession().createQuery(jpql,Student.class).getResultList();
	}

	@Override
	public String UpdateStudent(Student s) {
		// TODO Auto-generated method stub
		/*
		 * String jpql="select s from student s where s.id=:id";
		 * sf.getCurrentSession().createQuery(jpql,student.class).setParameter("id",s.
		 * getId()).getSingleResult();
		 */
		sf.getCurrentSession().update(s);
		return "update successfully";
	}

	@Override
	public String DeleteStudent(int id) {
		// TODO Auto-generated method stub
		String jpql="select s from Student s where s.id=:id";
		Student s=sf.getCurrentSession().createQuery(jpql,Student.class).setParameter("id", id).getSingleResult();
		sf.getCurrentSession().delete(s);
		return "deleted successfully"+s.getId();
	}

	@Override
	public String AddStudent(Student s) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().persist(s);
		return "register successfully"+s.getId();
	}

	@Override
	public Student Detailbyname() {
		// TODO Auto-generated method stub
		String jpql="select s from Student s where s.marks=(select min(ss.marks) from Student ss)";
		return sf.getCurrentSession().createQuery(jpql,Student.class).getSingleResult();
	}

	@Override
	public Student Detailbyid(int id) {
		// TODO Auto-generated method stub
		String jpql="select s from Student s where s.id=:id";
		Student s=sf.getCurrentSession().createQuery(jpql,Student.class).setParameter("id",id).getSingleResult();
		return s;
	}

}
