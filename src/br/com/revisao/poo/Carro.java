/*
 * Arquivo: Classe - Carro
 * Autor: Paulo Alves
 * Descri��o: criada para exibir informa��es b�sicas do objeto carro atrav�s de heran�a derivada da classe VeiculoBase 
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
