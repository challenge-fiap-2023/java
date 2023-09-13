package br.com.fiap.beans;

import java.util.Date;

public class ChamadoAvaliacao {
	
	//Variaveis
	private Chamados chamados;
	private int chamadoAvaliacaoId;
	private double nota;
	private String comentario;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public ChamadoAvaliacao() {
		super();
	}
	
	//Metodo Construtor Cheio
	public ChamadoAvaliacao(Chamados chamados, int chamadoAvaliacaoId, double nota, String comentario, Date criadoEm,
			Date atualizadoEm, Date deletadoEm) {
		super();
		this.chamados = chamados;
		this.chamadoAvaliacaoId = chamadoAvaliacaoId;
		this.nota = nota;
		this.comentario = comentario;
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
	public int getChamadoAvaliacaoId() {
		return chamadoAvaliacaoId;
	}
	public void setChamadoAvaliacaoId(int chamadoAvaliacaoId) {
		this.chamadoAvaliacaoId = chamadoAvaliacaoId;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
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
