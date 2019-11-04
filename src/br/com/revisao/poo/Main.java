/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descri��o: utilizada como entry point(ponto de entrada) da aplica��o para execu��o das classes no pacote poo
 * Data: 26/10/2019
*/

package br.com.revisao.poo;

import br.com.revisao.execoes.AbastecimentoException;
import br.com.revisao.execoes.ChassiInvalidoException;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("***** INFORMA��ES DOS VE�CULOS *****");

			Carro v1 = new Carro();
			v1.setMarca("GM");
			v1.setModelo("Corsa");
			v1.setChassi("ABCDE");
			v1.setQuantidadePortas(4);
			System.out.println("A marca do ve�culo �: " + v1.getMarca());
			System.out.println("O modelo do ve�culo �: " + v1.getModelo());
			System.out.println("O chassi do ve�culo �: " + v1.getChassi());
			System.out.println("O ve�culo possui " + v1.getQuantidadePortas() + " portas.");
			System.out.println("O ve�culo possui " + v1.getQuantidadeRodas() + " rodas.");
			System.out.println("===== ESTADO DO VE�CULO =====");
			v1.desligar();
			v1.abastecer(15.0f);
			System.out.println("O ve�culo " + v1.getModelo() + " est� abastecido com " + v1.getQuantidadeCombustivel() + " litros!");

			System.out.println("==============================");

			Carro v2 = new Carro("Crossfox", "Wolkswagen", 4);
			v2.setChassi("FGHIJ");
			System.out.println("A marca do ve�culo �: " + v2.getMarca());
			System.out.println("O modelo do ve�culo �: " + v2.getModelo());
			System.out.println("O chassi do ve�culo �: " + v2.getChassi());
			System.out.println("O ve�culo possui " + v2.getQuantidadePortas() + " portas.");
			System.out.println("O ve�culo possui " + v2.getQuantidadeRodas() + " rodas.");

			System.out.println("===== ESTADO DO VE�CULO =====");
			v2.desligar();
			v2.abastecer(18.0f);
			System.out.println("O ve�culo " + v2.getModelo() + " est� abastecido com " + v2.getQuantidadeCombustivel() + " litros!");

			System.out.println("==============================");

			Moto m1 = new Moto("CB Twister", "Honda", 250);
			m1.setChassi("KLMNO");
			System.out.println("A marca do ve�culo �: " + m1.getMarca());
			System.out.println("O modelo do ve�culo �: " + m1.getModelo());
			System.out.println("O chassi do ve�culo �: " + m1.getChassi());
			System.out.println("O ve�culo possui " + m1.getCilindrada() + " cilindradas");
			System.out.println("O ve�culo possui " + m1.getQuantidadeRodas() + " rodas.");

			System.out.println("===== ESTADO DO VE�CULO =====");
			m1.desligar();
			m1.abastecer(16.5f);
			System.out.println("O ve�culo " + m1.getModelo() + " est� abastecido com " + m1.getQuantidadeCombustivel() + " litros!");
			
			System.out.println("==============================");

			Moto m2 = new Moto("FAZER 150 UBS", "Yamaha", 150);
			m2.setChassi("PQRST");
			System.out.println("A marca do ve�culo �: " + m2.getMarca());
			System.out.println("O modelo do ve�culo �: " + m2.getModelo());
			System.out.println("O chassi do ve�culo �: " + m2.getChassi());
			System.out.println("O ve�culo possui " + m2.getCilindrada() + " cilindradas");
			System.out.println(String.format("O ve�culo %s est� ligado? %b ", m2.getModelo(), m2.isLigado()));
			System.out.println("O ve�culo possui " + m2.getQuantidadeRodas() + " rodas.");

			System.out.println("===== ESTADO DO VE�CULO =====");
			m2.desligar();
			m2.abastecer(14.7f);
			System.out.println("O ve�culo " + m2.getModelo() + " est� abastecido com " + m2.getQuantidadeCombustivel() + " litros!");			
		}catch(AbastecimentoException e) {
			System.out.println("Voc� n�o pode abastecer o ve�culo enquanto estiver ligado.");
		}catch(ChassiInvalidoException e) {
			System.out.println("Ocorre o seguinte erro na valida��o do chassi: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("##### Ocorreu o seguinte erro: " + e.getMessage());
		}
	}
}
