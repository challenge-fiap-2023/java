package br.com.fiap.beans;

import java.util.Date;

public class TipoVeiculo {
	
	//Variaveis
	private ClienteVeiculo clienteVeiculo;
	private int tipoVeiculoId;
	private String nome;
	private String descricao;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public TipoVeiculo() {
		super();
	}
	
	//Metodo Construtor Cheio
	public TipoVeiculo(ClienteVeiculo clienteVeiculo, int tipoVeiculoId, String nome, String descricao, Date criadoEm,
			Date atualizadoEm, Date deletadoEm) {
		super();
		this.clienteVeiculo = clienteVeiculo;
		this.tipoVeiculoId = tipoVeiculoId;
		this.nome = nome;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters
	public ClienteVeiculo getClienteVeiculo() {
		return clienteVeiculo;
	}
	public void setClienteVeiculo(ClienteVeiculo clienteVeiculo) {
		this.clienteVeiculo = clienteVeiculo;
	}
	public int getTipoVeiculoId() {
		return tipoVeiculoId;
	}
	public void setTipoVeiculoId(int tipoVeiculoId) {
		this.tipoVeiculoId = tipoVeiculoId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
