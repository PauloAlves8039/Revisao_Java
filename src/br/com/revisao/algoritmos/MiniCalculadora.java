/*
 * Arquivo: Classe - MiniCalculadora
 * Autor: Paulo Alves
 * Descri��o: simulando uma simples calculadora para uso de opera��es aritm�ticas 
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** MINI CALCULADORA *****");
		System.out.print("informe o primeiro n�mero: ");
		int num1 = input.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int num2 = input.nextInt();

		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int multiplica��o = num1 * num2;
		int divisao = num1 / num2;
		int modulo = num1 % num2;

		System.out.println("***** RESULTADO *****");
		System.out.println(String.format("A soma entre %d e %d �: %d", num1, num2, soma));
		System.out.println(String.format("A subtra��o entre %d e %d �: %d", num1, num2, subtracao));
		System.out.println(String.format("A multiplica��o entre %d e %d �: %d", num1, num2, multiplica��o));
		System.out.println(String.format("A divis�o entre %d e %d �: %d", num1, num2, divisao));
		System.out.println(String.format("O resto da divis�o entre %d e %d �: %2d", num1, num2, modulo));

		input.close();
	}
}
