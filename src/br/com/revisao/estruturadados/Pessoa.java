/*
 * Arquivo: Classe - Pessoa
 * Autor: Paulo Alves
 * Descrição: criada para exibir informações básicas do objeto pessoa. 
 * Data: 10/11/2019
*/

package br.com.revisao.estruturadados;

public class Pessoa {

	private int id;
	private String nome;

	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
}
