package com.kmk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/displayName")
	public String displayName(HttpServletRequest request, Model mv) {
		mv.addAttribute("name",request.getParameter("name"));
		return "message";
	}
}
