package com.amin.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		String result = "Yo! " + name.toUpperCase();
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
//		String name = request.getParameter("studentName");
		String result = "Hey My Friend v3! " + name.toUpperCase();
		model.addAttribute("message", result);
		return "helloworld";
	}
}
