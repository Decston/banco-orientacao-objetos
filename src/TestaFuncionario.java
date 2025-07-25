
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.setNome("Alisson");
		f.setSalario(10000);
		
		System.out.println("Nome: " + f.getNome());
		System.out.println("Salário: " + f.getSalario());
		
	}
}
