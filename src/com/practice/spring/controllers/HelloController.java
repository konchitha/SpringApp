package com.practice.spring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
@Controller
@RequestMapping("/greet")

public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView  Hello(){
		ModelAndView modelAndView =new ModelAndView("HelloPage");
		modelAndView.addObject("welcome","Hi students welcome");
		return modelAndView;
	}
	@RequestMapping("/hi")
	public ModelAndView  Hiworld(){
		ModelAndView modelAndView =new ModelAndView("HelloPage");
		modelAndView.addObject("welcome","Hi ");
		return modelAndView;
	}
	

}
