package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Beneficiarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Beneficiario;

	@Column(nullable = false, length = 45)
	private String nombre;

	@Column(nullable = false, length = 45)
	private String apellidoPaterno;

	@Column(nullable = false, length = 45)
	private String apellidoMaterno;

	@Column(nullable = false, length = 3)
	private String sexo;
	
	@Column(nullable = false, length = 3)
	private String edad;
	

	public Beneficiarios(Integer id_Beneficiario, String nombre, String apellidoPaterno, String apellidoMaterno,
			String sexo, String edad) {
		super();
		this.id_Beneficiario = id_Beneficiario;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
		this.edad = edad;
	}

	public Beneficiarios(String nombre, String apellidoPaterno, String apellidoMaterno, String sexo, String edad
			) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	
}
