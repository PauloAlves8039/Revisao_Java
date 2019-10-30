/*
 * Arquivo: Classe - VeiculoBase
 * Autor: Paulo Alves
 * Descrição: classe de modelo para exibir informações básicas do objeto veículo
 * Data: 26/10/2019
*/
package br.com.revisao.poo;

import br.com.revisao.execoes.ChassiInvalidoException;

public class VeiculoBase {
	
	// Atributos
	private String modelo;
	private String marca;
	private String chassi;
	private int quantidadeRodas;
	private float quantidadeCombustivel;
	
	// Construtor default
	public VeiculoBase() {
	}
	
	// Métodos assessores get e set
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) throws Exception {
		if(chassi.length() == 5) {
			this.chassi = chassi;
		}else {
			throw new ChassiInvalidoException(chassi);
		}		
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	// Métodos para ações básicas do veículo
	public void ligar() {
		System.out.println("O veículo ligou!");
	}

	public void desligar() {
		System.out.println("O veículo desligou!");
	}

	public void abastecer(float litros) {
		quantidadeCombustivel += litros;
	}
}
