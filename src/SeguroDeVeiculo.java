
public class SeguroDeVeiculo extends Servico {
	
	private Veiculo veiculo;
	private double valorDoSeguroDeVeiculo;
	private double franquia;
	
	public double calculaTaxa() {
		return super.calculaTaxa() + this.veiculo.getTaxa() * 0.05;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public double getValorDoSeguroDeVeiculo() {
		return valorDoSeguroDeVeiculo;
	}
	public void setValorDoSeguroDeVeiculo(double valorDoSeguroDeVeiculo) {
		this.valorDoSeguroDeVeiculo = valorDoSeguroDeVeiculo;
	}
	public double getFranquia() {
		return franquia;
	}
	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}
	
}
