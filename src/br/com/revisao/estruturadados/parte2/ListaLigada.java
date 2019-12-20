/*
 * Arquivo: Classe - ListaLigada
 * Autor: Paulo Alves
 * Descrição: responsável pela manipulação dos elementos da lista ligada
 * Data: 20/12/2019
*/

package br.com.revisao.estruturadados.parte2;

public class ListaLigada<T> {
	
	private No<T> primeiroNo;
	private No<T> ultimoNo;
	private int tamanho;

	public ListaLigada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanho = 0;
	}
}
