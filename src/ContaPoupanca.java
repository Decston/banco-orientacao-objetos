import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	
	private int diaDoAniversario = 1;
	
	public void imprimeExtratoDetalhado() {
		System.out.println("EXTRADO DETALHADO DE CONTA POUPANÇA");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("Data: " + sdf.format(agora));
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Aniversário: " + this.diaDoAniversario);
	}
	
	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}
	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}
	
}
