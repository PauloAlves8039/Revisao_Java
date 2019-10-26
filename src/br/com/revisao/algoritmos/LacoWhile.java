/*
 * Arquivo: Classe - LacoWhile
 * Autor: Paulo Alves
 * Descrição: exibindo contagem de forma decrescente de acordo com valor informado pelo usuário com o laço 'while'
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** CONTADOR REGRESSIVO *****");
		System.out.print("Informe um número: ");
		int numero = input.nextInt();

		int contador = 0;

		System.out.println("***** RESULTADO *****");
		if (numero >= 3) {
			while (contador <= numero) {
				System.out.println(numero--);
			}
		} else {
			System.out.println("Informe um número acima de 3!");
		}

		input.close();
	}
}
