package menu;

import java.util.Scanner;

import modelo.Faxineira;
import modelo.Mensagem;
import modelo.Professor;
import modelo.Secretaria;

/**
 * Classe responsável por controlar fluxo de processamento para inclusão e
 * exibição dos objetos PROFESSOR, FAXINEIRA e SECRETÁRIA
 * @author Diego Munhoz
 * @since 31/01/2014
 */

public class MenuPrincipal {//inicio da classe

	public static void main(String[] args) {//inicio do método

		Faxineira listaFaxineira[] = new Faxineira[3];
		Professor listaProfessor[] = new Professor[3];
		Secretaria listaSecretaria[] = new Secretaria[3];
		Scanner teclado = new Scanner(System.in);
		int p = 0;
		int f = 0;
		int s = 0;
		
		for (;true;) {
			System.out.println(Mensagem.mensagemInicial);
			System.out.println(Mensagem.incluirProfessor);
			System.out.println(Mensagem.incluirFaxineira);
			System.out.println(Mensagem.incluirSecretaria);
			System.out.println(Mensagem.consultarProfessor);
			System.out.println(Mensagem.consultarFaxineira);
			System.out.println(Mensagem.consultarSecretaria);
			System.out.println(Mensagem.opcaoSair);
			System.out.println(Mensagem.opcao);
			int opcao = teclado.nextInt();
			teclado.nextLine();

			switch (opcao) {
			case 1:				
				Professor professor = new Professor();
				if (p >= listaProfessor.length) {
					System.out.println("NÃO É POSSÍVEL CADASTRAR");
				} else {
					System.out.println(Mensagem.NOME);
					professor.setNome(teclado.nextLine());
					System.out.println(Mensagem.idade);
					professor.setIdade(teclado.nextByte());
					teclado.nextLine();
					System.out.println(Mensagem.endereco);
					professor.setEndereco(teclado.nextLine());
					System.out.println(Mensagem.salario);
					professor.setSalario(teclado.nextDouble());
					teclado.nextLine();
					System.out.println(Mensagem.disciplina);
					professor.setDisciplina(teclado.nextLine());
					listaProfessor[p] = professor;
					p++;
				}
				break;

			case 2:
				Secretaria secretaria = new Secretaria();
				if (s >= listaSecretaria.length) {
					System.out.println("NÃO É POSSÍVEL CADASTRAR");
				} else{
					System.out.println(Mensagem.NOME);
					secretaria.setNome(teclado.nextLine());
					System.out.println(Mensagem.idade);
					secretaria.setIdade(teclado.nextByte());						
					System.out.println(Mensagem.salario);
					secretaria.setSalario(teclado.nextDouble());
					teclado.nextLine();
					System.out.println(Mensagem.nivelGostosura);
					secretaria.setNivelGostosura(teclado.nextInt());
					teclado.nextLine();
					System.out.println(Mensagem.telefone);
					secretaria.setTelefone(teclado.nextLine());
					listaSecretaria[s] = secretaria;
					s++;
				}
				break;

			case 3:
				Faxineira faxineira = new Faxineira();
				if (f >= listaSecretaria.length) {
					System.out.println("NÃO É POSSÍVEL CADASTRAR");
				} else{
					System.out.println(Mensagem.NOME);
					faxineira.setNome(teclado.nextLine());
					System.out.println(Mensagem.idade);
					faxineira.setIdade(teclado.nextByte());						
					System.out.println(Mensagem.salario);
					faxineira.setSalario(teclado.nextDouble());
					teclado.nextLine();
					System.out.println(Mensagem.endereco);
					faxineira.setEndereco(teclado.nextLine());
					teclado.nextLine();
					System.out.println(Mensagem.telefone);
					faxineira.setTelefone(teclado.nextLine());
					listaFaxineira[f] = faxineira;
					f++;
				}
				break;

			case 4:
				if (p > 0) {
					for (int j = 0; j < p; j++) {
						
					}
				}else{
					System.out.println("NÃO HA DADOS A SEREM EXIBIDOS");
				}				
				break;
				
			case 5:
				if (s > 0) {
					for (int j = 0; j < s; j++) {
						listaSecretaria[s].exibirDados();
					}
				}else{
					System.out.println("NÃO HA DADOS A SEREM EXIBIDOS");
				}				
				break;
				
			case 6:
				if (f > 0) {
					for (int j = 0; j < f; j++) {
						listaFaxineira[f].exibirDados();
					}
				}else{
					System.out.println("NÃO HA DADOS A SEREM EXIBIDOS");
				}				
				break;

			case 0:
				System.exit(0);
				break;

			default:
				System.out.println("MENSAGEM: OPÇÃO INVÁLIDA!");
				break;
			}

		}

	}//fim do main

}//fim da classe
