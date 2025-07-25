
public class TestaMetodosConta {
	public static void main(String[] args) {
		Agencia a = new Agencia(16055);
		
		Conta c = new Conta(1000, a);
		
		System.out.println("Dados Conta");
		System.out.println("Agência Conta: " + c.getAgencia().numero);
		System.out.println("Número Conta: " + c.getNumero());
		System.out.println("Limite: " + c.getLimite());
		c.consultaSaldo();
		
		System.out.println("----------------------------------");
		c.saca(100);
		c.deposita(2000);
		c.imprimeExtrato();
		c.consultaSaldo();
		c.consultaLimite();
		c.consultaSaldoTotal();
		
		System.out.println("----------------------------------");
		c.saca(1000);
		c.imprimeExtrato();
		c.consultaSaldo();
		c.consultaLimite();
		c.consultaSaldoTotal();
		
		System.out.println("----------------------------------");
		c.deposita(404);
		c.imprimeExtrato();
		c.consultaSaldo();
		c.consultaLimite();
		c.consultaSaldoTotal();
		
		System.out.println("----------------------------------");
		c.saca(1000);
		c.imprimeExtrato();
		c.consultaSaldo();
		c.consultaLimite();
		c.consultaSaldoTotal();
		
	}
}
