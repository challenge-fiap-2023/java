package br.com.fiap.beans;

import java.util.Date;

public class Cliente {
	
	private static final boolean Boolean = false;
	//Variaveis
	private int clienteId;
	private boolean tipoCliente;
	private String email;
	private int telefone;
	private int celular;
	private int senha;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public Cliente() {
		super();
	}
	
	//Metodo Construtor Cheio
	public Cliente(int clienteId, boolean tipoCliente, String email, int telefone, int celular, int senha,
			Date criadoEm, Date atualizadoEm, Date deletadoEm) {
		super();
		this.clienteId = clienteId;
		this.tipoCliente = tipoCliente;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.senha = senha;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters 
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public boolean getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String string ) {
		this.tipoCliente = Boolean;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int i) {
		this.telefone = i;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int i) {
		this.celular = i;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int i) {
		this.senha = i;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	public Date getAtualizadoEm() {
		return atualizadoEm;
	}
	public void setAtualizadoEm(Date atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}
	public Date getDeletadoEm() {
		return deletadoEm;
	}
	public void setDeletadoEm(Date deletadoEm) {
		this.deletadoEm = deletadoEm;
	}
	
	

}
