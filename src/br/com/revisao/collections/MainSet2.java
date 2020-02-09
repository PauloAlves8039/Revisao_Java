package br.com.revisao.collections;

import java.util.HashSet;

/**
 * Classe respons�vel pelo ponto de entrada da aplica��o referente ao uso da collection set
 * 
 * @author Paulo Alves
 * @version 1.0 (08/02/20)
 */
public class MainSet2 {

	public static void main(String[] args) {
		
		HashSet<Pessoa> pessoas = new HashSet<Pessoa>();
		pessoas.add(new Pessoa(1, "Cristiane"));
		pessoas.add(new Pessoa(2, "Jo�o"));
		pessoas.add(new Pessoa(3, "Marina"));
		pessoas.add(new Pessoa(4, "Andr�"));
		pessoas.add(new Pessoa(2, "Jo�o"));
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
	}

}
