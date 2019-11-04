/*
 * Arquivo: Classe - Carro
 * Autor: Paulo Alves
 * Descri��o: criada para exibir informa��es b�sicas do objeto carro atrav�s de heran�a derivada da classe VeiculoBase 
 * Data: 30/10/2019
*/

package br.com.revisao.poo;

public class Carro extends VeiculoBase {
	
	private int quantidadePortas;
	
	public Carro() {
		this.quantidadeRodas = 4;
	}
	
	public Carro(String modelo, String marca, int quantidadePortas) {
		this.quantidadeRodas = 4;
		this.setModelo(modelo);
		this.setMarca(marca);
		this.setQuantidadePortas(quantidadePortas);
	}
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
}
