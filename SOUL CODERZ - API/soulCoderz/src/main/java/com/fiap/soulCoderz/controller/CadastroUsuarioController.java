package com.fiap.soulCoderz.controller;

import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.soulCoderz.dto.usuario.DadosCadastroUsuario;
import com.fiap.soulCoderz.entity.Empresa;
import com.fiap.soulCoderz.entity.Usuario;
import com.fiap.soulCoderz.repository.EmpresaRepository;
import com.fiap.soulCoderz.repository.UsuarioRepository;

@RestController
@RequestMapping("/cadastro")
public class CadastroUsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private EmpresaRepository empRepository;
	
	@PostMapping
	@Transactional
	public void post(DadosCadastroUsuario dados) {
		Optional<Empresa> optionalEmp = empRepository.findById(dados.idEmpresa());
		
		Empresa empresa = optionalEmp.get();

		Usuario usuario = new Usuario(dados);

		usuario.setEmpresa(empresa);		

		HashSet<Usuario> usuarios = empresa.getUsuarios();
		
		usuarios.add(usuario);	

		usuario.getEmpresa().setUsuarios(usuarios);

		repository.save(usuario);
	}
}
