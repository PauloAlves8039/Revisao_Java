/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descrição: utilizada como entry point(ponto de entrada) para execução da aplicação. 
 * Data: 20/12/2019
*/

package br.com.revisao.estruturadados.parte2;

import java.util.Scanner;

import br.com.revisao.estruturadados.parte1.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("========== OPÇÕES ==========");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Criar Lista Ligada");
		
		System.out.print("Informe a opção desejada: ");
		int opcao = input.nextInt();
		
		System.out.println("========== RESULTADO ==========");
		
		switch (opcao) {
		case 1:
			gerenciamentoMemoria();
			break;
		case 2:
			criarListaLigada();
			break;
		}
		input.close();
	}
	
	private static void gerenciamentoMemoria() {
		System.out.println("***** GERENCIAMENTO DE MEMÓRIA *****");
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("********************");
		Pessoa p1 = new Pessoa(1, "Paulo");
		System.out.println(p1.toString());
		Pessoa p2 = new Pessoa(1, "Paulo");
		System.out.println(p2.toString());
		System.out.println("--------------------");
		p2.setNome("Pedro");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}
	
	private static void criarListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "Fernando"));
		listaPessoas.inserir(new Pessoa(2, "Camila"));
		listaPessoas.inserir(new Pessoa(3, "Daniel"));
		listaPessoas.inserirEm(1, new Pessoa(4, "Julia"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "Adriano"));
		listaPessoas.inserirUltimo(new Pessoa(6, "Maria"));
		System.out.println(listaPessoas.toString());
	}

}
