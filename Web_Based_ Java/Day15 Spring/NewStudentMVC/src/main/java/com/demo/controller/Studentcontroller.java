package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.beans.Student;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class Studentcontroller {

	@Autowired
	StudentService sservice;
	
	
	@GetMapping("/showstudent")
	public ModelAndView getAllStudents(HttpSession session)
	{
		MyUser user=(MyUser) session.getAttribute("user");
		System.out.println(user);
		
		if(user!=null)
		{
			List<Student> slist=sservice.getAllStudent();
			return new ModelAndView("showstudent","slist",slist);
		}
		else {
			return new ModelAndView("loginpage","message","please provide valid data");
		}
		
	}
	
	@GetMapping("/editstudent/{sid}")
	public ModelAndView editstudent(@PathVariable ("sid") int sid)
	{
		Student s=sservice.findById(sid);
		
		if(s!=null)
		{
			return new ModelAndView("editstudent","st",s);
			
		}
		else {
			return new ModelAndView("redirect:/student/showstudent");
		}
		
	}
	
	@PostMapping("/updateStudent")
	public ModelAndView updatestudent(@ModelAttribute Student s)
	{
		boolean status=sservice.updateData(s);
		return new ModelAndView("redirect:/student/showstudent");
	}
	
	@GetMapping("/deletestudent/{sid}")
	public ModelAndView deletestud(@PathVariable("sid") int sid)
	{
		boolean status=sservice.deletedata(sid);
		return new ModelAndView("redirect:/student/showstudent");
	}
	
	
	@GetMapping("/addstudent")
	public String showproductform(Model myModel) {
		myModel.addAttribute("s1",new Student());
		return "insertstudent";
		
	}
	
	@PostMapping("/insertstudent")
	public ModelAndView insertstudent(@ModelAttribute Student s)
	{
		boolean status=sservice.insertdata(s);
		return new ModelAndView("redirect:/student/showstudent");
	}
}
