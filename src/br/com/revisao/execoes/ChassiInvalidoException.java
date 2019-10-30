/*
 * Arquivo: Classe - ChassiInvalidoException
 * Autor: Paulo Alves
 * Descri��o: criada para tratamento de exce��o na propriedade chassi atrav�s de heran�a derivada da classe Exception 
 * Data: 30/10/2019
*/

package br.com.revisao.execoes;

public class ChassiInvalidoException extends Exception {
	
	private static final long serialVersionUID = 1068633886499588785L;

	public ChassiInvalidoException(String chassi) {
		super(String.format("Este chassi � inv�lido [%s]", chassi));
	}
}
