package br.com.fiap.beans;

import java.util.Date;
import java.time.Year;

public class ClienteVeiculo {
	
	//Variaveis
	private Apolices apolices;
	private int clienteVeiculoId;
	private String marca;
	private String modelo;
	private Year ano;
	private String chassi;
	private double capacidadeCarga;
	private double pesoBrutoTotal;
	private int numeroEixos;
	private String placa;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public ClienteVeiculo() {
		super();
	
	}
	//Metodo Construtor Cheio
	public ClienteVeiculo(Apolices apolices, int clienteVeiculoId, String marca, String modelo, Year ano, String chassi,
			double capacidadeCarga, double pesoBrutoTotal, int numeroEixos, String placa, Date criadoEm,
			Date atualizadoEm, Date deletadoEm) {
		super();
		this.apolices = apolices;
		this.clienteVeiculoId = clienteVeiculoId;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.chassi = chassi;
		this.capacidadeCarga = capacidadeCarga;
		this.pesoBrutoTotal = pesoBrutoTotal;
		this.numeroEixos = numeroEixos;
		this.placa = placa;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setters e Getters
	public Apolices getApolices() {
		return apolices;
	}
	public void setApolices(Apolices apolices) {
		this.apolices = apolices;
	}
	public int getClienteVeiculoId() {
		return clienteVeiculoId;
	}
	public void setClienteVeiculoId(int clienteVeiculoId) {
		this.clienteVeiculoId = clienteVeiculoId;
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
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public double getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}
	public void setPesoBrutoTotal(double pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}
	public int getNumeroEixos() {
		return numeroEixos;
	}
	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
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
