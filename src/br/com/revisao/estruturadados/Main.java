/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descrição: utilizada como entry point(ponto de entrada) para execução da aplicação. 
 * Data: 10/11/2019
*/

package br.com.revisao.estruturadados;

import java.util.Scanner;

import br.com.revisao.estruturadados.Pessoa;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("========== OPÇÕES ==========");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Inserir vetor");

		System.out.print("Digite a opção desejada: ");
		int opcao = input.nextInt();

		System.out.println("========== RESULTADO ==========");

		switch (opcao) {
		case 1:
			gerenciamentoMemoria();
			break;
		case 2:
			inserirVetor();
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

	private static void inserirVetor() {
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>(3);
		vetorPessoas.inserirEm(0, new Pessoa(1, "Fernando"));
		System.out.println(vetorPessoas.recuperar(0).getNome());
		
		Vetor<Integer> vetorInteiros = new Vetor<Integer>(2);
		vetorInteiros.inserirEm(0, 1);
		System.out.println(vetorInteiros.recuperar(0));
	}
}
