package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		count = (count == null) ? count = 0 : ++count;
		session.setAttribute("count", ++count);
		return "index.jsp"; 
	}
	@RequestMapping("/counter")
	public String counterPage(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("count");
		count = (count == null) ? count = 0 : count;
		model.addAttribute("counter", count);
		return "showCount.jsp";
	}
	@RequestMapping("/bytwo")
	public String byTwo(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		count = (count == null) ? count = 0 : count + 2;
		session.setAttribute("count", count);
		return "byTwo.jsp";
	}
	@RequestMapping("/reset")
	public String resetPage(HttpSession session) {
		session.invalidate();
		return "redirect:/counter";
	}
}
