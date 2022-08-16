package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Empleados;

//La inteface que implementa de la interface CrudRepository by Spring en los Beans
//Referencia del Crud Create, Read, Update, Delete
public interface EmpleadoRepository extends CrudRepository<Empleados,Integer>{ }
