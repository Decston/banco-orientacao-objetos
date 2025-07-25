
public class Emprestimo extends Servico {

	private double valor;
	private double taxa;
	
	public Emprestimo() {
		System.out.println("Emprestimo");
	}
	
	public double calculaTaxa() {
		return super.calculaTaxa() + this.valor * 0.1;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
}
