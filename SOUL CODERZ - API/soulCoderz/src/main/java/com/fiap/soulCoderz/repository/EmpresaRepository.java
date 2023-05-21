package com.fiap.soulCoderz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.soulCoderz.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
}
