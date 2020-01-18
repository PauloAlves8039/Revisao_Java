/*
 * Arquivo: Classe - Associacao
 * Autor: Paulo Alves
 * Descri��o: respons�vel pela representa��o de uma associa��o de dados
 * Data: 18/01/2020
*/

package br.com.revisao.estruturadados.parte4;

public class Associacao<K, V> {

	private K chave;
	private V valor;

	public Associacao(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public K getChave() {
		return chave;
	}

	public V getValor() {
		return valor;
	}
}
