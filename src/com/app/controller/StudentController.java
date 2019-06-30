package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Student;
import com.app.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService service;

	public StudentController() {
		super();
	}
	@GetMapping("/login")
	public String validation(String email, String password) {
		// TODO Auto-generated method stub
		return "/student/login";
	}
	@PostMapping("/login")
	public String Validation(Model map, @RequestParam String email, @RequestParam String password,HttpSession hs)
	{
	
		map.addAttribute("status","login successfull");
		Student s= service.Validation(email, password);
		hs.setAttribute("studentdetail",s);
		
		return "redirect:/student/list";
	}
	@GetMapping("/list")
	public String StudentList(Model map) {
		// TODO Auto-generated method stub
		System.out.println("in list controller");
		List<Student> student= service.StudentList();
		for(Student s:student)
		{
			System.out.println(s);
		}
		map.addAttribute("studentList", service.StudentList());
		return "/student/list";
	}
	@GetMapping("/add")
	public String AddStudent(Student s) {
		// TODO Auto-generated method stub
		
		return "/student/add";
	}
	@PostMapping("/add")
	public String addStudent(Student s,Model map) {
		// TODO Auto-generated method stub
		map.addAttribute("register",service.AddStudent(s));
		
		return "redirect:/student/login";
	}
	@GetMapping("/delete")
	public String DeleteStudent(Student s) {
		// TODO Auto-generated method stub
		return "/student/delete";
	}
	@PostMapping("/delete")
	public String deleteStudent(@RequestParam int id,Model map) {
		// TODO Auto-generated method stub
		map.addAttribute("delete",service.DeleteStudent(id));
		return "redirect:/student/list";
	}
	@GetMapping("/update")
	public String UpdateStudent(Student s) {
		// TODO Auto-generated method stub
		return "/student/update";
	}
	@PostMapping("/update")
	public String UpdateStudent(Student s,Model map) {
		// TODO Auto-generated method stub
		map.addAttribute("update",service.UpdateStudent(s));
		return "redirect:/student/list";
	}

	@GetMapping("/max")
	public String MaxMarks(Model map) {
		// TODO Auto-generated method stub
		System.out.println("in list controller");
		Student s=service.Detailbyname();
		System.out.println(s);
		map.addAttribute("max", service.Detailbyname());
		return "/student/max";
	}
	@GetMapping("/detail")
	public String Detailbyid() {
		// TODO Auto-generated method stub
		
		return "/student/detail";
	}
	@PostMapping("/detail")
	public String detailbyid(int id,Model map) {
		// TODO Auto-generated method stub
		map.addAttribute("details", service.Detailbyid(id));
		return "/student/detailid";
	}

	@GetMapping("/logout")
	public String userLogout(HttpSession hs,Model map) {
		System.out.println("in student logout");
		map.addAttribute("studentdetail",hs.getAttribute("studentdetail"));
		//save user dtls from session scope ---> request scope
		//invalidate user's session
		hs.invalidate();
		//navigate the clnt to index page after slight dly
		return "/student/logout";
	}
	
	
	
}
