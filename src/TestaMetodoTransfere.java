
public class TestaMetodoTransfere {
	public static void main(String[] args) {
		Agencia a = new Agencia(16055);
		
		Conta origem = new Conta(913979, a);
		origem.deposita(1000);
		System.out.println("Saldo Conta Origem: ");
		origem.consultaSaldo();
		
		Conta destino = new Conta(989319, a);
		destino.deposita(1000);
		System.out.println("Saldo Conta Destino: ");
		destino.consultaSaldo();
		
		System.out.println("-------------------------------------");
		
		System.out.println("Realizando transferência entre contas:");
		origem.transfere(destino, 500);
		
		System.out.println("-------------------------------------");
		
		System.out.println("Saldo Conta Origem: ");
		origem.consultaSaldo();
		System.out.println("Saldo Conta Destino: ");
		destino.consultaSaldo();
		
	}
}
