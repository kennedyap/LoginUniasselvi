package Login;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String rg;

	public PessoaFisica() {
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String toString() {
		return "PessoaFisica cpf=" + cpf + ", rg=" + rg;
	}
}
