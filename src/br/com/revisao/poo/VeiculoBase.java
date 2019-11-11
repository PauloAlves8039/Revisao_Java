/*
 * Arquivo: Classe - VeiculoBase
 * Autor: Paulo Alves
 * Descri��o: classe de modelo para exibir informa��es b�sicas do objeto ve�culo
 * Data: 26/10/2019
*/

package br.com.revisao.poo;

import br.com.revisao.execoes.AbastecimentoException;
import br.com.revisao.execoes.AceleracaoVeiculoException;
import br.com.revisao.execoes.ChassiInvalidoException;
import br.com.revisao.execoes.FrenagemVeiculoException;
import br.com.revisao.interfaces.VeiculoInterface;

public abstract class VeiculoBase implements VeiculoInterface {

	// Atributos
	private String modelo;
	private String marca;
	private String chassi;
	protected int quantidadeRodas;
	private float quantidadeCombustivel;
	private Boolean ligado;
	protected float velocidade;

	// Construtor 
	public VeiculoBase() {
		this.ligado = true;
		this.velocidade = 0;
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

	public void setChassi(String chassi) throws ChassiInvalidoException {
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
	
	public float getVelocidade() {
		return velocidade;
	}

	// M�todos para a��es b�sicas do ve�culo
	public void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println("O ve�culo ligou!");
	}

	public void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println("O ve�culo desligou!");
	}

	public void abastecer(float litros) throws AbastecimentoException {
		if(!this.ligado) {
			quantidadeCombustivel += litros;
		}else {
			throw new AbastecimentoException();
		}		
	}
	
	public void acelerar() throws AceleracaoVeiculoException {
		if(this.ligado) {
			this.velocidade += 10;
		}else {
			throw new AceleracaoVeiculoException();
		}
	}
	
	public void frear() throws FrenagemVeiculoException {
		if(this.ligado) {
			this.velocidade -= 10;
		}else {
			throw new FrenagemVeiculoException();
		}
	}
	
	public abstract void preparar();
}
