/*
 * Arquivo: Classe - ChassiInvalidoException
 * Autor: Paulo Alves
 * Descrição: criada para tratamento de exceção na propriedade chassi através de herança derivada da classe Exception 
 * Data: 30/10/2019
*/

package br.com.revisao.execoes;

public class ChassiInvalidoException extends Exception {
	
	private static final long serialVersionUID = 1068633886499588785L;

	public ChassiInvalidoException(String chassi) {
		super(String.format("Este chassi é inválido [%s]", chassi));
	}
}
