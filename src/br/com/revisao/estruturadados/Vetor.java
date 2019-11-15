/*
 * Arquivo: Classe - Vetor
 * Autor: Paulo Alves
 * Descri��o: classe gen�rica respons�vel pela cria��o e manipula��o de vetores. 
 * Data: 12/11/2019
*/

package br.com.revisao.estruturadados;

public class Vetor<T> {
	
	private Object[] elementos;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
	}
	
	public void inserirEm(int posicao, T elemento) {
		this.elementos[posicao] = elemento;
	}
	
	@SuppressWarnings("unchecked")
	public T recuperar(int posicao) {
		return (T)this.elementos[posicao];
	}
}
