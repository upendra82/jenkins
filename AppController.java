package com.spring.shipment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/home")
    public ModelAndView home() {
		return index();
    }
    
	@RequestMapping("/about")
	public ModelAndView about() {
		return new ModelAndView("about");
	}
	
	@RequestMapping("/contact") 
	public ModelAndView contact() {
		return new ModelAndView("contact");
	}
}
