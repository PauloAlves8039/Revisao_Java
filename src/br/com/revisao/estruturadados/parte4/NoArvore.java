/*
 * Arquivo: Classe - NoArvore
 * Autor: Paulo Alves
 * Descrição: utilizada para representar elementos de uma arvore binária 
 * Data: 19/01/2020
*/

package br.com.revisao.estruturadados.parte4;

public abstract class NoArvore<T> {

	protected T valor;
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

	public abstract int peso();

	@Override
	public String toString() {
		return (this.noEsquerdo == null ? "[(X)]" : "[(" + this.noEsquerdo.toString() + ")]") + "[("
				+ this.valor.toString() + ")]"
				+ (this.noDireito == null ? "[(X)]" : "[(" + this.noDireito.toString() + ")]");
	}
}
