package com.tutorial.springwebmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.springwebmvc.model.Employee;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData (Model m) {
		m.addAttribute("name", "Nani");
	}
	
	@RequestMapping("/")
	public String home() 
	{	
		return "Index";
	}
	
	@RequestMapping("ServletRequest") 
	public String ServletRequest(HttpServletRequest request) 
	 {
		  String a = request.getParameter("Eid"); 
		  String b = request.getParameter("Ename");
		  String result = a + b ; 
		  HttpSession session = request.getSession();
		  session.setAttribute("result", result); 
		  return "Result"; 
	 }
	 
	 @RequestMapping("ReqParmRequest") 
	 public String ReqParmRequest(@RequestParam("Eid")String a, @RequestParam("Ename")String b,HttpSession session) 
	 {
		  String result = a + b ; 
		  session.setAttribute("result", result); 
		  return "Result"; 
	 }
	 
	 @RequestMapping("M&V_Request") 
	 public ModelAndView Request(@RequestParam("Eid")String a, @RequestParam("Ename")String b) 
	 {
		String result = a + b ; 
		ModelAndView mv = new ModelAndView("Result");
		mv.addObject("result", result);
	    return mv; 
	 }
	 
	 @RequestMapping("Model_Request") 
	 public String ModelRequest(@RequestParam("Eid")String a, @RequestParam("Ename")String b, Model m) 
	 {
		String result = a + b ; 
		m.addAttribute("result", result);
	    return "Result"; 
	 }
	 
	 @RequestMapping("DAO_Model_Request") 
	 public String DAOModelRequest(@RequestParam("Eid")int a, @RequestParam("Ename")String b, Model m) 
	 {
	
		Employee e = new Employee();
		e.setEid(a);
		e.setEname(b);
		m.addAttribute("result", e);
	    return "Result"; 
	 }
	 
	 @RequestMapping("ModelAttribute_Request") 
	 public String ModelAttributeRequest(@ModelAttribute("result") Employee e) 
	  { 
		return "Result"; 
	  }
		 
	 @RequestMapping("DirectObjectRef_Request") 
	 public String direct(Employee e) 
	 {
	    return "Result"; 
	 }	
	 
	 @GetMapping(value="GetMapping")
	 public String get(@ModelAttribute("result") Employee e) 
	  { 
		return "GetMapData"; 
	  }
	 
	 @PostMapping(value="PostMapping")
	 public String post(@ModelAttribute("result") Employee e) 
	  { 
		return "Result"; 
	  }
}
