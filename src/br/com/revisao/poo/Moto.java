/*
 * Arquivo: Classe - Moto
 * Autor: Paulo Alves
 * Descrição: criada para exibir informações básicas do objeto moto através de herança derivada da classe VeiculoBase 
 * Data: 03/11/2019
*/

package br.com.revisao.poo;

public class Moto extends VeiculoBase {
	
	public Moto(String modelo, String marca) {
		this.quantidadeRodas = 2;
		this.setModelo(modelo);
		this.setMarca(marca);
	}
}
