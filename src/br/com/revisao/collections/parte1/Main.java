/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descrição: utilizada como entry point(ponto de entrada) para execução da aplicação. 
 * Data: 22/01/2020
*/

package br.com.revisao.collections.parte1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "Paulo"));
		pessoas.add(new Pessoa(2, "Isadora"));
		System.out.println(pessoas.toString());
	}

}
