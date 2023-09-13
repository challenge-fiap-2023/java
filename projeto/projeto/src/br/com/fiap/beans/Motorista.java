package br.com.fiap.beans;

import java.util.Date;

public class Motorista {

	//Variaveis
	private int motoristaId;
	private String nome;
	private String cpf;
	private String rg;
	private String cnh;
	private Date dataNascimento;
	private String telefone;
	private String email;
	private String celular;
	private String foto;
	private Date criadoEm;
	private Date atualizadoEm;
	private Date deletadoEm;
	
	//Metodo Construtor Vazio
	public Motorista() {
		super();
	}
	
	//Metodo Construtor Cheio
	public Motorista(int motoristaId, String nome, String cpf, String rg, String cnh, Date dataNascimento,
			String telefone, String email, String celular, String foto, Date criadoEm, Date atualizadoEm,
			Date deletadoEm) {
		super();
		this.motoristaId = motoristaId;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.celular = celular;
		this.foto = foto;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.deletadoEm = deletadoEm;
	}
	
	//Setter e Getters
	public int getMotoristaId() {
		return motoristaId;
	}
	public void setMotoristaId(int motoristaId) {
		this.motoristaId = motoristaId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
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
