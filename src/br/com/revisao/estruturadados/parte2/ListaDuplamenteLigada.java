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

	public void inserir(T elemento) {
		No<T> novoNo = new No<T>(elemento);
		if (estaVazia()) {
			this.primeiroNo = novoNo;
			this.ultimoNo = novoNo;
		} else {
			this.ultimoNo.setProximo(novoNo);
			novoNo.setAnterior(this.ultimoNo);
			this.ultimoNo = novoNo;
		}
		this.tamanho++;
	}
	
	public void inserirEm(int posicao, T elemento) {
		if(posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
		}
		if(posicao == 0) {
			No<T> novoNo = new No<T>(elemento);
			novoNo.setProximo(this.primeiroNo);
			this.primeiroNo.setAnterior(novoNo);
			this.primeiroNo = novoNo;
		}else if(posicao == this.tamanho()) {
			No<T> novoNo = new No<T>(elemento);
			this.ultimoNo.setProximo(novoNo);
			novoNo.setAnterior(this.ultimoNo);
			this.ultimoNo = novoNo;
		}else {
			No<T> noAnterior = recuperarNo(posicao - 1);
			No<T> noAtual = recuperarNo(posicao);
			No<T> novoNo = new No<>(elemento);
			noAnterior.setProximo(novoNo);
			novoNo.setProximo(noAtual);
			noAtual.setAnterior(novoNo);
			novoNo.setAnterior(noAnterior);
		}
		this.tamanho++;
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	public int tamanho() {
		return this.tamanho;
	}
	
	private No<T> recuperarNo(int posicao) {
		if (posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
		}
		No<T> resultado = null;
		for (int i = 0; i <= posicao; i++) {
			if (i == 0) {
				resultado = this.primeiroNo;
			} else {
				resultado = resultado.getProximo();
			}
		}
		return resultado;
	}
}
