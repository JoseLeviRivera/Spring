package com.example.demo.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Empleados {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

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

	@OneToMany
	private Collection<Beneficiarios> beneficiarios;
	
	public Empleados() {
	}

	public Empleados(Integer id, String nombre, String apellidoPaterno, String apellidoMaterno, String rfc,
			String estadoCivil, String sexo) {
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
	
	//Getter y setter of collection
	public Collection<Beneficiarios> getBeneficiarios() {
		return beneficiarios;
	}

	public void setBeneficiarios(Collection<Beneficiarios> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}
}
