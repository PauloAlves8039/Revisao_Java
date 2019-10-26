/*
 * Arquivo: Classe - LacoFor
 * Autor: Paulo Alves
 * Descrição: exibindo de forma repetida uma quantidade de mensagem com o laço 'for'
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

public class LacoFor {

	public static void main(String[] args) {

		String msg = "Bem vindo(a) a linguagem Java!";

		for (int i = 1; i <= 10; i++) {
			System.out.println(msg);
		}
	}
}
