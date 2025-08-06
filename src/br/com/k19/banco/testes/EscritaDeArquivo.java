package br.com.k19.banco.testes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class EscritaDeArquivo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream arquivo = new FileOutputStream("saida.txt");
		PrintStream printStream = new PrintStream(arquivo);
		
		printStream.println("Alisson");
		printStream.println("Patrício");
		printStream.println("Gomes");
		printStream.println("de");
		printStream.println("Freitas");
		
		printStream.close();
		
	}
}
