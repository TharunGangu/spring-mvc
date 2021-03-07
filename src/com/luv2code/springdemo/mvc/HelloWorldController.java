package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//Need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	
	//Add new controller and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		
		//Read data from form
		String theName = request.getParameter("studentName");
		
		//Convert to uppercase
		theName = theName.toUpperCase();
		
		//add message to name
		theName = "Yo!!" + theName;
		
		//add message to model
		model.addAttribute("message", theName);
		
		return "helloWorld";
	}

	//Add new controller and add data to model
		@RequestMapping("/processFormVersionThree")
		public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
			
			
			//Convert to uppercase
			theName = theName.toUpperCase();
			
			//add message to name
			theName = "Yo!!" + theName;
			
			//add message to model
			model.addAttribute("message", theName);
			
			return "helloWorld";
		}

}
