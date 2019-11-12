/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descri��o: utilizada como entry point(ponto de entrada) para execu��o da aplica��o. 
 * Data: 10/11/2019
*/

package br.com.revisao.estruturadados;

import java.util.Scanner;

import br.com.revisao.estruturadados.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a op��o desejada: ");
		System.out.println("1. Gerenciamento de mem�ria");
		int opcao = input.nextInt();
		
		switch(opcao) {
		case 1:
			gerenciamentoMemoria();
			break;
		}
		
		input.close();
	}
	
	static void gerenciamentoMemoria() {
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("********************");
		Pessoa p1 = new Pessoa(1, "Paulo");
		System.out.println(p1.toString());
		Pessoa p2 = new Pessoa(1, "Paulo");
		System.out.println(p2.toString());
		System.out.println("--------------------");
		p2.setNome("Pedro");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}

}
