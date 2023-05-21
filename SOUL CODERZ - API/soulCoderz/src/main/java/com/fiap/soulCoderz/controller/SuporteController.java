package com.fiap.soulCoderz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fiap.soulCoderz.dto.suporte.DadosCadastroSuporte;
import com.fiap.soulCoderz.dto.suporte.DadosListagemSuporte;
import com.fiap.soulCoderz.entity.Suporte;
import com.fiap.soulCoderz.repository.SuporteRepository;

@RestController
@RequestMapping("/suporte")
public class SuporteController {
	
	@Autowired
	private SuporteRepository repository;
	
	@PostMapping
	@Transactional
	public void postar(DadosCadastroSuporte dados) {
		Suporte suporte = new Suporte(dados);
		repository.save(suporte);
	}
	
	@GetMapping
	public Page<DadosListagemSuporte> listar(@PageableDefault(sort= {"solucionado"})Pageable paginacao){
		return repository.findAll(paginacao).map(DadosListagemSuporte :: new);
	}
	
}
