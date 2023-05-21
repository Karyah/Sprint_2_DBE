package com.fiap.soulCoderz.dto.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
		
		@NotBlank
		String nomeUsuario,
		
		@NotBlank
		String emailUsuario,
		
		@NotBlank
		String senhaUsuario,
		
		@NotBlank
		int telefoneUsuario,
		
		@NotBlank
		Long idEmpresa){

}
