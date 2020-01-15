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
}
