/*
 * Arquivo: Classe - Carro
 * Autor: Paulo Alves
 * Descrição: criada para exibir informações básicas do objeto carro através de herança derivada da classe VeiculoBase 
 * Data: 30/10/2019
*/

package br.com.revisao.poo;

public class Carro extends VeiculoBase {
	
	public Carro() {
		this.quantidadeRodas = 4;
	}
	
	public Carro(String modelo, String marca) {
		this.quantidadeRodas = 4;
		this.setModelo(modelo);
		this.setMarca(marca);
	}
}
