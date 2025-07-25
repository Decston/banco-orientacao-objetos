
public class Gerente extends Funcionario {
	private String usuario;
	private double senha;
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Usuário: " + this.getUsuario());
		System.out.println("Senha: " + this.getSenha());
	}
	
	public double calculaBonificacao() {
		System.out.println("Bonificação Gerente");
		return this.getSalario() * 0.6 + 100;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getSenha() {
		return senha;
	}
	public void setSenha(double senha) {
		this.senha = senha;
	}
	
}
