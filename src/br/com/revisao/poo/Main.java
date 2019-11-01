/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descrição: utilizada como entry point(ponto de entrada) da aplicação para execução das classes no pacote poo
 * Data: 26/10/2019
*/

package br.com.revisao.poo;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("***** INFORMAÇÕES DO VEÍCULO *****");
			Carro v1 = new Carro();
			v1.setMarca("GM");
			v1.setModelo("Corsa");
			v1.setChassi("ABCDE");
			System.out.println("A marca do veículo é: " + v1.getMarca());
			System.out.println("O modelo do veículo é: " + v1.getModelo());
			System.out.println("O chassi do veículo é: " + v1.getChassi());
			System.out.println("O veículo possui " + v1.getQuantidadeRodas() + " rodas.");
			System.out.println("===== ESTADO DO VEÍCULO =====");
			v1.desligar();
			v1.abastecer(15.0f);
			System.out.println("O veículo " + v1.getModelo() + " está abastecido com " + v1.getQuantidadeCombustivel() + " litros!");
		} catch (Exception e) {
			System.out.println("##### Ocorreu o seguinte erro: " + e.getMessage());
		}
	}
}
