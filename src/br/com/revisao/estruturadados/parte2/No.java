/*
 * Arquivo: Classe - No
 * Autor: Paulo Alves
 * Descrição: entidade criada para representação de listas ligadas. 
 * Data: 20/12/2019
*/

package br.com.revisao.estruturadados.parte2;

public class No<T> {

	private T elemento;
	private No<T> proximo;
	
	public No() {
		this.proximo = null;
	}

	public No(T elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}
	
	public No(T elemento, No<T> proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

}
