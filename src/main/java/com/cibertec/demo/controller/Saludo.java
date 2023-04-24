package com.cibertec.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Saludo {
	
	@ResponseBody
	@RequestMapping("/")
	public String hola() {
		return "Hola Mundo";
	}
	
	@RequestMapping("/hola")
	public String holaMundo() {
		return "saludo";
	}
	
	
}
