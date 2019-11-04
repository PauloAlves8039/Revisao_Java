/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descrição: utilizada como entry point(ponto de entrada) da aplicação para execução das classes no pacote poo
 * Data: 26/10/2019
*/

package br.com.revisao.poo;

import br.com.revisao.execoes.AbastecimentoException;
import br.com.revisao.execoes.ChassiInvalidoException;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("***** INFORMAÇÕES DOS VEÍCULOS *****");

			Carro v1 = new Carro();
			v1.setMarca("GM");
			v1.setModelo("Corsa");
			v1.setChassi("ABCDE");
			v1.setQuantidadePortas(4);
			System.out.println("A marca do veículo é: " + v1.getMarca());
			System.out.println("O modelo do veículo é: " + v1.getModelo());
			System.out.println("O chassi do veículo é: " + v1.getChassi());
			System.out.println("O veículo possui " + v1.getQuantidadePortas() + " portas.");
			System.out.println("O veículo possui " + v1.getQuantidadeRodas() + " rodas.");
			System.out.println("===== ESTADO DO VEÍCULO =====");
			v1.desligar();
			v1.abastecer(15.0f);
			System.out.println("O veículo " + v1.getModelo() + " está abastecido com " + v1.getQuantidadeCombustivel() + " litros!");

			System.out.println("==============================");

			Carro v2 = new Carro("Crossfox", "Wolkswagen", 4);
			v2.setChassi("FGHIJ");
			System.out.println("A marca do veículo é: " + v2.getMarca());
			System.out.println("O modelo do veículo é: " + v2.getModelo());
			System.out.println("O chassi do veículo é: " + v2.getChassi());
			System.out.println("O veículo possui " + v2.getQuantidadePortas() + " portas.");
			System.out.println("O veículo possui " + v2.getQuantidadeRodas() + " rodas.");

			System.out.println("===== ESTADO DO VEÍCULO =====");
			v2.desligar();
			v2.abastecer(18.0f);
			System.out.println("O veículo " + v2.getModelo() + " está abastecido com " + v2.getQuantidadeCombustivel() + " litros!");

			System.out.println("==============================");

			Moto m1 = new Moto("CB Twister", "Honda", 250);
			m1.setChassi("KLMNO");
			System.out.println("A marca do veículo é: " + m1.getMarca());
			System.out.println("O modelo do veículo é: " + m1.getModelo());
			System.out.println("O chassi do veículo é: " + m1.getChassi());
			System.out.println("O veículo possui " + m1.getCilindrada() + " cilindradas");
			System.out.println("O veículo possui " + m1.getQuantidadeRodas() + " rodas.");

			System.out.println("===== ESTADO DO VEÍCULO =====");
			m1.desligar();
			m1.abastecer(16.5f);
			System.out.println("O veículo " + m1.getModelo() + " está abastecido com " + m1.getQuantidadeCombustivel() + " litros!");
			
			System.out.println("==============================");

			Moto m2 = new Moto("FAZER 150 UBS", "Yamaha", 150);
			m2.setChassi("PQRST");
			System.out.println("A marca do veículo é: " + m2.getMarca());
			System.out.println("O modelo do veículo é: " + m2.getModelo());
			System.out.println("O chassi do veículo é: " + m2.getChassi());
			System.out.println("O veículo possui " + m2.getCilindrada() + " cilindradas");
			System.out.println(String.format("O veículo %s está ligado? %b ", m2.getModelo(), m2.isLigado()));
			System.out.println("O veículo possui " + m2.getQuantidadeRodas() + " rodas.");

			System.out.println("===== ESTADO DO VEÍCULO =====");
			m2.desligar();
			m2.abastecer(14.7f);
			System.out.println("O veículo " + m2.getModelo() + " está abastecido com " + m2.getQuantidadeCombustivel() + " litros!");			
		}catch(AbastecimentoException e) {
			System.out.println("Você não pode abastecer o veículo enquanto estiver ligado.");
		}catch(ChassiInvalidoException e) {
			System.out.println("Ocorre o seguinte erro na validação do chassi: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("##### Ocorreu o seguinte erro: " + e.getMessage());
		}
	}
}
