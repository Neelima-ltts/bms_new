package com.ltts.movieticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.movieticketbooking.service.TicketService;

@Controller
public class TicketController {
	@Autowired
	private TicketService service;
    
	@RequestMapping("/booking")
	public ModelAndView firstMethod() {
		return new ModelAndView("booking");
	}
}
