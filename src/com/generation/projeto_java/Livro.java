package com.generation.projeto_java;


public class Livro extends Exemplar{

	public Livro(String exemplar, int numCadastro) {
		super(exemplar, numCadastro);
		
	}
	
	@Override
	public void titulo() {
		System.out.println("Você é Funcionário da Biblioteca País das Maravilhas ");
	}

}