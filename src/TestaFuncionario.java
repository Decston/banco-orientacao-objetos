
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Gerente();
		
		f.setNome("Alisson");
		f.setSalario(10000);
		
		System.out.println("Nome: " + f.getNome());
		System.out.println("Salário: " + f.getSalario());
		System.out.println(f);
		System.out.println("Bonificação de Gerente");
		System.out.println(f.calculaBonificacao());
		
	}
}
