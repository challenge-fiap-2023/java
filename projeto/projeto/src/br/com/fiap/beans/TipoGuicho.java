package br.com.fiap.beans;

import java.util.Date;

public class TipoGuicho {
	
	//Variaveis
	private int tipoGuinchoId;
	private String nome;
	private double capacidadeCarga;
	private double alturaMaxElevacao;
	private double comprimentoMaxElevacao;
	private double velocidadeElevacao;
	private int numeroCabos;
	private double peso;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public TipoGuicho() {
		super();
	}
	
	//Metodo Construtor Cheio
	public TipoGuicho(int tipoGuinchoId, String nome, double capacidadeCarga, double alturaMaxElevacao,
			double comprimentoMaxElevacao, double velocidadeElevacao, int numeroCabos, double peso, Date criadoEm,
			Date atualizadoEm, Date deletadoEm) {
		super();
		this.tipoGuinchoId = tipoGuinchoId;
		this.nome = nome;
		this.capacidadeCarga = capacidadeCarga;
		this.alturaMaxElevacao = alturaMaxElevacao;
		this.comprimentoMaxElevacao = comprimentoMaxElevacao;
		this.velocidadeElevacao = velocidadeElevacao;
		this.numeroCabos = numeroCabos;
		this.peso = peso;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters 
	public int getTipoGuinchoId() {
		return tipoGuinchoId;
	}
	public void setTipoGuinchoId(int tipoGuinchoId) {
		this.tipoGuinchoId = tipoGuinchoId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public double getAlturaMaxElevacao() {
		return alturaMaxElevacao;
	}
	public void setAlturaMaxElevacao(double alturaMaxElevacao) {
		this.alturaMaxElevacao = alturaMaxElevacao;
	}
	public double getComprimentoMaxElevacao() {
		return comprimentoMaxElevacao;
	}
	public void setComprimentoMaxElevacao(double comprimentoMaxElevacao) {
		this.comprimentoMaxElevacao = comprimentoMaxElevacao;
	}
	public double getVelocidadeElevacao() {
		return velocidadeElevacao;
	}
	public void setVelocidadeElevacao(double velocidadeElevacao) {
		this.velocidadeElevacao = velocidadeElevacao;
	}
	public int getNumeroCabos() {
		return numeroCabos;
	}
	public void setNumeroCabos(int numeroCabos) {
		this.numeroCabos = numeroCabos;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
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
