package com.generation.projeto_java;

public abstract class Exemplar {
	String exemplar;
	int numCadastro;
	
	
	public Exemplar (String exemplar, int numCadastro) {
		super();
		this.exemplar = exemplar;
		this.numCadastro = numCadastro;
	}
	public abstract void titulo();
	public String getExemplar() {
		return exemplar;
	}
	public void setExemplar(String exemplar) {
		this.exemplar = exemplar;
	}
	public int getNumCadastro() {
		return numCadastro;
	}
	public void setNumCadastro(int numCadastro) {
		this.numCadastro = numCadastro;
	}
	public String toString() {
		return this.exemplar + " | n� de s�rie: " + this.numCadastro;			
	}
}	