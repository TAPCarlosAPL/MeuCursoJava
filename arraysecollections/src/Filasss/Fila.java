package Filasss;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Ambos adicionam elementos na fila,
		//A diferença é o comportamento 
		//quando a fila está cheia!
		fila.add("Carlos"); //lança uma exceção
		fila.offer("Bia"); //Retorna false
		fila.offer("Daniel");
		fila.offer("Erika");
		
		
		//Peek e Element -> obter o próximo elemento da fila,
		//(sem remover)
		//A diferença é o comportamento 
		//quando a fila está vazia!
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceção
		System.out.println(fila.element());
		
		
		// Poll e Remove -> Obter o próximo elemento
		//da fila e remover!
		//A diferença é o comportamento 
		//Quando a fila está vazia!
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); //Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//
	}
}
