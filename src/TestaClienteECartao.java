
public class TestaClienteECartao {
	public static void main(String[] args) {
		Cliente c = new Cliente("Alisson", 123);
		CartaoDeCredito cdc = new CartaoDeCredito(913979, "12/12/2038", c);
		
		System.out.println("Dados do cliente");
		System.out.println("Nome: " + c.getNome());
		System.out.println("Código: " + c.getCodigo());
		
		System.out.println("---------------------------");
		
		System.out.println("Dados do cartão");
		System.out.println("Número: " + cdc.numero);
		System.out.println("Data de validade: " + cdc.dataDeValidade);
		
		System.out.println("---------------------------");
		
		cdc.cliente = c;
		
		System.out.println("Dados do cliente do cartão");
		System.out.println(cdc.cliente.getNome());
		System.out.println(cdc.cliente.getCodigo());
	}
}
