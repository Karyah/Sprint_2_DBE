package com.fiap.soulCoderz.dto.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoUsuario(
		@NotBlank
		Long idUsuario,
		
		String nomeUsuario,
		
		String emailUsuario,
		
		String senhaUsuario,
		
		String telefoneUsuario){

}
