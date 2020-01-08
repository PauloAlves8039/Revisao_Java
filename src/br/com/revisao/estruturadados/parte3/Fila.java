/*
 * Arquivo: Classe - Fila
 * Autor: Paulo Alves
 * Descrição: responsável pelas funcionalidades de enfileiramento e verificação de nós
 * Data: 07/01/2020
*/

package br.com.revisao.estruturadados.parte3;

import br.com.revisao.estruturadados.parte2.ListaLigada;

public class Fila<T> {
	
	private ListaLigada<T> elementos;
	
	public Fila() {
		this.elementos = new ListaLigada<T>();
	}
	
	public boolean estaVazia() {
		return this.elementos.estaVazia();
	}
	
	public void enfileirar(T elemento) {
		this.elementos.inserir(elemento);
	}
	
	public T desenfileirar() {
		if(estaVazia()) {
			return null;
		}
		T resultado = this.elementos.recuperar(0);
		this.elementos.remover(0);
		return resultado;
	}

	@Override
	public String toString() {
		return "Fila [" + elementos.toString() + "]";
	}
	
}
