/*
 * Arquivo: Classe - CondicionalIFELSEIF
 * Autor: Paulo Alves
 * Descri��o: verificando categoria de nadador atrav�s da idade com a condicional 'if/elseif'
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class CondicionalIFELSEIF {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("***** CATEGORIA DO NADADOR *****");
		System.out.print("Nome do nadador: ");
		String nome = input.nextLine();
		System.out.print("Informe a idade do nadador: ");
		int idade = input.nextInt();
		
		System.out.println("***** RESULTADO *****");
		if(idade <= 4) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos, n�o pode competir, ainda n�o tem a idade m�nima permitida: 5 anos!", nome, idade));
		}else if(idade >= 5 && idade <= 7) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria � => INFANTIL A. ", nome, idade));
		}else if(idade >= 8 && idade <= 10) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria � => INFANTIL B. ", nome, idade));
		}else if(idade >= 11 && idade <= 13) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria � => JUVENIL A. ", nome, idade));
		}else if(idade >= 14 && idade <= 17) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria � => JUVENIL B. ", nome, idade));
		}else if(idade >= 18 && idade <= 39) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria � => S�NIOR. ", nome, idade));
		}else if(idade >= 40 && idade <= 59) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria � => MASTER. ", nome, idade));
		}else if(idade >= 60) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos, n�o pode competir, j� chegou a idade m�xima permitida: 60 anos!", nome, idade));
		}
		
		input.close();
	}
}
