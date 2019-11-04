/*
 * Arquivo: Classe - Moto
 * Autor: Paulo Alves
 * Descri��o: criada para exibir informa��es b�sicas do objeto moto atrav�s de heran�a derivada da classe VeiculoBase 
 * Data: 03/11/2019
*/

package br.com.revisao.poo;

public class Moto extends VeiculoBase {
	
	private int cilindrada;
	
	public Moto(String modelo, String marca, int cilindrada) {
		this.quantidadeRodas = 2;
		this.setModelo(modelo);
		this.setMarca(marca);
		this.setCilindrada(cilindrada);
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
