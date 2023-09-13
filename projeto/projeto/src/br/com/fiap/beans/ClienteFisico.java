package br.com.fiap.beans;

import java.util.Date;

public class ClienteFisico {
	
	//Variaveis
	private Cliente cliente;   
	private int clienteFisicoId;
	private String nomeCompleto;
	private String cpf;
	private Date dataNascimento;
	private int sexo;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public ClienteFisico() {
		super();
	}
	
	//Metodo Construtor Cheio
	public ClienteFisico(Cliente cliente, int clienteFisicoId, String nomeCompleto, String cpf, Date dataNascimento,
			int sexo, Date criadoEm, Date atualizadoEm, Date deletadoEm) {
		super();
		this.cliente = cliente;
		this.clienteFisicoId = clienteFisicoId;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getClienteFisicoId() {
		return clienteFisicoId;
	}
	public void setClienteFisicoId(int clienteFisicoId) {
		this.clienteFisicoId = clienteFisicoId;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
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
