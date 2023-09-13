package br.com.fiap.beans;

import java.util.Date;

public class GuinchoMotorista {
	
	//Variaveis 
	private Motorista motorista;
	private int guinchoId;
	private int guinchoMotoristaId;
	private int status;
	private String localizacao;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public GuinchoMotorista() {
		super();
	}
	
	//Metodo Construtor Cheio
	public GuinchoMotorista(Motorista motorista, int guinchoId, int guinchoMotoristaId, int status, String localizacao,
			Date criadoEm, Date atualizadoEm, Date deletadoEm) {
		super();
		this.motorista = motorista;
		this.guinchoId = guinchoId;
		this.guinchoMotoristaId = guinchoMotoristaId;
		this.status = status;
		this.localizacao = localizacao;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters 
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public int getGuinchoId() {
		return guinchoId;
	}
	public void setGuinchoId(int guinchoId) {
		this.guinchoId = guinchoId;
	}
	public int getGuinchoMotoristaId() {
		return guinchoMotoristaId;
	}
	public void setGuinchoMotoristaId(int guinchoMotoristaId) {
		this.guinchoMotoristaId = guinchoMotoristaId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
