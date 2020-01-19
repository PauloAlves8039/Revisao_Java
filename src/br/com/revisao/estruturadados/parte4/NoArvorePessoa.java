/*
 * Arquivo: Classe - NoArvorePessoa
 * Autor: Paulo Alves
 * Descrição: responsável por herdar elementos da classe NoArvore para representar elementos relacionado a entidade Pessoa  
 * Data: 19/01/2020
*/

package br.com.revisao.estruturadados.parte4;

import br.com.revisao.estruturadados.parte1.Pessoa;

public class NoArvorePessoa extends NoArvore<Pessoa> {

	public NoArvorePessoa(Pessoa valor) {
		super(valor);
	}

	@Override
	public int peso() {
		return this.valor.getId();
	}	
	
}
