/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descri��o: utilizada como entry point(ponto de entrada) para execu��o da aplica��o. 
 * Data: 10/11/2019
*/

package br.com.revisao.estruturadados.parte1;

import java.util.Scanner;

import br.com.revisao.estruturadados.parte1.Pessoa;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("========== OP��ES ==========");
		System.out.println("1. Gerenciamento de mem�ria");
		System.out.println("2. Inserir vetor");

		System.out.print("Digite a op��o desejada: ");
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
		System.out.println("***** GERENCIAMENTO DE MEM�RIA *****");
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
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
		vetorPessoas.inserir(new Pessoa(1, "Isadora"));
		vetorPessoas.inserir(new Pessoa(2, "Juliano"));
		vetorPessoas.inserir(new Pessoa(3, "Adriana"));
		vetorPessoas.inserir(new Pessoa(4, "Bruno"));
		vetorPessoas.inserir(new Pessoa(5, "Luciano"));
		vetorPessoas.inserirEm(1, new Pessoa(6, "Karla"));
		System.out.println(vetorPessoas);
		System.out.println("Lista de pessoas: ");
		for(int i = 0; i < vetorPessoas.tamanho(); i++) {
			System.out.println(vetorPessoas.recuperar(i).getNome());
		}
		Pessoa p = vetorPessoas.recuperar(1);
		Pessoa pessoaTeste = new Pessoa(100, "Teste");
		System.out.println(vetorPessoas.contem(p));
		System.out.println(vetorPessoas.contem(pessoaTeste));
		System.out.println(vetorPessoas.indice(p));
		System.out.println(vetorPessoas.indice(pessoaTeste));
		// vetorPessoas.remover(2);
		// System.out.println(vetorPessoas.toString());
		vetorPessoas.remover(p);
		System.out.println(vetorPessoas.toString());		
	}
}
