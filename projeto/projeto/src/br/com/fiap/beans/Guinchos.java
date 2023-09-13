package br.com.fiap.beans;

import java.util.Date;
import java.time.Year;

public class Guinchos {

	//Variaveis
	private TipoGuicho tipoguincho;
	private int guinchoId;
	private String marca;
	private String modelo;
	private Year ano;
	private String placa;
	private String cor;
	private String chassi;
	private String renavam;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public Guinchos() {
		super();
	}
	
	//Metodo Construtor Cheio
	public Guinchos(TipoGuicho tipoguincho, int guinchoId, String marca, String modelo, Year ano, String placa,
			String cor, String chassi, String renavam, Date criadoEm, Date atualizadoEm, Date deletadoEm) {
		super();
		this.tipoguincho = tipoguincho;
		this.guinchoId = guinchoId;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.chassi = chassi;
		this.renavam = renavam;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Metodo Construtor só com atributos de referência
	public Guinchos(int guinchoId, String marca, String modelo, Year ano, String placa, String cor, String chassi,
			String renavam, Date criadoEm, Date atualizadoEm, Date deletadoEm) {
		super();
		this.guinchoId = guinchoId;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.chassi = chassi;
		this.renavam = renavam;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters
	public TipoGuicho getTipoguincho() {
		return tipoguincho;
	}

	public void setTipoguincho(TipoGuicho tipoguincho) {
		this.tipoguincho = tipoguincho;
	}
	public int getGuinchoId() {
		return guinchoId;
	}
	public void setGuinchoId(int guinchoId) {
		this.guinchoId = guinchoId;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Year getAno() {
		return ano;
	}
	public void setAno(Year ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
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

