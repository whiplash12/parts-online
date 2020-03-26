package com.a3zones.partsonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title", "Shop all kinds of Machine Equipments");
		mView.addObject("userClicksHome", true);
		return mView;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title", "Contact Us");
		mView.addObject("userClicksContact", true);
		return mView;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title", "About Us");
		mView.addObject("userClicksAbout", true);
		return mView;
	}

}
