/*
 * Arquivo: Classe - CondicionalSwitch
 * Autor: Paulo Alves
 * Descrição: simulando uma mini calculadora com a condicional switch 
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** MINI CALCULADORA *****");
		System.out.print("Informe o primeiro número: ");
		int num1 = input.nextInt();
		System.out.print("Informe a operação: ");
		char operacao = input.next().charAt(0);
		System.out.print("Informe o segundo número: ");
		int num2 = input.nextInt();

		int resultado = 0;

		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		default:
			System.out.println("===== OPERAÇÃO INVÁLIDA! =====");
			break;
		}
		System.out.println("***** RESULTADO *****");
		System.out.println(String.format("%d %c %d = %d", num1, operacao, num2, resultado));

		input.close();
	}
}
