
public class Servico {
	
	private Cliente contratante;
	private Funcionario responsavel;
	private String dataDeContratacao;
	
	public Servico() {
		System.out.println("Serviço");
	}
	
	public double calculaTaxa() {
		return 5;
	}
	
	public Cliente getContratante() {
		return contratante;
	}
	public void setContratante(Cliente contratante) {
		this.contratante = contratante;
	}
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	public String getDataDeContratacao() {
		return dataDeContratacao;
	}
	public void setDataDeContratacao(String dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}
	
}
