package br.com.revisao.collections;

// import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Classe responsável pelo ponto de entrada da aplicação referente a collection set
 * 
 * @author Paulo Alves
 * @version 1.0 (04/02/20)
 */
public class MainSet {

	public static void main(String[] args) {
		
		Set<Pessoa> set = new TreeSet<Pessoa>();
		set.add(new Pessoa(2, "Adriana"));
		set.add(new Pessoa(3, "Daniela"));
		set.add(new Pessoa(1, "Carlos"));
		// set.add(null);
		
		System.out.println(set);
		System.out.println(set);
		
		System.out.println("");
		
		for(Pessoa p : set) {
			System.out.println(p);
		}
	}
}
