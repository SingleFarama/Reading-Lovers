package com.project.readinglovers.entity;

public class Contas {
	
	private long id;
	private String nome;
	private String email;
	private String senha;
	private String apelido;
	private long numero;
	
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	
	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}
	
	public String getApelido() {return apelido;}
	public void setApelido(String apelido) {this.apelido = apelido;}
	
	public long getNumero() {return numero;}
	public void setNumero(long numero) {this.numero = numero;}

}
