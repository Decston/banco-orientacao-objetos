package br.com.k19.banco.testes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ArquivoParaArquivo {
	public static void main(String[] args) throws IOException {
		
		InputStream arquivoDeEntrada = new FileInputStream("nomeCompleto.txt");
		Scanner scanner = new Scanner(arquivoDeEntrada);
		
		FileOutputStream arquivo = new FileOutputStream("primeiroNome.txt");
		PrintStream printStream = new PrintStream(arquivo);
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			printStream.println(linha);
		}
		
		printStream.println("Copiado!");
		printStream.close();
		scanner.close();
		
	}
}
