package br.com.fiap.beans;

import java.util.Date;

public class Apolices {
	
	//Variaveis
	private Chamados chamados;
	private int apolicesId;
	private String numeroApolice;
	private double valorCobertura;
	private Date periodoInicial;
	private Date periodoFinal;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public Apolices() {
		super();
	}
	
	//Metodo Construtor Cheio
	public Apolices(Chamados chamados, int apolicesId, String numeroApolice, double valorCobertura, Date periodoInicial,
			Date periodoFinal, Date criadoEm, Date atualizadoEm, Date deletadoEm) {
		super();
		this.chamados = chamados;
		this.apolicesId = apolicesId;
		this.numeroApolice = numeroApolice;
		this.valorCobertura = valorCobertura;
		this.periodoInicial = periodoInicial;
		this.periodoFinal = periodoFinal;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters 
	public Chamados getChamados() {
		return chamados;
	}
	public void setChamados(Chamados chamados) {
		this.chamados = chamados;
	}
	public int getApolicesId() {
		return apolicesId;
	}
	public void setApolicesId(int apolicesId) {
		this.apolicesId = apolicesId;
	}
	public String getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(String numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	public double getValorCobertura() {
		return valorCobertura;
	}
	public void setValorCobertura(double valorCobertura) {
		this.valorCobertura = valorCobertura;
	}
	public Date getPeriodoInicial() {
		return periodoInicial;
	}
	public void setPeriodoInicial(Date periodoInicial) {
		this.periodoInicial = periodoInicial;
	}
	public Date getPeriodoFinal() {
		return periodoFinal;
	}
	public void setPeriodoFinal(Date periodoFinal) {
		this.periodoFinal = periodoFinal;
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
