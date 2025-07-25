
public class CartaoDeCredito {
	public int numero;
	public String dataDeValidade;
	public Cliente cliente;
	
	public CartaoDeCredito(int numero, String dataDeValidade, Cliente cliente) {
		this.numero = numero;
		this.dataDeValidade = dataDeValidade;
		this.cliente = cliente;
	}
}
