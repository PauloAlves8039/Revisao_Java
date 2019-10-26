/*
 * Arquivo: Classe - LacoDoWhile
 * Autor: Paulo Alves
 * Descrição: exibindo de forma repetida uma quantidade de mensagem com o laço 'do while' 
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** REPETIÇÃO DE MENSAGENS *****");
		System.out.println("Digite o seu nome: ");
		String nome = input.nextLine();

		int contador = 0;

		do {
			System.out.println("Bem vindo(a) a linguagem Java - " + nome);
			contador++;
		} while (contador <= 10);

		input.close();
	}
}
