
public class TestaConta {
	public static void main(String[] args) {
		Agencia a = new Agencia(123);
		
		Conta c1 = new Conta(1234, a);
		
		Conta c2 = new Conta(5678, a);
		
		System.out.println("Dados da primeira conta");
		System.out.println("Número: " + c1.getNumero());
		c1.consultaSaldo();
		System.out.println("Limite: " + c1.getLimite());
		
		System.out.println("--------------------------");
		
		System.out.println("Dados da segunda conta");
		c2.consultaSaldo();
		System.out.println("Limite: " + c2.getLimite());
	}
}
