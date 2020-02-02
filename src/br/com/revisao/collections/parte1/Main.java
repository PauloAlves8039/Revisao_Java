/*
 * Arquivo: Classe - Main
 * Autor: Paulo Alves
 * Descrição: utilizada como entry point(ponto de entrada) para execução da aplicação. 
 * Data: 22/01/2020
*/

package br.com.revisao.collections.parte1;

import java.util.Comparator;
// import java.util.Collections;
// import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new LinkedList<Pessoa>();
		pessoas.add(new Pessoa(1, "Paulo"));
		pessoas.add(new Pessoa(5, "Luciano"));
		pessoas.add(new Pessoa(2, "Isadora"));
		pessoas.add(new Pessoa(6, "Pamela"));
		pessoas.add(new Pessoa(4, "Adriana"));
		pessoas.add(new Pessoa(7, "Bruno"));
		pessoas.add(new Pessoa(3, "Aiane"));
		
		// Collections.sort(pessoas, new PessoaComparator());
		
		/*
		pessoas.sort((o1, o2) -> {
			if(o1.getNome().length() == o2.getNome().length()) {
				return 0;
			}else if(o1.getNome().length() < o2.getNome().length()) {
				return -1;
			}
			return 1;
		});
		*/
		
		// pessoas.sort(Comparator.comparingInt(Pessoa::getId));
		
		// pessoas.sort(Comparator.naturalOrder());
		// pessoas.sort(Comparator.reverseOrder());
		
		pessoas.sort(Comparator.comparing(Pessoa::getNome, (o1, o2) -> {
			if (o1.length() == o2.length()) {
				return 0;
			} else if (o1.length() < o2.length()) {
				return -1;
			}
			return 1;
		}));
		
		/*
		System.out.println("Com Iterator:");
		Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
		while(iteratorPessoa.hasNext()) {
			Pessoa p = iteratorPessoa.next();
			if(p.getId() == 3) {
				iteratorPessoa.remove();
			}
			System.out.println(p);
		}
		*/
		
		pessoas.removeIf(p -> p.getId() == 3);
		System.out.println(pessoas);
		
		/*
		System.out.println("Com for-each:");
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		*/
		
		System.out.println("FIM!!!");
	}

}
