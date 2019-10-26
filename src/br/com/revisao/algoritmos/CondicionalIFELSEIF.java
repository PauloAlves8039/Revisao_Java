/*
 * Arquivo: Classe - CondicionalIFELSEIF
 * Autor: Paulo Alves
 * Descrição: verificando categoria de nadador através da idade com a condicional 'if/elseif'
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
			System.out.println(String.format("O nadador(a) %s, tem %d anos, não pode competir, ainda não tem a idade mínima permitida: 5 anos!", nome, idade));
		}else if(idade >= 5 && idade <= 7) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria é => INFANTIL A. ", nome, idade));
		}else if(idade >= 8 && idade <= 10) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria é => INFANTIL B. ", nome, idade));
		}else if(idade >= 11 && idade <= 13) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria é => JUVENIL A. ", nome, idade));
		}else if(idade >= 14 && idade <= 17) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria é => JUVENIL B. ", nome, idade));
		}else if(idade >= 18 && idade <= 39) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria é => SÊNIOR. ", nome, idade));
		}else if(idade >= 40 && idade <= 59) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos a sua categoria é => MASTER. ", nome, idade));
		}else if(idade >= 60) {
			System.out.println(String.format("O nadador(a) %s, tem %d anos, não pode competir, já chegou a idade máxima permitida: 60 anos!", nome, idade));
		}
		
		input.close();
	}
}
