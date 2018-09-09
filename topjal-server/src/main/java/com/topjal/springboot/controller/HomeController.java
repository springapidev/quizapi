package com.topjal.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mohammad Rajaul Islam
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String home() {
		return "forward:/index.html";
	}

}
