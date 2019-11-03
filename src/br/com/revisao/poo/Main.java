/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descri��o: utilizada como entry point(ponto de entrada) da aplica��o para execu��o das classes no pacote poo
 * Data: 26/10/2019
*/

package br.com.revisao.poo;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("***** INFORMA��ES DOS VE�CULOS *****");

			Carro v1 = new Carro();
			v1.setMarca("GM");
			v1.setModelo("Corsa");
			v1.setChassi("ABCDE");
			System.out.println("A marca do ve�culo �: " + v1.getMarca());
			System.out.println("O modelo do ve�culo �: " + v1.getModelo());
			System.out.println("O chassi do ve�culo �: " + v1.getChassi());
			System.out.println("O ve�culo possui " + v1.getQuantidadeRodas() + " rodas.");
			System.out.println("===== ESTADO DO VE�CULO =====");
			v1.desligar();
			v1.abastecer(15.0f);
			System.out.println("O ve�culo " + v1.getModelo() + " est� abastecido com " + v1.getQuantidadeCombustivel() + " litros!");

			System.out.println("==============================");

			Carro v2 = new Carro("Crossfox", "Wolkswagen");
			v2.setChassi("FGHIJ");
			System.out.println("A marca do ve�culo �: " + v2.getMarca());
			System.out.println("O modelo do ve�culo �: " + v2.getModelo());
			System.out.println("O chassi do ve�culo �: " + v2.getChassi());
			System.out.println("O ve�culo possui " + v2.getQuantidadeRodas() + " rodas.");

			System.out.println("===== ESTADO DO VE�CULO =====");
			v2.desligar();
			v2.abastecer(18.0f);
			System.out.println("O ve�culo " + v2.getModelo() + " est� abastecido com " + v2.getQuantidadeCombustivel() + " litros!");

			System.out.println("==============================");

			Moto m1 = new Moto("CB Twister", "Honda");
			m1.setChassi("KLMNO");
			System.out.println("A marca do ve�culo �: " + m1.getMarca());
			System.out.println("O modelo do ve�culo �: " + m1.getModelo());
			System.out.println("O chassi do ve�culo �: " + m1.getChassi());
			System.out.println("O ve�culo possui " + m1.getQuantidadeRodas() + " rodas.");

			System.out.println("===== ESTADO DO VE�CULO =====");
			m1.ligar();
			m1.abastecer(16.5f);
			System.out.println("O ve�culo " + m1.getModelo() + " est� abastecido com " + m1.getQuantidadeCombustivel()
					+ " litros!");
		} catch (Exception e) {
			System.out.println("##### Ocorreu o seguinte erro: " + e.getMessage());
		}
	}
}
