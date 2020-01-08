/*
 * Arquivo: Classe - Fila
 * Autor: Paulo Alves
 * Descri��o: respons�vel pelas funcionalidades de enfileiramento e verifica��o de n�s
 * Data: 07/01/2020
*/

package br.com.revisao.estruturadados.parte3;

import br.com.revisao.estruturadados.parte2.ListaLigada;

public class Fila<T> {
	
	private ListaLigada<T> elementos;
	
	public Fila() {
		this.elementos = new ListaLigada<T>();
	}
	
}
