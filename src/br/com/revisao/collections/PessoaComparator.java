/*
 * Arquivo: Classe - PessoaComparator
 * Autor: Paulo Alves
 * Descrição: responsável por comparar elementos da classe Pessoa. 
 * Data: 27/01/2020
*/

package br.com.revisao.collections;

import java.util.Comparator;

public class PessoaComparator implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		if(o1.getNome().length() == o2.getNome().length()) {
			return 0;
		}
		if(o1.getNome().length() < o2.getNome().length()) {
			return -1;
		}
		return 1;
	}
}
