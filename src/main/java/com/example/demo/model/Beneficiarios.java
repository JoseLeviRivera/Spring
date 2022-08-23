package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Beneficiarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Beneficiario")
	private Integer id_Beneficiario ;

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

	@Column(nullable = false, length = 3)
	private int idRelacion;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	//@JoinColumn(name = "id_Empleado")
	private Empleados empleados;

	public Beneficiarios() {
	}

	public Beneficiarios(Integer id_Beneficiario, String nombre, String apellidoPaterno, String apellidoMaterno,
			String sexo, String edad) {
		this.id_Beneficiario = id_Beneficiario;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	public Beneficiarios(String nombre, String apellidoPaterno, String apellidoMaterno, String sexo, String edad) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
		this.edad = edad;
	}

	public Integer getId_Beneficiario() {
		return id_Beneficiario;
	}

	public void setId_Beneficiario(Integer id_Beneficiario) {
		this.id_Beneficiario = id_Beneficiario;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Empleados getEmpleado() {
		return empleados;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleados = empleado;
	}

	public int getIdRelacion() {
		return idRelacion;
	}

	public void setIdRelacion(int idRelacion) {
		this.idRelacion = idRelacion;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Beneficiarios )) return false;
        return this.id_Beneficiario != null && this.id_Beneficiario.equals(((Beneficiarios) o).getId_Beneficiario());
    }
 
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
