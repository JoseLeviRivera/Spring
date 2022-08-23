package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.interfaces.BeneficiarioRepository;
import com.example.demo.interfaces.EmpleadoRepository;
import com.example.demo.model.Beneficiarios;
import com.example.demo.model.Empleados;

@Controller
@RequestMapping(path = "/Beneficiarios")
public class BeneficiariosController {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private BeneficiarioRepository beneficiarioRepository;
	
	@GetMapping(path = "/home")
	public @ResponseBody String home() {
		return "API de Beneficiarios";
	}
}
