/*
 * Arquivo: Classe - Conjunto
 * Autor: Paulo Alves
 * Descrição: responsável pela representação da estrutura de dados Set(Conjunto)
 * Data: 08/01/2020
*/

package br.com.revisao.estruturadados.parte4;

import br.com.revisao.estruturadados.parte2.ListaLigada;

public class Conjunto<T> {

	private ListaLigada<T> elementos;

	public Conjunto() {
		this.elementos = new ListaLigada<T>();
	}

	public boolean inserir(T elemento) {
		if (elemento != null && !this.contem(elemento)) {
			this.elementos.inserir(elemento);
			return true;
		}
		return false;
	}

	public boolean inserirEm(int posicao, T elemento) {
		if (elemento != null && !this.contem(elemento)) {
			this.elementos.inserirEm(posicao, elemento);
			return true;
		}
		return false;
	}

	public boolean estaVazio() {
		return this.elementos.estaVazia();
	}

	public int tamanho() {
		return this.elementos.tamanho();
	}

	public boolean contem(T elemento) {
		return this.elementos.contem(elemento);
	}
}
