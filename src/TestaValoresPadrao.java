
public class TestaValoresPadrao {
	public static void main(String[] args) {
		Agencia a = new Agencia(16055);
		//Conta c = new Conta(913979, a);
		ContaCorrente c = new ContaCorrente();
		c.setNumero(913979);
		c.setAgencia(a);
		
		System.out.println("Valores Padrão:");
		System.out.println("Número: " + c.getNumero());
		c.consultaSaldo();
		System.out.println("Limite: " + c.getLimite());
		System.out.println("Agência: " + c.getAgencia().numero);
	}
}
