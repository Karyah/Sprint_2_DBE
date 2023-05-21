package com.fiap.soulCoderz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.soulCoderz.dto.plano.DadosListagemPlano;
import com.fiap.soulCoderz.repository.PlanoRepository;

@RestController
@RequestMapping("/planos")
public class PlanoController {
	
	@Autowired
	public PlanoRepository repository;
	
	@GetMapping
	public Page<DadosListagemPlano> listar(@PageableDefault(size=5, sort= {"precoPlano"}) Pageable paginacao){
		return repository.findAllByDisponivelTrue(paginacao).map(DadosListagemPlano ::new);
	}
	
}


