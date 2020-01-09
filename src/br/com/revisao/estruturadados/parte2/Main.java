/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descri��o: utilizada como entry point(ponto de entrada) para execu��o da aplica��o. 
 * Data: 20/12/2019
*/

package br.com.revisao.estruturadados.parte2;

import java.util.Scanner;

import br.com.revisao.estruturadados.parte1.Pessoa;
import br.com.revisao.estruturadados.parte3.Fila;
import br.com.revisao.estruturadados.parte3.Pilha;
import br.com.revisao.estruturadados.parte4.Conjunto;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("========== OP��ES ==========");
		System.out.println("1. Gerenciamento de mem�ria");
		System.out.println("2. Criar Lista Ligada");
		System.out.println("3. Criar Lista Duplamente Ligada");
		System.out.println("4. Criar Pilha");
		System.out.println("5. Criar Fila");
		System.out.println("6. Criar Conjunto");

		System.out.print("Informe a op��o desejada: ");
		int opcao = input.nextInt();

		System.out.println("========== RESULTADO ==========");

		switch (opcao) {
		case 1:
			gerenciamentoMemoria();
			break;
		case 2:
			criarListaLigada();
			break;
		case 3:
			criarListaDuplamenteLigada();
			break;
		case 4:
			criarPilha();
			break;
		case 5:
			criarFila();
			break;
		case 6:
			criarConjunto();
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

	private static void criarListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "Fernando"));
		listaPessoas.inserir(new Pessoa(2, "Camila"));
		listaPessoas.inserir(new Pessoa(3, "Daniel"));
		listaPessoas.inserirEm(1, new Pessoa(4, "Julia"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "Adriano"));
		listaPessoas.inserirUltimo(new Pessoa(6, "Maria"));
		System.out.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "Carlos");
		System.out.println(listaPessoas.contem(p));
		System.out.println(listaPessoas.contem(pessoaErrada));
		System.out.println(listaPessoas.indice(p));
		System.out.println(listaPessoas.indice(pessoaErrada));
		listaPessoas.remover(p);
		System.out.println(listaPessoas.toString());
		listaPessoas.remover(0);
		System.out.println(listaPessoas.toString());
		System.out.println("Lista de pessoas");
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			System.out.println(listaPessoas.recuperar(i).toString());
		}
	}

	private static void criarListaDuplamenteLigada() {
		ListaDuplamenteLigada<Pessoa> listaPessoas = new ListaDuplamenteLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "Fernando"));
		listaPessoas.inserir(new Pessoa(2, "Camila"));
		listaPessoas.inserir(new Pessoa(3, "Daniel"));
		listaPessoas.inserirEm(1, new Pessoa(4, "Julia"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "Adriano"));
		listaPessoas.inserirUltimo(new Pessoa(6, "Maria"));
		System.out.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "Carlos");
		System.out.println(listaPessoas.contem(p));
		System.out.println(listaPessoas.contem(pessoaErrada));
		System.out.println(listaPessoas.indice(p));
		System.out.println(listaPessoas.indice(pessoaErrada));
		listaPessoas.remover(p);
		System.out.println(listaPessoas.toString());
		listaPessoas.remover(0);
		System.out.println(listaPessoas.toString());
		System.out.println("Lista de pessoas");
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			System.out.println(listaPessoas.recuperar(i).toString());
		}
	}
	
	private static void criarPilha() {
		Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
		System.out.println(pilhaPessoas.estaVazia());
		pilhaPessoas.empilhar(new Pessoa(1, "Jo�o"));
		pilhaPessoas.empilhar(new Pessoa(2, "Fernanda"));
		pilhaPessoas.empilhar(new Pessoa(3, "Tarciana"));
		Pessoa p1 = pilhaPessoas.desempilhar();
		System.out.println(p1.toString());
	}
	
	private static void criarFila() {
		Fila<Pessoa> filaPessoas = new Fila<Pessoa>();
		System.out.println(filaPessoas.estaVazia());
		filaPessoas.enfileirar(new Pessoa(1, "Karina"));
		filaPessoas.enfileirar(new Pessoa(2, "Julio"));
		System.out.println(filaPessoas.toString());
		filaPessoas.enfileirar(new Pessoa(3, "Pedro"));
		Pessoa p = filaPessoas.desenfileirar();
		System.out.println(p.toString());
		System.out.println(filaPessoas.toString());
	}
	
	private static void criarConjunto() {
		Conjunto<Pessoa> conjuntoPessoas = new Conjunto<Pessoa>();
		System.out.println(conjuntoPessoas.estaVazio());
		System.out.println(conjuntoPessoas.inserir(new Pessoa(1, "Carol")));
		System.out.println(conjuntoPessoas.toString());
		System.out.println(conjuntoPessoas.inserir(new Pessoa(1, "Carol")));
		System.out.println(conjuntoPessoas.toString());
		System.out.println(conjuntoPessoas.inserirEm(1, new Pessoa(1, "Carol")));
		System.out.println(conjuntoPessoas.toString());
	}

}
