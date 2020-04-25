package Login;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String ie;

	public PessoaJuridica(){
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String toString() {
		return "PessoaJuridica cnpj=" + cnpj + ", ie=" + ie;
	}
}
