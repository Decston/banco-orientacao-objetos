package br.com.k19.testes;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(10000);
		
		Socket socket = serverSocket.accept();
		
		System.out.println("Um cliente chegou!");
		
		PrintStream saida = new PrintStream(socket.getOutputStream());
		
		saida.println("Voce se conectou ao servidor da K19!");
        saida.flush(); // força envio imediato

        socket.close();       // fecha conexão com o cliente
        serverSocket.close(); // fecha o servidor
	}
}
