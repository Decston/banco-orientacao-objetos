
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

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + ", agencia=" + agencia
				+ ", extrato=" + extrato + ", qtdMovimentacoes=" + qtdMovimentacoes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((extrato == null) ? 0 : extrato.hashCode());
		long temp;
		temp = Double.doubleToLongBits(limite);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numero;
		result = prime * result + qtdMovimentacoes;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (extrato == null) {
			if (other.extrato != null)
				return false;
		} else if (!extrato.equals(other.extrato))
			return false;
		if (Double.doubleToLongBits(limite) != Double.doubleToLongBits(other.limite))
			return false;
		if (numero != other.numero)
			return false;
		if (qtdMovimentacoes != other.qtdMovimentacoes)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	
}
