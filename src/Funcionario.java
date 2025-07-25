
public class Funcionario {
	private String nome;
	private double salario;
	public static double valeRefeicaoDiario = 20;
	
	public void mostraDados() {
		System.out.println("-----------------------------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Valor Bonificação: " + this.calculaBonificacao());
	}
	
	public double calculaBonificacao() {
		System.out.println("Bonificação Geral");
		return this.salario * 0.1;
	}
	
	void aumentaSalario(double aumento) {
		this.salario += aumento;
	}
	
	static void reajustaValeRefeicaoDiario(double taxa) {
		Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
