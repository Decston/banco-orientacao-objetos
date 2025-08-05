package br.com.k19.banco.testes;

public class TestaImutabilidade {
	public static void main(String[] args) {
		
		String nome = "Alisson Patrício";
		
		String nomeAlterado = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(nomeAlterado);
			
	}
}
