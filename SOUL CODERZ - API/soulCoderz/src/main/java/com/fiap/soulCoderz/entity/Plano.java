package com.fiap.soulCoderz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlano;
	
	private String nomePlano;
	
	private int precoPlano;
	
	private boolean disponivel;
	
	private String descricaoPlano;

	public Plano() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plano(Long id, String nome, int preco, String descricao) {
		super();
		this.disponivel = true;
		this.idPlano = id;
		this.nomePlano = nome;
		this.precoPlano = preco;
		this.descricaoPlano = descricao;
	}
	
	public void desativar() {
		this.disponivel = false;
	}

	public Long getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(Long idPlano) {
		this.idPlano = idPlano;
	}

	public String getNomePlano() {
		return nomePlano;
	}

	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}

	public int getPrecoPlano() {
		return precoPlano;
	}

	public void setPrecoPlano(int precoPlano) {
		this.precoPlano = precoPlano;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getDescricaoPlano() {
		return descricaoPlano;
	}

	public void setDescricaoPlano(String descricaoPlano) {
		this.descricaoPlano = descricaoPlano;
	}

}
