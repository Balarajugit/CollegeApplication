package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Contact;
import com.app.model.Home;
import com.app.model.Student;
import com.app.service.impl.ContactServiceImpl;
import com.app.service.impl.HomeServiceImpl;
import com.app.service.impl.StudentServiceImpl;


@Controller
public class CollegeController {
	@Autowired
	private HomeServiceImpl homeService;
	@Autowired
	private StudentServiceImpl studentService;
	@Autowired
	private ContactServiceImpl contactService;
	
	@RequestMapping("/show")
	public String display() {
		return "HomeDeails";
	}
	@RequestMapping("/studentPage")
	public String showRegisterPage(Model map) {
		map.addAttribute("student", new Student());
		return "StudentRegister";
	}
	
	@RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
	public String saveStudentDetails(@ModelAttribute Student s,Model map) {
		studentService.saveStudentDetails(s);
		map.addAttribute("msg", "Student Registered sucessfully");
		map.addAttribute("student", new Student());
		return "StudentRegister";
	}
	
	@RequestMapping("/allData")
	public String getAllStudents(Model map) {
		List<Student> s= studentService.getAllStudents();
		map.addAttribute("list",s);
		return "ListOfStudents";
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam Integer id,Model map) {
		studentService.deleteStudent(id);
		map.addAttribute("delete", id+" : student record deleted sucessfully");
		return "redirect:allData";
	}
	
	@RequestMapping("/get")
	public String getStudent(@RequestParam Integer id,Model map) {
		Student student = studentService.getOneStudent(id);
		map.addAttribute("student", student);
		return "UpdateStudent";
	}

	@RequestMapping(value = "/updated",method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute Student s,Model map) {
		studentService.saveStudentDetails(s);
		map.addAttribute("update", s.getId()+" : Record updated sucessfully");
		return "redirect:allData";
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/contact")
	public String contactPage() {
		return "Contact";
	}
	@RequestMapping("/saveCotact")
	public String saveContacts(@ModelAttribute Contact c,Model map) {
		contactService.saveContact(c);
		map.addAttribute("msg", "contact saved sucessfully");
		return "Contact";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/inc")
	public String homepage() {
		return "include";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/conDetails")
	public String GetContactDetails(@RequestParam Integer id,Model map) {
		Contact contact = contactService.getOneContact(id);
		map.addAttribute("con", contact);
		return "ContactDetailsPage";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/showHomePage")
	public String descPage() {
		return "Description";
	}
	
	@RequestMapping(value = "/saveHome",method = RequestMethod.POST)
	public String saveHomePage(@ModelAttribute Home h,Model m) {
		homeService.saveHomeDetails(h);
		m.addAttribute("msg ", "saved sucessfully");
		return "Description";
	}
	@RequestMapping("/getHomeDetails")
	public String getHomeDetails(@RequestParam Integer id,Model map) {
		Home home = homeService.getHomeDetails(id);
		map.addAttribute("home", home);
		return "HomePage";
	}
}
