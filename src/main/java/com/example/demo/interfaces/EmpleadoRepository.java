package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Empleados;

public interface EmpleadoRepository extends CrudRepository<Empleados, Integer> {
}
