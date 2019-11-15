/*
 * Arquivo: Classe - Vetor
 * Autor: Paulo Alves
 * Descri��o: classe gen�rica respons�vel pela cria��o e manipula��o de vetores. 
 * Data: 12/11/2019
*/

package br.com.revisao.estruturadados;

import java.util.Arrays;

public class Vetor<T> {
	
	private Object[] elementos;
	private int posicao;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
		this.posicao = 0;
	}
	
	public Vetor() {
		this.elementos = new Object[3];
		this.posicao = 0;
	}
	
	public void inserir(T elemento) {
		if(this.posicao >= this.elementos.length) {
			this.elementos = Arrays.copyOf(this.elementos, this.elementos.length + 1);
		}
		this.elementos[this.posicao] = elemento;
		this.posicao++;
	}
	
	public void inserirEm(int posicao, T elemento) {
		if(posicao > this.elementos.length) {
			throw new IllegalArgumentException(String.format("A posi��o � inv�lida [%d]", posicao));
		}
		this.elementos[posicao] = elemento;
	}
	
	@SuppressWarnings("unchecked")
	public T recuperar(int posicao) {
		return (T)this.elementos[posicao];
	}

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}
}
