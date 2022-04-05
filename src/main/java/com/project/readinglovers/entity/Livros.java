package com.project.readinglovers.entity;

public class Livros {
	
	private long id;
	private String titulo;
	private String autor;
	private String dataDeLançamento;
	private String texto;
	private boolean Private;
	private String categoria;
	
	
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	
	public String getAutor() {return autor;}
	public void setAutor(String autor) {this.autor = autor;}
	
	public String getDataDeLançamento() {return dataDeLançamento;}
	public void setDataDeLançamento(String dataDeLançamento) {this.dataDeLançamento = dataDeLançamento;}
	
	public String getTexto() {return texto;}
	public void setTexto(String texto) {this.texto = texto;}
	
	public boolean isPrivate() {return Private;}
	public void setPrivate(boolean private1) {Private = private1;}
	
	public String getCategoria() {return categoria;}
	public void setCategoria(String categoria) {this.categoria = categoria;}
}
