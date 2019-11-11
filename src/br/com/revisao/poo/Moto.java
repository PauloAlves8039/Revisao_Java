/*
 * Arquivo: Classe - Moto
 * Autor: Paulo Alves
 * Descri��o: criada para exibir informa��es b�sicas do objeto moto atrav�s de heran�a derivada da classe VeiculoBase 
 * Data: 03/11/2019
*/

package br.com.revisao.poo;

import br.com.revisao.execoes.AceleracaoVeiculoException;
import br.com.revisao.execoes.FrenagemVeiculoException;

public final class Moto extends VeiculoBase {
	
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
	
	@Override
	public void acelerar() throws AceleracaoVeiculoException{
		if(this.isLigado()) {
			this.velocidade += 3;
		}else {
			throw new AceleracaoVeiculoException();
		}
	}
	
	@Override
	public void frear() throws FrenagemVeiculoException {
		if(this.isLigado()) {
			this.velocidade -= 3;
		}else {
			throw new FrenagemVeiculoException();
		}
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o capacete.");		
	}

	@Override
	public void revisar() {
		System.out.println("O ve�culo de encontra em revis�o.");		
	}

	@Override
	public void manutencao() {
		System.out.println("O ve�culo se encontra em manuten��o.");		
	}
}
