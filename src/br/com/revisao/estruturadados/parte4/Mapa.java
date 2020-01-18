/*
 * Arquivo: Classe - Mapa
 * Autor: Paulo Alves
 * Descrição: responsável pela representação da estrtutura de dados mapas
 * Data: 18/01/2020
*/

package br.com.revisao.estruturadados.parte4;

import br.com.revisao.estruturadados.parte2.ListaLigada;

public class Mapa<K, V> {
	
	private ListaLigada<ListaLigada<Associacao<K, V>>> elementos;
	private int quantidadeCategorias = 16;
	
	public Mapa() {
		this.elementos = new ListaLigada<ListaLigada<Associacao<K, V>>>();
		for(int i = 0; i < this.quantidadeCategorias; i++) {
			this.elementos.inserir(new ListaLigada<Associacao<K, V>>());
		}
	}
	
	private int gerarNumeroEspalhamento(K chave) {
		return Math.abs(chave.hashCode() % this.quantidadeCategorias);
	}
		
}
