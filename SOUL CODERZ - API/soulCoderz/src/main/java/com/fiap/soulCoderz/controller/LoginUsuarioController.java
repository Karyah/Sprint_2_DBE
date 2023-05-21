package com.fiap.soulCoderz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.soulCoderz.dto.usuario.DadosLoginUsuario;
import com.fiap.soulCoderz.entity.Usuario;
import com.fiap.soulCoderz.repository.UsuarioRepository;

@RestController
@RequestMapping("/login")
public class LoginUsuarioController {
	
	@Autowired
	public UsuarioRepository repository;
	
	@PostMapping
	@Transactional
	public boolean logar(DadosLoginUsuario dados) {
		Usuario usuario = repository.findReferenceByNomeUsuario(dados.nome());
		boolean isTrue = usuario.logar(dados);
		return isTrue;
	}
}
