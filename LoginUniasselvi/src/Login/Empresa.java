package Login;

public class Empresa extends PessoaJuridica implements Valida{
	private String numeroFuncionarios;

	public Empresa(){
		
	}
	
	public String getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(String numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public String toString() {
		return "Empresa [numeroFuncionarios=" + numeroFuncionarios + "]";
	}

	public boolean verificalogin(String login, String senha) {
		System.out.print(this.getLogin());
		System.out.print(this.getSenha());
		
		if (login.equals(this.getSenha().toString()))
			return true;
		if (senha.equals(this.getSenha().toString()))
			return true;
			
		return false;
	}
}
