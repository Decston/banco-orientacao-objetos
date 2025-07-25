
public class TestaCartaoDeCredito {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alisson", 1);
		CartaoDeCredito cdc1 = new CartaoDeCredito(0123456, "01/01/2033", c1);
		
		Cliente c2 = new Cliente("Karina", 2);
		CartaoDeCredito cdc2 = new CartaoDeCredito(6543210, "01/01/2034", c2);
		
		System.out.println("Dados do primeiro cartão");
		System.out.println("Número: " + cdc1.numero);
		System.out.println("Data de validade: " + cdc1.dataDeValidade);
		
		System.out.println("--------------------------------");
		
		System.out.println("Dados do segundo cartão");
		System.out.println("Número: " + cdc2.numero);
		System.out.println("Data de validade: " + cdc2.dataDeValidade);
	}
}
