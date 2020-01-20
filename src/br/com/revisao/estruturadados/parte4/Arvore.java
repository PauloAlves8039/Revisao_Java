/*
 * Arquivo: Classe - Arvore
 * Autor: Paulo Alves
 * Descrição: responsável por representar uma arvore binária 
 * Data: 19/01/2020
*/

package br.com.revisao.estruturadados.parte4;

public class Arvore<T> {

	private NoArvore<T> raiz;

	public Arvore() {
		this.raiz = null;
	}

	public NoArvore<T> getRaiz() {
		return this.raiz;
	}

	public void inserir(NoArvore<T> no) {
		no.setNoDireito(null);
		no.setNoEsquerdo(null);
		if (this.raiz == null) {
			this.raiz = no;
		} else {
			this.inserir(this.raiz, no);
		}
	}

	private void inserir(NoArvore<T> ref, NoArvore<T> novoNo) {
		if (ref.peso() < novoNo.peso()) {
			if (ref.getNoDireito() == null) {
				ref.setNoDireito(novoNo);
			} else {
				inserir(ref.getNoDireito(), novoNo);
			}
		} else {
			if (ref.getNoEsquerdo() == null) {
				ref.setNoEsquerdo(novoNo);
			} else {
				inserir(ref.getNoEsquerdo(), novoNo);
			}
		}
	}

	@Override
	public String toString() {
		return this.raiz == null ? "[(X)]" : raiz.toString();
	}
}
