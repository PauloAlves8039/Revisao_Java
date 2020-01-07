/*
 * Arquivo: Classe - Pilha
 * Autor: Paulo Alves
 * Descri��o: respons�vel pelas funcionalidades de empilhamento e verifica��o de n�s
 * Data: 07/01/2020
*/

package br.com.revisao.estruturadados.parte3;

import br.com.revisao.estruturadados.parte2.ListaDuplamenteLigada;

public class Pilha<T> {
	
	private ListaDuplamenteLigada<T> elementos;
	
	public Pilha() {
		this.elementos = new ListaDuplamenteLigada<T>();
	}
	
	public boolean estaVazia() {
		return this.elementos.estaVazia();
	}
	
	
}
