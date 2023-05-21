package com.fiap.soulCoderz.dto.plano;

import com.fiap.soulCoderz.entity.Plano;

public record DadosListagemPlano(
		String nomePlano, int precoPlano, String descricacaoPlano) {
	
	public DadosListagemPlano(Plano plano) {
			this(plano.getNomePlano(),
				plano.getPrecoPlano(),
				plano.getDescricaoPlano());
	}
}
