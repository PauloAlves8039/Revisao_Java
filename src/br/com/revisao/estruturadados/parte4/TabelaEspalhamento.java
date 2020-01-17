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
	
	public TabelaEspalhamento() {
		this.elementos = new ListaLigada<ListaLigada<T>>();
		for(int i = 0; i < this.numeroCategorias; i++) {
			this.elementos.inserir(new ListaLigada<T>());
		}
	}
	
	public boolean inserir(T elemento) {
		int numeroEspalhamento = this.gerarNumeroEspalhamento(elemento);
		ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
		if(categoria.contem(elemento)) {
			return false;
		}
		categoria.inserir(elemento);
		return true;
	}
	
	private int gerarNumeroEspalhamento(T elemento) {
		return elemento.hashCode() % 16;
	}
}
