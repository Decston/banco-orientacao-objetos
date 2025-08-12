package br.com.k19.banco.contas;

public class Conta {
	
	/**
	 * Documentação do atributo numero
	 */
	private int numero;
	
	/**
	 * Documentacao do construtor
	 * 
	 * @param numero
	 * 				documentacao do atributo numero
	 * 
	 * @throws IllegalArgumentException
	 * 				documentacao da situacao que gera a exception
	 * 				IllegalArgumentException
	 */
	public Conta(int numero) {
		if(numero < 0) {
			throw new IllegalArgumentException("número negativo");
		}
		this.numero = numero;
	}
	
	/**
	 * Documentacao do método getNumero
	 * 
	 * @return documentacao do valor de retorno
	 */
	public int getNumero() {
		return numero;
	}
}
