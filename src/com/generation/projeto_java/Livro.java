package com.generation.projeto_java;

public class Livro extends Exemplar{

	public Livro(String exemplar, int numCadastro) {
		super(exemplar, numCadastro);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void titulo() {
		System.out.println("Voc� � Funcion�rio da Biblioteca pa�s das Maravilhas ");
	}

}