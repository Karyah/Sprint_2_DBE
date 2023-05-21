package com.fiap.soulCoderz.entity;

import java.util.HashSet;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Empresa {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idEmp;
	
	private String nomeEmp;

	private String emailEmp;
	
	private String cnpjEmp;
	
	private int telefoneEmp;
	
	private boolean ativoEmpresa;
	
	private HashSet<Usuario> usuarios;
	
	private Plano planoEmpresa;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(Long id, String nome, String email, String cnpj, int telefone, boolean ativo,
			HashSet<Usuario> usuarios, Plano planoEmpresa) {
		super();
		this.ativoEmpresa = true;
		this.idEmp = id;
		this.nomeEmp = nome;
		this.emailEmp = email;
		this.cnpjEmp = cnpj;
		this.telefoneEmp = telefone;
		this.usuarios = usuarios;
		this.planoEmpresa = planoEmpresa;
	}
	
	public void desativar() {
		this.ativoEmpresa = false;
	}

	public Long getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(Long idEmp) {
		this.idEmp = idEmp;
	}

	public String getNomeEmp() {
		return nomeEmp;
	}

	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}

	public String getEmailEmp() {
		return emailEmp;
	}

	public void setEmailEmp(String emailEmp) {
		this.emailEmp = emailEmp;
	}

	public String getCnpjEmp() {
		return cnpjEmp;
	}

	public void setCnpjEmp(String cnpjEmp) {
		this.cnpjEmp = cnpjEmp;
	}

	public int getTelefoneEmp() {
		return telefoneEmp;
	}

	public void setTelefoneEmp(int telefoneEmp) {
		this.telefoneEmp = telefoneEmp;
	}

	public boolean isAtivoEmpresa() {
		return ativoEmpresa;
	}

	public void setAtivoEmpresa(boolean ativoEmpresa) {
		this.ativoEmpresa = ativoEmpresa;
	}

	public HashSet<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(HashSet<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Plano getPlanoEmpresa() {
		return planoEmpresa;
	}

	public void setPlanoEmpresa(Plano planoEmpresa) {
		this.planoEmpresa = planoEmpresa;
	}
	
}