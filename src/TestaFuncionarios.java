
public class TestaFuncionarios {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Patrício");
		g.setSalario(15000);
		g.setUsuario("patricio");
		g.setSenha(123456);
		
		Telefonista t = new Telefonista();
		t.setNome("Gomes");
		t.setSalario(3000);
		t.setEstacaoDeTrabalho(1);
		
		Secretaria s = new Secretaria();
		s.setNome("Freitas");
		s.setSalario(5000);
		s.setRamal(003);
		
		System.out.println();
		System.out.println("Gerente");
		g.mostraDados();
		
		System.out.println();
		System.out.println("Telefonista");
		t.mostraDados();
		
		System.out.println();
		System.out.println("Secretária");
		s.mostraDados();
		
	}
}
