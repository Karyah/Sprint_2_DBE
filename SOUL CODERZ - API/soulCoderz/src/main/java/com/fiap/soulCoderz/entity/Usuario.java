package com.fiap.soulCoderz.entity;

import com.fiap.soulCoderz.dto.usuario.DadosCadastroUsuario;
import com.fiap.soulCoderz.dto.usuario.DadosLoginUsuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	
	private String nomeUsuario;
	
	private String emailUsuario;
	
	private String senhaUsuario;
	
	private int telefoneUsuario;
	
	private boolean ativoUsuario;
	
	private Empresa empresa;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(DadosCadastroUsuario dados) {
		super();
		this.nomeUsuario = dados.nomeUsuario();
		this.emailUsuario = dados.emailUsuario();
		this.senhaUsuario = dados.senhaUsuario();
		this.telefoneUsuario = dados.telefoneUsuario();
		this.ativoUsuario = true;

	}
	
	public void atualizarInformacoes() {
		// TODO Auto-generated method stub
		
	} 
	
	public void desativar() {
		this.ativoUsuario = false;
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public int getTelefoneUsuario() {
		return telefoneUsuario;
	}

	public void setTelefoneUsuario(int telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	public boolean isAtivoUsuario() {
		return ativoUsuario;
	}

	public void setAtivoUsuario(boolean ativoUsuario) {
		this.ativoUsuario = ativoUsuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public boolean logar(DadosLoginUsuario dados) {
		if (dados.nome().equals(this.nomeUsuario) && dados.senha().equals(this.senhaUsuario)){
			return true;
		}
		return false;
	}
	
	
}
