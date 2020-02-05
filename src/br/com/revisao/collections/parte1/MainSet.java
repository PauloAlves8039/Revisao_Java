package br.com.revisao.collections.parte1;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Classe responsável pelo ponto de entrada da aplicação referente a collection set
 * 
 * @author Paulo Alves
 * @version 1.0 (04/02/20)
 */
public class MainSet {

	public static void main(String[] args) {
		
		Set<Pessoa> set = new LinkedHashSet<Pessoa>();
		set.add(new Pessoa(1, "Carlos"));
		set.add(new Pessoa(2, "Adriana"));
		set.add(null);
		
		System.out.println(set);
		set.add(new Pessoa(2, "Adriana"));
		System.out.println(set);
		
		for(Pessoa p : set) {
			System.out.println(p);
		}
	}
}
