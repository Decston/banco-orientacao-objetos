package br.com.k19.testes;

public class TarefaExibeMensagens implements Runnable {
	
	private String msg;
	
	public TarefaExibeMensagens(String msg) {
		this.msg = msg;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " : " + this.msg);
			
			if(i % 10 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
					// TODO: handle exception
				}
			}
		}
	}
	
}
