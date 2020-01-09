/*
 * Arquivo: Classe - Conjunto
 * Autor: Paulo Alves
 * Descri��o: respons�vel pela representa��o da estrutura de dados Set(Conjunto)
 * Data: 08/01/2020
*/

package br.com.revisao.estruturadados.parte4;

import br.com.revisao.estruturadados.parte2.ListaLigada;

public class Conjunto<T> {
	
	private ListaLigada<T> elementos;
	
	public Conjunto() {
		this.elementos = new ListaLigada<T>();
	}
}
