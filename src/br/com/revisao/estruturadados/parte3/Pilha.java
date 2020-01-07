/*
 * Arquivo: Classe - Pilha
 * Autor: Paulo Alves
 * Descrição: responsável pelas funcionalidades de empilhamento e verificação de nós
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
	
	public void empilhar(T elemento) {
		this.elementos.inserir(elemento);
	}
	
	public T desempilhar() {
		if(estaVazia()) {
			return null;
		}
		T resultado = this.elementos.recuperar(this.elementos.tamanho() - 1);
		this.elementos.remover(this.elementos.tamanho() - 1);
		return resultado;
	}
}
