package br.com.k19.banco.testes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TecladoParaArquivo {
	public static void main(String[] args) throws IOException {
		
		InputStream teclado = System.in;
		Scanner scanner = new Scanner(teclado);
		
		FileOutputStream arquivo = new FileOutputStream("textoTeclado.txt");
		PrintStream printStream = new PrintStream(arquivo);
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			printStream.println(linha);
		}
		
		printStream.close();
		scanner.close();
		
	}
}
