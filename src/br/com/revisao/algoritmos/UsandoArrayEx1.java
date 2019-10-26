/*
 * Arquivo: Classe - UsandoArrayEx1
 * Autor: Paulo Alves
 * Descrição: usando um vetor com 4 elementos para listar nomes de pessoas 
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

public class UsandoArrayEx1 {

	public static void main(String[] args) {

		String[] nomes = new String[4];

		nomes[0] = "Maria";
		nomes[1] = "Daniel";
		nomes[2] = "Adriana";
		nomes[3] = "Carlos";

		System.out.println("***** LISTA DE PESSOAS *****");
		for (String pessoas : nomes) {
			System.out.println(pessoas);
		}
	}
}
