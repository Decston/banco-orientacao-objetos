
public class TestaValeRefeicao {
	public static void main(String[] args) {
		System.out.println("Vale refeição diário: " + Funcionario.valeRefeicaoDiario);
		Funcionario.reajustaValeRefeicaoDiario(1);
		System.out.println("Novo valor vale refeição diário:");
		
		Funcionario f = new Funcionario();
		f.setNome("Alisson");
		//f.salario = 10000;
		
		System.out.println("Valor Vale Refeição: " + Funcionario.valeRefeicaoDiario);
	}
}
