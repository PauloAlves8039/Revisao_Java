package br.com.revisao.collections;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Classe responsável pelo ponto de entrada da aplicação referente ao uso da collection Hashtable
 * 
 * @author Paulo Alves
 * @version 1.0 (10/02/20)
 */
public class MainHashtable {

	public static void main(String[] args) {
		
		Hashtable<String, Pessoa> tabelaPessoas = new Hashtable<String, Pessoa>(20, 0.6f);
		tabelaPessoas.put("Funcionario", new Pessoa(1, "Amanda"));
		tabelaPessoas.put("Cliente", new Pessoa(2, "Silvio"));
		tabelaPessoas.put("Diretor", new Pessoa(3, "Carlos"));
		System.out.println(tabelaPessoas);
		System.out.println(tabelaPessoas.get("Funcionario"));
		
		System.out.println();
		
		Enumeration<String> chaves = tabelaPessoas.keys();
		tabelaPessoas.remove("Cliente");
		while(chaves.hasMoreElements()) {
			String chave = chaves.nextElement();
			System.out.println(" - " + tabelaPessoas.get(chave).toString());
		}
	}

}
