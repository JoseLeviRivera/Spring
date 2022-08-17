package com.example.demo.controller;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.interfaces.EmpleadoRepository;
import com.example.demo.model.Empleados;

/*
 * Verbos: 
 * GET = Consultar,
 * POST = agregar,
 * PUT = actualizar por completo un registro por completo es parecido a realizar un update en una base de datos
 * PATCH = Es similar al put pues permite actualizar un registro existente, es usado para actualizar
 * 			un fragmento del registro
 * DELETE = Este metodo se utiliza para eliminar registros existentes es similar al delete de una bd
 * HEAD = Este metodo se utiliza para obtener informacion de un determinado recurso.Este método se utiliza a 
 * 		 menudo para probar la validez de los enlaces de hipertexto, la accesibilidad y las modificaciones recientes.
 * */
// La anotacion @Controller significa que la clase es un Controller
// En el caso de @RequestMapping la aplicacion iniciara despues de /demo 
// @Autowired Esto significa que obtendra la llamada del bean EmpladoRepository
// El cual es autogenerado por spring, lo usaremos  para manejar los datos

@Controller
@RequestMapping(path = "/demo")
public class EmpleadoController {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	
	@GetMapping(path = "/home")
	public @ResponseBody String home() {
		return "Bienvenido a Spring";
	}

	@PostMapping(path = "/addEmpleado")
	public @ResponseBody String addNewEmpleado(@RequestParam Integer id, @RequestParam String nombre,
			@RequestParam String apellidoPaterno, @RequestParam String apellidoMaterno, @RequestParam String rfc,
			@RequestParam String estadoCivil, @RequestParam String sexo) {
		empleadoRepository.save(new Empleados(id, nombre, apellidoPaterno, apellidoMaterno, rfc, estadoCivil, sexo));
		return "Saved";
	}

	@GetMapping(path = "/allEmpleados")
	public @ResponseBody Iterable<Empleados> getAllEmpleados() {
		return this.empleadoRepository.findAll();
	}

	@GetMapping(path = "/queryEmpleado")
	public @ResponseBody Optional<Empleados> getEmpleado(@RequestParam Integer id) {
		return this.empleadoRepository.findById(id);
	}

	@DeleteMapping(path = "/deleteEmpleado")
	public @ResponseBody String deleteEmplado(@RequestParam Integer id) {
		if (this.empleadoRepository.existsById(id)) {
			this.empleadoRepository.deleteById(id);
			return "deleted successfully";
		}
		return "deleted failed";
	}

	@PatchMapping(path = "/updateEmplado")
	public @ResponseBody String updateEmpleado(@RequestParam Integer id, @RequestParam String nombre,
			@RequestParam String apellidoPaterno, @RequestParam String apellidoMaterno, @RequestParam String rfc,
			@RequestParam String estadoCivil, @RequestParam String sexo) {
		if (this.empleadoRepository.existsById(id)) {
			empleadoRepository
					.save(new Empleados(id, nombre, apellidoPaterno, apellidoMaterno, rfc, estadoCivil, sexo));
			return "updated";
		}
		return "failed update";
	}

}
