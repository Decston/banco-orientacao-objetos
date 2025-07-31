
public class Telefonista extends Funcionario {
	
	private int estacaoDeTrabalho;
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Estação: " + this.getEstacaoDeTrabalho());
	}
	
	public double calculaBonificacao() {
		System.out.println("Bonificação Gerente");
		return this.getSalario() * 0.1 + 100;
	}

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}
	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
	
}
