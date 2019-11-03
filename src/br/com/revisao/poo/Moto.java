/*
 * Arquivo: Classe - Moto
 * Autor: Paulo Alves
 * Descri��o: criada para exibir informa��es b�sicas do objeto moto atrav�s de heran�a derivada da classe VeiculoBase 
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
