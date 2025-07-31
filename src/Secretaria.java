
public class Secretaria extends Funcionario {
	
	private int ramal;
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Ramal: " + this.getRamal());
	}
	
	public double calculaBonificacao() {
		System.out.println("Bonificação Gerente");
		return this.getSalario() * 0.2 + 300;
	}
	
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
}
