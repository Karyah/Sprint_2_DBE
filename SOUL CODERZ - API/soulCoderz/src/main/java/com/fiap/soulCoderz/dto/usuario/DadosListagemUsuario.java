package com.fiap.soulCoderz.dto.usuario;

import com.fiap.soulCoderz.entity.Usuario;

public record DadosListagemUsuario(
		String nome, 
		String email, 
		int telefone) {
	
	public DadosListagemUsuario(Usuario usuario) {
		this(usuario.getNomeUsuario(), usuario.getEmailUsuario(), usuario.getTelefoneUsuario());
	}
}
