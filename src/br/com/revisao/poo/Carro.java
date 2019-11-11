/*
 * Arquivo: Classe - Carro
 * Autor: Paulo Alves
 * Descrição: criada para exibir informações básicas do objeto carro através de herança derivada da classe VeiculoBase 
 * Data: 30/10/2019
*/

package br.com.revisao.poo;

public final class Carro extends VeiculoBase {
	
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

	@Override
	public void preparar() {
		System.out.println("Colocar o cinto de segurança.");		
	}

	@Override
	public void revisar() {
		System.out.println("O veículo de encontra em revisão.");		
	}

	@Override
	public void manutencao() {
		System.out.println("O veículo se encontra em manutenção.");			
	}
}
