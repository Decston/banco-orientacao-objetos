
public class TestaControleDePonto {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setCodigo(123);
		g.setNome("Alisson");
		
		Telefonista t = new Telefonista();
		t.setCodigo(321);
		t.setNome("Patrício");
		
		ControleDePonto cdp = new ControleDePonto();
		System.out.println("Registro de Entrada");
		cdp.registraEntrada(g);
		cdp.registraEntrada(t);
		
		System.out.println("Registro de Saída");
		cdp.registraSaida(g);
		cdp.registraSaida(t);
		
	}
}
