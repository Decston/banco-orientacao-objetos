
public class TestaGerente {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Alisson");
		g.setSalario(10000);
		
		System.out.println("Salário: " + g.getSalario());
		
		System.out.println("Aumentando o salário em 1000");
		g.aumentaSalario(1000);
		
		System.out.println("Salário: " + g.getSalario());
		
		System.out.println("Aumentando o salário em 300");
		g.aumentaSalario(300);
		
		System.out.println("Salário: " + g.getSalario());
	}
}
