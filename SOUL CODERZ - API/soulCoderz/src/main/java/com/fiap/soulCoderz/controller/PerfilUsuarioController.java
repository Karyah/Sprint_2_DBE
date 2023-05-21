package com.fiap.soulCoderz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.soulCoderz.dto.usuario.DadosAtualizacaoUsuario;
import com.fiap.soulCoderz.dto.usuario.DadosListagemUsuario;
import com.fiap.soulCoderz.entity.Usuario;
import com.fiap.soulCoderz.repository.UsuarioRepository;

@RestController
@RequestMapping("/perfil/{id}")
public class PerfilUsuarioController {
	
	@Autowired
	public UsuarioRepository repository;
	
	@GetMapping
	public Page<DadosListagemUsuario> listar(@PageableDefault(sort= {"nome"}) Pageable paginacao){
		return repository.findAllByAtivoUsuarioTrue(paginacao).map(DadosListagemUsuario ::new);
		
	}
	
	@PutMapping
	@Transactional
	public void atualizar(DadosAtualizacaoUsuario dados) {
		Usuario usuario = new Usuario();
		usuario = repository.getReferenceById(dados.idUsuario());
		usuario.atualizarInformacoes();
	}
}
