/*
 * Arquivo: Classe - Mapa
 * Autor: Paulo Alves
 * Descri��o: respons�vel pela representa��o da estrtutura de dados mapas
 * Data: 18/01/2020
*/

package br.com.revisao.estruturadados.parte4;

import br.com.revisao.estruturadados.parte2.ListaLigada;

public class Mapa<K, V> {

	private ListaLigada<ListaLigada<Associacao<K, V>>> elementos;
	private int quantidadeCategorias = 16;

	public Mapa() {
		this.elementos = new ListaLigada<ListaLigada<Associacao<K, V>>>();
		for (int i = 0; i < this.quantidadeCategorias; i++) {
			this.elementos.inserir(new ListaLigada<Associacao<K, V>>());
		}
	}

	public boolean contemChave(K chave) {
		int numeroEspalhamento = this.gerarNumeroEspalhamento(chave);
		ListaLigada<Associacao<K, V>> categoria = this.elementos.recuperar(numeroEspalhamento);
		for (int i = 0; i < categoria.tamanho(); i++) {
			Associacao<K, V> associacao = categoria.recuperar(i);
			if (associacao.getChave().equals(chave)) {
				return true;
			}
		}
		return false;
	}

	public void remover(K chave) {
		int numeroEspalhamento = this.gerarNumeroEspalhamento(chave);
		ListaLigada<Associacao<K, V>> categoria = this.elementos.recuperar(numeroEspalhamento);
		for (int i = 0; i < categoria.tamanho(); i++) {
			Associacao<K, V> associacao = categoria.recuperar(i);
			if (associacao.getChave().equals(chave)) {
				categoria.remover(associacao);
				return;
			}
		}
		throw new IllegalArgumentException(String.format("A chave %s n�o existe", chave));
	}

	public void adicionar(K chave, V valor) {
		if (this.contemChave(chave)) {
			this.remover(chave);
		}
		int numeroEspalhamento = this.gerarNumeroEspalhamento(chave);
		ListaLigada<Associacao<K, V>> categoria = this.elementos.recuperar(numeroEspalhamento);
		categoria.inserir(new Associacao<K, V>(chave, valor));
	}

	public V recuperar(K chave) {
		int numeroEspalhamento = this.gerarNumeroEspalhamento(chave);
		ListaLigada<Associacao<K, V>> categoria = this.elementos.recuperar(numeroEspalhamento);
		for (int i = 0; i < categoria.tamanho(); i++) {
			Associacao<K, V> associacao = categoria.recuperar(i);
			if (associacao.getChave().equals(chave)) {
				return associacao.getValor();
			}
		}
		throw new IllegalArgumentException(String.format("A chave %s n�o existe", chave));
	}

	private int gerarNumeroEspalhamento(K chave) {
		return Math.abs(chave.hashCode() % this.quantidadeCategorias);
	}

	@Override
	public String toString() {
		return "Mapa [elementos=" + elementos + "]";
	}

}