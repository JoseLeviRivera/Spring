package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Beneficiarios;

public interface BeneficiarioRepository extends CrudRepository<Beneficiarios, Integer>{}
