package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		Produto oProduto = new Produto("Bala Juquinha", 0.35);
		
		System.out.println("A bala que eu gosto é " + oProduto.getNome() + " e custa " + oProduto.getPreco());
	}
}
