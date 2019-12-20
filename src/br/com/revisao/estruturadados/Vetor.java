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
		if(this.elementos[posicao] != null) {
			Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao, this.elementos.length);
			Object[] arrayInicio = new Object[posicao + 1];
			System.arraycopy(this.elementos, 0, arrayInicio, 0, posicao);
			arrayInicio[arrayInicio.length - 1] = elemento;
			int novoTamanho = arrayFinal.length + arrayInicio.length;
			this.elementos = new Object[novoTamanho];
			System.arraycopy(arrayInicio, 0, this.elementos, 0, arrayInicio.length);
			System.arraycopy(arrayFinal, 0, this.elementos, arrayInicio.length, arrayFinal.length);
			this.posicao++;
		}else {
			this.elementos[posicao] = elemento;
		}		
	}
	
	@SuppressWarnings("unchecked")
	public T recuperar(int posicao) {
		if(posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("Posi��o inv�lida [%d] ", posicao));
		}
		return (T)this.elementos[posicao];
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public boolean contem(T elemento) {
		for(int i = 0; i < tamanho(); i++) {
			T elem = recuperar(i);
			if(elem != null && elem.equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public int indice(T elemento) {
		for(int i = 0; i < tamanho(); i++) {
			T elem = recuperar(i);
			if(elem != null && elem.equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remover(int posicao) {
		if(posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("Posi��o inv�lida [%d]", posicao));
		}
		Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao + 1, tamanho());
		Object[] arrayInicial = Arrays.copyOfRange(this.elementos, 0, posicao);
		this.elementos = new Object[tamanho() - 1];
		this.posicao--;
		System.arraycopy(arrayInicial, 0, this.elementos, 0, arrayInicial.length);
		System.arraycopy(arrayFinal, 0, this.elementos, 0, arrayFinal.length);
	}
	
	public void remover(T elemento) {
		int posicao = indice(elemento);
		if(posicao >= tamanho() || posicao == -1) {
			throw new IllegalArgumentException("Elemento inv�lido - " + elemento.toString());
		}
		remover(posicao);
	}

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}
}
