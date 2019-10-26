/*
 * Arquivo: Classe - BoasVindas
 * Autor: Paulo Alves
 * Descrição: classe para exibir informações de uma pessoa utilizando tipos de dados diferentes
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class BoasVindas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade;
		float altura;
		Boolean casado = false;
		
		System.out.println("***** ENTRADA DE DADOS *****");
		
		System.out.print("Informe o seu nome: ");
		nome = input.nextLine();
		
		System.out.print("Informe a sua idade: ");
		idade = input.nextInt();
		
		System.out.print("Informe a sua altura: ");
		altura = input.nextFloat();
		
		System.out.println("***** BOAS VINDAS *****");
		System.out.println(String.format("Olá %s você tem  %d anos, tem %.2f de altura e seu estado civil de casado é %b!", nome, idade, altura, casado));
		
		input.close();
	}
}
