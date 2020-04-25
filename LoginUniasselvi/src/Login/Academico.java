package Login;

public class Academico extends PessoaFisica implements Valida{
	private String curso;
	
	public Academico(){
	}
	
	public String getcurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean verificalogin(String login, String senha) {
		
		if (login.equals(this.getSenha().toString()))
			return true;
		if (senha.equals(this.getSenha().toString()))
			return true;
		
		return false;
	}
}
