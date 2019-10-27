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
			System.out.println("***** INFORMA��ES DO VE�CULO *****");
			VeiculoBase v1 = new VeiculoBase();
			v1.setMarca("GM");
			v1.setModelo("Corsa");
			v1.setChassi("ABCDE");
			System.out.println("A marca do ve�culo �: " + v1.getMarca());
			System.out.println("O modelo do ve�culo �: " + v1.getModelo());
			System.out.println("===== ESTADO DO VE�CULO =====");
			v1.desligar();
			v1.abastecer(15.0f);
			System.out.println("O ve�culo " + v1.getModelo() + " est� abastecido com " + v1.getQuantidadeCombustivel() + " litros!");
		} catch (Exception e) {
			System.out.println("##### Ocorreu o seguinte erro: " + e.getMessage());
		}
	}
}
