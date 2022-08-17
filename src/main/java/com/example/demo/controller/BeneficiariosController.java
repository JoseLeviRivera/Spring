package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/Beneficiarios")
public class BeneficiariosController {
	
	@GetMapping(path = "/home")
	public @ResponseBody String home() {
		return "API de Beneficiarios";
	}
}
