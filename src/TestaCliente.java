
public class TestaCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alisson Patrício", 1);
		
		Cliente c2 = new Cliente("Karina Abreu", 2);
		
		System.out.println("Dados do primeiro cliente");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Código " + c1.getCodigo());
		
		System.out.println("---------------------------------");
		
		System.out.println("Dados do segundo cliente");
		System.out.println("Nome: " + c2.getNome());
		System.out.println("Código: " + c2.getCodigo());
	}
}
