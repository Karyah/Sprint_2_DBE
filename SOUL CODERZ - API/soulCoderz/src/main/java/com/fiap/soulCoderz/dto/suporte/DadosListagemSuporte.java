package com.fiap.soulCoderz.dto.suporte;

import com.fiap.soulCoderz.entity.Suporte;

public record DadosListagemSuporte(
		String nomeRequisicaoSup,
		String emailRequisicaoSup,
		boolean solucionado) {
	public DadosListagemSuporte(Suporte suporte) {
		this(suporte.getNomeRequisicaoSup(),
			suporte.getEmailRequisicaoSup(),
			suporte.isSolucionado());
	}

}
