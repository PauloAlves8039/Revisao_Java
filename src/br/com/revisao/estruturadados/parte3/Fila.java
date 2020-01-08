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
	
}
