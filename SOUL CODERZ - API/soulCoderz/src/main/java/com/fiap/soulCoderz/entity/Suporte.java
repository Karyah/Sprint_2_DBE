package com.fiap.soulCoderz.entity;

import com.fiap.soulCoderz.dto.suporte.DadosCadastroSuporte;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Suporte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeRequisicaoSup;
	
	private String emailRequisicaoSup;
	
	private boolean solucionado;

	public Suporte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suporte(DadosCadastroSuporte dados) {
		super();
		this.id = dados.id();
		this.nomeRequisicaoSup = dados.nomeRequisicaoSup();
		this.emailRequisicaoSup = dados.emailRequisicaoSup();
		this.solucionado = dados.solucionado();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeRequisicaoSup() {
		return nomeRequisicaoSup;
	}

	public void setNomeRequisicaoSup(String nomeRequisicaoSup) {
		this.nomeRequisicaoSup = nomeRequisicaoSup;
	}

	public String getEmailRequisicaoSup() {
		return emailRequisicaoSup;
	}

	public void setEmailRequisicaoSup(String emailRequisicaoSup) {
		this.emailRequisicaoSup = emailRequisicaoSup;
	}

	public boolean isSolucionado() {
		return solucionado;
	}

	public void setSolucionado(boolean solucionado) {
		this.solucionado = solucionado;
	}
	
	
	
}
