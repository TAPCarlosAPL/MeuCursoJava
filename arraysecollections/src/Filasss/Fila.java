package Filasss;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Ambos adicionam elementos na fila,
		//A diferen�a � o comportamento 
		//quando a fila est� cheia!
		fila.add("Carlos"); //lan�a uma exce��o
		fila.offer("Bia"); //Retorna false
		fila.offer("Daniel");
		fila.offer("Erika");
		
		
		//Peek e Element -> obter o pr�ximo elemento da fila,
		//(sem remover)
		//A diferen�a � o comportamento 
		//quando a fila est� vazia!
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lan�a uma exce��o
		System.out.println(fila.element());
		
		
		// Poll e Remove -> Obter o pr�ximo elemento
		//da fila e remover!
		//A diferen�a � o comportamento 
		//Quando a fila est� vazia!
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); //Lan�a uma exce��o
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
