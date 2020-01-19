/*
 * Arquivo: Classe - NoArvore
 * Autor: Paulo Alves
 * Descrição: utilizada para representar elementos de uma arvore binária 
 * Data: 19/01/2020
*/

package br.com.revisao.estruturadados.parte4;

public class NoArvore<T> {

	private T valor;
	private NoArvore<T> noEsquerdo;
	private NoArvore<T> noDireito;
	
	public NoArvore(T valor) {
		this.valor = valor;
		this.noEsquerdo = null;
		this.noDireito = null;
	}

	public NoArvore<T> getNoEsquerdo() {
		return noEsquerdo;
	}

	public void setNoEsquerdo(NoArvore<T> noEsquerdo) {
		this.noEsquerdo = noEsquerdo;
	}

	public NoArvore<T> getNoDireito() {
		return noDireito;
	}

	public void setNoDireito(NoArvore<T> noDireito) {
		this.noDireito = noDireito;
	}

	public T getValor() {
		return valor;
	}
	
	public int peso() {
		return this.valor.hashCode();
	}
}
