package com.fiap.soulCoderz.dto.feedback;

import com.fiap.soulCoderz.entity.Feedback;

public record DadosListagemFeedback(
		String nomeFeedback,
		String tipoFeedback) {
	public DadosListagemFeedback(Feedback feedback) {
		this(feedback.getNomeFeedback(), feedback.getTipoFeedback());
	}
}
