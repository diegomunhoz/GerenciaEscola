package modelo;

/**
 * Classe responsável por armazenar os atributos e métodos do objeto SECRETARIA
 * @author Diego Munhoz
 * @since 31/01/2014
 */

public class Secretaria extends Funcionario{

	private int nivelGostosura;
	private String telefone;
	
	public int getNivelGostosura() {
		return nivelGostosura;
	}
	public void setNivelGostosura(int nivelGostosura) {
		this.nivelGostosura = nivelGostosura;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {		
		this.telefone = telefone;
	}
	
	public void exibirDados(){
		super.exibirDados();
		System.out.println("Nivel de Gostosura..: " + getNivelGostosura());
		System.out.println("Telefone............: " + getTelefone());
	}

}//fim da classe