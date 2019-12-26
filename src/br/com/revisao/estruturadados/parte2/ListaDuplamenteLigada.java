/*
 * Arquivo: Classe - ListaDuplamenteLigada
 * Autor: Paulo Alves
 * Descrição: responsável pela manipulação dos elementos da lista duplamente ligada
 * Data: 26/12/2019
*/

package br.com.revisao.estruturadados.parte2;

public class ListaDuplamenteLigada<T> {
	
	private No<T> primeiroNo;
	private No<T> ultimoNo;
	private int tamanho;
	
	public ListaDuplamenteLigada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanho = 0;
	}
}
