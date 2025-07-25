
public class TestaContaEAgencia {
	public static void main(String[] args) {
		Agencia a = new Agencia(16055);
		
		Conta c = new Conta(913979, a);
		
		System.out.println("Dados da Conta");
		System.out.println("Número: " + c.getNumero());
		System.out.println("Limite: " + c.getLimite());
		c.consultaSaldo();
		
		System.out.println("------------------------");
		
		System.out.println("Dados Agencia");
		System.out.println("Número: " + a.numero);
		
		System.out.println("------------------------");
		
		System.out.println("Agência da Conta:");
		System.out.println("Conta Número: " + c.getNumero());
		System.out.println("Agência da Conta: " + c.getAgencia().numero);
		
	}
}
