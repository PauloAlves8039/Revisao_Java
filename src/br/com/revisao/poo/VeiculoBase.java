/*
 * Arquivo: Classe - VeiculoBase
 * Autor: Paulo Alves
 * Descri��o: classe de modelo para exibir informa��es b�sicas do objeto ve�culo
 * Data: 26/10/2019
*/

package br.com.revisao.poo;

import br.com.revisao.execoes.ChassiInvalidoException;

public class VeiculoBase {

	// Atributos
	private String modelo;
	private String marca;
	private String chassi;
	protected int quantidadeRodas;
	private float quantidadeCombustivel;
	private Boolean ligado;

	// Construtor 
	public VeiculoBase() {
		this.ligado = true;
	}

	// M�todos assessores get e set
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
		if (chassi.length() == 5) {
			this.chassi = chassi;
		} else {
			throw new ChassiInvalidoException(chassi);
		}
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public Boolean isLigado() {
		return ligado;
	}

	// M�todos para a��es b�sicas do ve�culo
	public void ligar() {
		this.ligado = true;
		System.out.println("O ve�culo ligou!");
	}

	public void desligar() {
		this.ligado = false;
		System.out.println("O ve�culo desligou!");
	}

	public void abastecer(float litros) {
		quantidadeCombustivel += litros;
	}
}
