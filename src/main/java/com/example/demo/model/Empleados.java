package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class

public class Empleados {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	/*
	 La anotacióon Column, nos  sirve para añadir mas caracteristicas o
	 espedificar a l ahora de crear la base de datos con hibernate
	 por ejemplo nullable = false se agrega para establecer que ese
	 elemento de la columna no debe de ser null
	 No obstante lenght = 45 nos define la longitud del atributo de la tabla.
	 Observación: Solo se usa la anotacione lenght cuando el 
	 atributo de la clase es String.
	*/
	
	@Column(nullable = false, length = 45)
	private String nombre;
	
	@Column(nullable = false, length = 45)
	private String apellidoPaterno;
	
	@Column(nullable = false, length = 45)
	private String apellidoMaterno;
	
	@Column(nullable = false, length = 45)
	private String rfc;
	
	@Column(nullable = false, length = 45)
	private String estadoCivil;
	
	@Column(nullable = false, length = 45)
	private String sexo;

	//Constructores 
	public Empleados() {}
	public Empleados(Integer id, String nombre, String apellidoPaterno,
					String apellidoMaterno, String rfc, 
					String estadoCivil,String sexo
					) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rfc = rfc;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
