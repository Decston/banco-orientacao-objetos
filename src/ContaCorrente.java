import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {
	
	private double limite;
	
	public void imprimeExtratoDetalhado() {
		System.out.println("EXTRADO DETALHADO DE CONTA CORRENTE");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("Data: " + sdf.format(agora));
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Limite: " + this.limite);
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

}
