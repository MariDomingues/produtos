package br.com.alura.maven;

public class Produto {
	
	private final String nome;
	private final double preco;
	
	public Produto(String i_nome, double i_preco) {
		super();
		this.nome = i_nome;
		this.preco = i_preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getPrecoComImposto() { 
	    return preco * 1.10;
	} 
} 