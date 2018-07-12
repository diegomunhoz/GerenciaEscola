package modelo;

/**
 * Classe responsável por armazenar atributos genéricos utilizados por
 * outras classes(HERANÇA)
 * @author Diego Munhoz
 * @since 06/02/2014
 * @
 */

public abstract class Funcionario {//inicio da classe

	private String nome;
	private byte idade;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void exibirDados(){
		System.out.println("Nome...: ");
		System.out.println("Idade..: ");
		System.out.println("Salario: ");
	}
	
}//fim da classe