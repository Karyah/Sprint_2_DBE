package com.fiap.soulCoderz.entity;

import com.fiap.soulCoderz.dto.feedback.DadosCadastroFeedback;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFeedback;
	
	private String nomeFeedback;
	
	private String tipoFeedback;
	
	private boolean ativoFeedback;
	
	private Empresa empresa;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(DadosCadastroFeedback dados) {
		super();
		this.ativoFeedback = true;
		this.idFeedback = dados.idFeedback();
		this.nomeFeedback = dados.nomeFeedback();
		this.tipoFeedback = dados.nomeFeedback();
	}

	public Long getIdFeedback() {
		return idFeedback;
	}

	public void setIdFeedback(Long idFeedback) {
		this.idFeedback = idFeedback;
	}

	public String getNomeFeedback() {
		return nomeFeedback;
	}

	public void setNomeFeedback(String nomeFeedback) {
		this.nomeFeedback = nomeFeedback;
	}

	public String getTipoFeedback() {
		return tipoFeedback;
	}

	public void setTipoFeedback(String tipoFeedback) {
		this.tipoFeedback = tipoFeedback;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public boolean isAtivoFeedback() {
		return ativoFeedback;
	}

	public void setAtivoFeedback(boolean ativoFeedback) {
		this.ativoFeedback = ativoFeedback;
	} 
	
	
	
}
