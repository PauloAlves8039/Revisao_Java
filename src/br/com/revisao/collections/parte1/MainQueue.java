package br.com.revisao.collections.parte1;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Classe responsável pelo ponto de entrada da aplicação referente ao uso da estrutura Queue
 * 
 * @author Paulo Alves
 * @version 1.0 (07/02/20)
 *
 */
public class MainQueue {

	public static void main(String[] args) {
		
		Queue<Pessoa> queue = new PriorityQueue<Pessoa>();
		queue.add(new Pessoa(3, "Julia"));
		queue.add(new Pessoa(1, "Adriano"));
		queue.add(new Pessoa(4, "Danilo"));
		queue.add(new Pessoa(2, "Camila"));
		System.out.println(queue);
		
		System.out.println("");
		
		while(!queue.isEmpty()) {
			Pessoa p = queue.poll();
			System.out.println(p);
		}
	}

}
