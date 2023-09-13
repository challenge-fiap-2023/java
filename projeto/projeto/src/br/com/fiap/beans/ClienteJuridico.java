package br.com.fiap.beans;

import java.util.Date;

public class ClienteJuridico {
	
	//Variaveis
	private Cliente cliente;
	private int clienteJuridicoId;
	private String razaoSocial;
	private String cnpj;
	private String nomeFantansia;
	private String inscricaoEstadual;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	
	//Metodo Construtor Vazio
	public ClienteJuridico() {
		super();
	}
	
	//Metodo Construtor Cheio
	public ClienteJuridico(Cliente cliente, int clienteJuridicoId, String razaoSocial, String cnpj,
			String nomeFantansia, String inscricaoEstadual, Date criadoEm, Date atualizadoEm, Date deletadoEm) {
		super();
		this.cliente = cliente;
		this.clienteJuridicoId = clienteJuridicoId;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantansia = nomeFantansia;
		this.inscricaoEstadual = inscricaoEstadual;
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
	public int getClienteJuridicoId() {
		return clienteJuridicoId;
	}
	public void setClienteJuridicoId(int clienteJuridicoId) {
		this.clienteJuridicoId = clienteJuridicoId;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantansia() {
		return nomeFantansia;
	}
	public void setNomeFantansia(String nomeFantansia) {
		this.nomeFantansia = nomeFantansia;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
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
