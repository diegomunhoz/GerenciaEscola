package modelo;

/**
 * Classe responsável por armazenar os atributos e métodos do objeto FAXINEIRA
 * @author Diego Munhoz
 * @since 31/01/2014
 */

public class Faxineira extends Funcionario {

	private String endereco;
	private String telefone;

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void exibirDados(){
		super.exibirDados();		
		System.out.println("Endereco da Faxineira: " + getEndereco());
		System.out.println("Telefone da Faxineira: " + getTelefone());
	}
	
}//fim da classe