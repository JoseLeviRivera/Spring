package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.interfaces.BeneficiarioRepository;
import com.example.demo.interfaces.EmpleadoRepository;
import com.example.demo.model.Beneficiarios;
import com.example.demo.model.Empleados;

@Controller
@RequestMapping(path = "/Empleados")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Autowired
	private BeneficiarioRepository beneficiarioRepository;
	
	
	@GetMapping(path = "/queryEmpleado/{idEmpleado}")
	public @ResponseBody Optional<Empleados> home(@PathVariable int idEmpleado) {
		return empleadoRepository.findById(idEmpleado);
	}
	
	@GetMapping(path = "/allEmpleados")
	public @ResponseBody Iterable<Empleados> getAllEmpleados() {
		return empleadoRepository.findAll();
	}
	
	@PostMapping(path = "/agregar")
	public @ResponseBody String registrarEmpleado(
			@RequestParam String nombre,
			@RequestParam String apellidoPaterno,
			@RequestParam String apellidoMaterno,
			@RequestParam String rfc,
			@RequestParam String estadoCivil, 
			@RequestParam String sexo
			) {
		Empleados e = new Empleados();
		Beneficiarios b = new Beneficiarios();
		b.setNombre(nombre);
		b.setApellidoPaterno(apellidoPaterno);
		b.setApellidoMaterno(apellidoMaterno);
		b.setSexo(sexo);
		b.setEdad("19");
		
		e.setNombre(nombre);
		e.setApellidoPaterno(apellidoPaterno);
		e.setApellidoMaterno(apellidoMaterno);
		e.setRfc(rfc);
		e.setEstadoCivil(estadoCivil);
		e.setSexo(sexo);
		e.addBeneficiario(b);
	
		empleadoRepository.save(e);
		return "Saved";
	}
	

}
