package com.fiap.soulCoderz.dto.feedback;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroFeedback(
		@NotBlank
		Long idFeedback,
		@NotBlank
		String nomeFeedback,
		@NotBlank
		String tipoFeedback
		) {

}
