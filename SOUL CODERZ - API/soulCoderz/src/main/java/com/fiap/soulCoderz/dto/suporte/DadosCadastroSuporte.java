package com.fiap.soulCoderz.dto.suporte;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroSuporte(
		@NotBlank
		Long id,
		
		@NotBlank
		String nomeRequisicaoSup,
		@NotBlank
		String emailRequisicaoSup,
		@NotBlank
		boolean solucionado) {

}
