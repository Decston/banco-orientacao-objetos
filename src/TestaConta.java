
public class TestaConta {
	public static void main(String[] args) {
		Agencia a = new Agencia(123);
		
		//Conta c1 = new Conta(1234, a);
		Conta c1 = new ContaCorrente();
		c1.setNumero(1234);
		c1.setAgencia(a);
		
		//Conta c2 = new Conta(5678, a);
		Conta c2 = new ContaPoupanca();
		c2.setNumero(5678);
		c2.setAgencia(a);
		
		System.out.println("Dados da primeira conta");
		System.out.println("Número: " + c1.getNumero());
		c1.consultaSaldo();
		System.out.println("Limite: " + c1.getLimite());
		c1.imprimeExtratoDetalhado();
		
		System.out.println("--------------------------");
		
		System.out.println("Dados da segunda conta");
		System.out.println("Número: " + c2.getNumero());
		c2.consultaSaldo();
		System.out.println("Limite: " + c2.getLimite());
		c2.imprimeExtratoDetalhado();
		
	}
}
