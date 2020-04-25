package Login;

public class Colaborador extends PessoaFisica implements ValidaComCPF{
private String cargo;
	
	public Colaborador(){	
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String toString() {
		return "Colaborador " + cargo + " cargo";
	}

	public boolean verificalogin(String login, String senha , String cpf) {
		
		System.out.print(this.getLogin());
		System.out.print(this.getSenha());
		
		if (login.equals(this.getSenha().toString()))
			return true;
		if (senha.equals(this.getSenha().toString()))
			return true;
		if (cpf.equals(this.getCpf()))
			return true;
		
		return false;
	}
}
