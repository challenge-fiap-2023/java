package br.com.fiap.beans;

import java.util.Date;

public class Chamados {
	
	//Variaveis
	private GuinchoMotorista guinchoMotorista;
	private Cliente clientes;
	private int chamadoId;
	private int status;
	private String descricao;
	private String localizacao;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public Chamados() {
		super();
	}
	
	//Metodo Construtor Cheio
	public Chamados(GuinchoMotorista guinchoMotorista, Cliente clientes, int chamadoId, int status, String descricao,
			String localizacao, Date criadoEm, Date atualizadoEm, Date deletadoEm) {
		super();
		this.guinchoMotorista = guinchoMotorista;
		this.clientes = clientes;
		this.chamadoId = chamadoId;
		this.status = status;
		this.descricao = descricao;
		this.localizacao = localizacao;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Metodo Construtor só com atributos de referência
	public Chamados(int chamadoId, int status, String descricao, String localizacao, Date criadoEm, Date atualizadoEm,
			Date deletadoEm) {
		super();
		this.chamadoId = chamadoId;
		this.status = status;
		this.descricao = descricao;
		this.localizacao = localizacao;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters
	public GuinchoMotorista getGuinchoMotorista() {
		return guinchoMotorista;
	}

	public void setGuinchoMotorista(GuinchoMotorista guinchoMotorista) {
		this.guinchoMotorista = guinchoMotorista;
	}
	public Cliente getClientes() {
		return clientes;
	}
	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
	public int getChamadoId() {
		return chamadoId;
	}
	public void setChamadoId(int chamadoId) {
		this.chamadoId = chamadoId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
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
