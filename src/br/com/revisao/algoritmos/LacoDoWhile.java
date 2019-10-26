/*
 * Arquivo: Classe - LacoDoWhile
 * Autor: Paulo Alves
 * Descri��o: exibindo de forma repetida uma quantidade de mensagem com o la�o 'do while' 
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** REPETI��O DE MENSAGENS *****");
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
