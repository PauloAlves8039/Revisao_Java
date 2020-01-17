/*
 * Arquivo: Classe - TabelaEspalhamento
 * Autor: Paulo Alves
 * Descrição: responsável pela representação da estrutura de dados Tabela de Espalhamento
 * Data: 15/01/2020
*/

package br.com.revisao.estruturadados.parte4;

import br.com.revisao.estruturadados.parte2.ListaLigada;

public class TabelaEspalhamento<T> {
	
	private ListaLigada<ListaLigada<T>> elementos;
	private int numeroCategorias = 16;
	private int tamanho;
	
	public TabelaEspalhamento() {
		this.elementos = new ListaLigada<ListaLigada<T>>();
		for(int i = 0; i < this.numeroCategorias; i++) {
			this.elementos.inserir(new ListaLigada<T>());
		}
		this.tamanho = 0;
	}
	
	public boolean inserir(T elemento) {
		int numeroEspalhamento = this.gerarNumeroEspalhamento(elemento);
		ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
		if(categoria.contem(elemento)) {
			return false;
		}
		categoria.inserir(elemento);
		this.tamanho++;
		return true;
	}
	
	public void remover(T elemento) {
		int numeroEspalhamento = this.gerarNumeroEspalhamento(elemento);
		ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
		categoria.remover(elemento);
		this.tamanho--;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	private int gerarNumeroEspalhamento(T elemento) {
		return elemento.hashCode() % 16;
	}
}
