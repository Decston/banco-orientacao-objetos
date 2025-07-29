
public class TestaEquals {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setCodigo(1);
		f1.setNome("Alisson");
		f1.setSalario(10000);
		
		Funcionario f2 = new Funcionario();
		f2.setCodigo(1);
		f2.setNome("Alisson");
		f2.setSalario(10000);
		
		System.out.println(f1 == f2);
		System.out.println(f1.equals(f2));
		
	}
}
