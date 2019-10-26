/*
 * Arquivo: Classe - MiniCalculadora
 * Autor: Paulo Alves
 * Descrição: simulando uma simples calculadora para uso de operações aritméticas 
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** MINI CALCULADORA *****");
		System.out.print("informe o primeiro número: ");
		int num1 = input.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = input.nextInt();

		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int multiplicação = num1 * num2;
		int divisao = num1 / num2;
		int modulo = num1 % num2;

		System.out.println("***** RESULTADO *****");
		System.out.println(String.format("A soma entre %d e %d é: %d", num1, num2, soma));
		System.out.println(String.format("A subtração entre %d e %d é: %d", num1, num2, subtracao));
		System.out.println(String.format("A multiplicação entre %d e %d é: %d", num1, num2, multiplicação));
		System.out.println(String.format("A divisão entre %d e %d é: %d", num1, num2, divisao));
		System.out.println(String.format("O resto da divisão entre %d e %d é: %2d", num1, num2, modulo));

		input.close();
	}
}
