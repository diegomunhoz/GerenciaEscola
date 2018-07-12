package modelo;

/**
 * Classe respons�vel por armazenar os atributos e m�todos do objeto PROFESSOR
 * @author Diego Munhoz
 * @since 31/01/2014
 */

public class Professor extends Funcionario {

	private String endereco;
	private String disciplina;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void exibirDados(){
		super.exibirDados();
		System.out.println("Endereco ..: " + getEndereco());
		System.out.println("Disciplina.: " + getDisciplina());
	}
	
}//fim da classe