package br.com.k19.testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaRemoveNoComeco {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		long tempo = TestaRemoveNoComeco.removeNoComeco(arrayList);
		System.out.println("ArrayList: " + tempo + "ms");
		
		tempo = TestaRemoveNoComeco.removeNoComeco(linkedList);
		System.out.println("LinkedList: " + tempo + "ms");
	}
	
	public static long removeNoComeco(List lista) {
		int size = 100000;
		
		for (int i = 0; i < size; i++) {
			lista.add(i);
		}
		
		System.out.println(lista.size());
		
		long inicio = System.currentTimeMillis();
		
		lista.remove(0);
		
		long fim = System.currentTimeMillis();
		
		System.out.println(lista.size());
		
		return fim - inicio;
	}
}
