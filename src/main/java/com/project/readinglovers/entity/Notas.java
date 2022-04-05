package com.project.readinglovers.entity;

public class Notas {
	
	private long id;
	private String texto;
	private String nome;
	private boolean pinçado;
	
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	
	public String getTexto() {return texto;}
	public void setTexto(String texto) {this.texto = texto;}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	public boolean isPinçado() {return pinçado;}
	public void setPinçado(boolean pinçado) {this.pinçado = pinçado;}

}
