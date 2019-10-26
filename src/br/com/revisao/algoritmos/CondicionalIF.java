/*
 * Arquivo: Classe - CondicionalIF
 * Autor: Paulo Alves
 * Descrição: verificando se pessoa é maior de idade com a condicional 'if'
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class CondicionalIF {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** MAIOR DE IDADE *****");
		System.out.print("Informe a sua idade: ");
		int idade = input.nextInt();

		System.out.println("***** RESULTADO *****");
		if (idade >= 18) {
			System.out.println(String.format("Parabéns, você tem %d anos e já é maior de idade!", idade));
		}

		input.close();
	}
}
