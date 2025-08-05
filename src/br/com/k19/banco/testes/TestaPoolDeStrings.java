package br.com.k19.banco.testes;

public class TestaPoolDeStrings {
	public static void main(String[] args) {
		
		String nome1 = "Alisson Patrício";
		String nome2 = "Alisson Patrício";
		
		//exibe true
		System.out.println(nome1 == nome2);
		//exibe true
		System.out.println(nome1.equals(nome2));
		
		String nome3 = new String("Alisson Patrício");
		String nome4 = new String("Alisson Patrício");
		
		//exibe false
		System.out.println(nome3 == nome4);
		//exibe true
		System.out.println(nome3.equals(nome4));
		
		System.out.println(nome1 == nome3);
		System.out.println(nome2.equals(nome4));
		
	}
}
