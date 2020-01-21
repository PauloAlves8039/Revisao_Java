/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descrição: utilizada como entry point(ponto de entrada) para execução da aplicação. 
 * Data: 20/12/2019
*/

package br.com.revisao.estruturadados.parte2;

import java.util.Scanner;

import br.com.revisao.estruturadados.parte1.Pessoa;
import br.com.revisao.estruturadados.parte3.Fila;
import br.com.revisao.estruturadados.parte3.Pilha;
import br.com.revisao.estruturadados.parte4.Arvore;
import br.com.revisao.estruturadados.parte4.Conjunto;
import br.com.revisao.estruturadados.parte4.Mapa;
import br.com.revisao.estruturadados.parte4.NoArvore;
import br.com.revisao.estruturadados.parte4.NoArvorePessoa;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("========== OPÇÕES ==========");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Criar Lista Ligada");
		System.out.println("3. Criar Lista Duplamente Ligada");
		System.out.println("4. Criar Pilha");
		System.out.println("5. Criar Fila");
		System.out.println("6. Criar Conjunto");
		System.out.println("7. Criar Mapas");
		System.out.println("8. Criar Árvore binária");

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
		case 7:
			criarMapa();
			break;
		case 8:
			criarArvoreBinaria();
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
		pilhaPessoas.empilhar(new Pessoa(1, "João"));
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
		System.out.println(conjuntoPessoas.inserir(new Pessoa(1, "Carol")));
		System.out.println(conjuntoPessoas.toString());
	}
	
	private static void criarMapa() {
		Mapa<String, Pessoa> mapaPessoas = new Mapa<String, Pessoa>();
		System.out.println(mapaPessoas.toString());
		mapaPessoas.adicionar("Legal", new Pessoa(1, "Fátima"));
		System.out.println(mapaPessoas.toString());
		System.out.println(mapaPessoas.contemChave("Legal"));
		System.out.println(mapaPessoas.contemChave("Chata"));
		mapaPessoas.adicionar("Chata", new Pessoa(2, "Mary"));
		System.out.println(mapaPessoas.contemChave("Chata"));
		mapaPessoas.adicionar("Legal", new Pessoa(3, "Ramirez"));
		System.out.println(mapaPessoas.toString());
		mapaPessoas.remover("Chata");
		System.out.println(mapaPessoas.toString());
		System.out.println(mapaPessoas.recuperar("Legal"));
		// mapaPessoas.remover("Chave");
	}
	
	private static void criarArvoreBinaria() {
		Arvore<Pessoa> arvorePessoas = new Arvore<Pessoa>();
		System.out.println(arvorePessoas.toString());
		arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(5, "Paulo")));
		System.out.println(arvorePessoas.toString());
		arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(4, "Luciano")));
		System.out.println(arvorePessoas.toString());
		arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(6, "Rodrigo")));
		System.out.println(arvorePessoas.toString());
		arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(7, "Raiza")));
		System.out.println(arvorePessoas.toString());
		System.out.println("Busca...");
		NoArvore<Pessoa> noPessoa6 = new NoArvorePessoa(new Pessoa(7, "Raiza"));
		NoArvore<Pessoa> noPessoa1 = new NoArvorePessoa(new Pessoa(1, "Teste"));
		System.out.println(arvorePessoas.buscar(noPessoa6));
		System.out.println(arvorePessoas.buscar(noPessoa1));
	}
}
