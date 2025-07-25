
public class Conta {
	private int numero;
	private double saldo = 0;
	private double limite = 100;
	private Agencia agencia;
	private String extrato = "Extrato: \n";
	private int qtdMovimentacoes = 0;
	
	public Conta() {
		
	}
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
	public Conta(int numero, double limite) {
		this(numero);
		this.limite = limite;
	}
	
	public Conta(int numero, Agencia agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public void deposita(double valor) {
		int idMovimentacao = this.qtdMovimentacoes += 1;
		double saldoAnterior = this.saldo;
		this.saldo += valor;
		this.extrato += idMovimentacao + " - " + saldoAnterior + " + " + valor + " = " + (saldoAnterior+valor) + "\n";
	}
	
	public void saca(double valor) {
		int idMovimentacao = this.qtdMovimentacoes += 1;
		double saldoAnterior = this.saldo;
		this.saldo -= valor;
		descontaTarifa();
		this.extrato += idMovimentacao + " - " + saldoAnterior + " - " + valor + " = " + (saldoAnterior-valor) + "\n";
	}
	
	private void descontaTarifa() {
		this.saldo -= 0.1;
	}
	
	public void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	public void imprimeExtrato() {
		System.out.println(this.extrato);
	}
	
	public void consultaSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void consultaLimite() {
		System.out.println("Limite: " + this.limite);
	}
	
	public void consultaSaldoTotal() {
		System.out.println("Saldo Total: " + (this.saldo + this.limite));
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getExtrato() {
		return extrato;
	}

	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}
	
}
