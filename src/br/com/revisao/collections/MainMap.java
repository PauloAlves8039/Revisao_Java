package br.com.revisao.collections;

import java.util.Comparator;
// import java.util.HashMap;
// import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Classe responsável pelo ponto de entrada da aplicação referente ao uso da collection Map
 * 
 * @author Paulo Alves
 * @version 1.0 (02/03/20)
 */
public class MainMap {

	public static void main(String[] args) {
		
		// Map<String, Pessoa> mapaPessoas = new HashMap<String, Pessoa>();
		// Map<String, Pessoa> mapaPessoas = new LinkedHashMap<String, Pessoa>(16, 0.75f, true);
		Map<String, Pessoa> mapaPessoas = new TreeMap<String, Pessoa>(Comparator.reverseOrder());
		System.out.println(mapaPessoas.put("Legal", new Pessoa(1, "Isadora")));
		System.out.println(mapaPessoas);
		System.out.println(mapaPessoas.put("Legal", new Pessoa(2, "Adriana")));
		System.out.println(mapaPessoas);
		// mapaPessoas.put(null, new Pessoa(-1, "NULO"));
		System.out.println(mapaPessoas);
		// mapaPessoas.put(null, new Pessoa(-2, "NULO 2"));
		System.out.println(mapaPessoas);
		mapaPessoas.put("teste", null);
		System.out.println(mapaPessoas);
		Pessoa p = mapaPessoas.get("legal");
		System.out.println(p);
		System.out.println(mapaPessoas);
		mapaPessoas.put("a", new Pessoa(100, "Daniela"));
		System.out.println(mapaPessoas);
	}

}
