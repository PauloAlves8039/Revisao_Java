/*
 * Arquivo: Classe - CondicionalTernaria
 * Autor: Paulo Alves
 * Descrição: verificando maior valor entre dois números com o operador ternário 
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** MAIOR VALOR *****");
		System.out.print("Informe o primeiro valor: ");
		int v1 = input.nextInt();
		System.out.print("Informe o segundo valor: ");
		int v2 = input.nextInt();

		String resultado = (v1 > v2) ? "O primeiro valor é maior" : "O segundo valor é maior";

		System.out.println("***** MAIOR VALOR *****");
		System.out.println(resultado);

		input.close();
	}
}
