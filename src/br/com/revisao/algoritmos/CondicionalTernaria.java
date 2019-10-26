/*
 * Arquivo: Classe - CondicionalTernaria
 * Autor: Paulo Alves
 * Descri��o: verificando maior valor entre dois n�meros com o operador tern�rio 
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

		String resultado = (v1 > v2) ? "O primeiro valor � maior" : "O segundo valor � maior";

		System.out.println("***** MAIOR VALOR *****");
		System.out.println(resultado);

		input.close();
	}
}
