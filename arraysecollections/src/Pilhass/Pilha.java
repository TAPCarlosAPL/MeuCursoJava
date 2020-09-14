package Pilhass;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		livros.add("Grande Homem");
		livros.add("Pequeno Homem");
		livros.add("Médio Homem");
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.contains("Grande Homem"));
		System.out.println(livros.isEmpty());
		System.out.println(livros.pop());
		//System.out.println(livros.pop());
		//System.out.println(livros.pop());
		//System.out.println(livros.pop());
		
		//MÉTODOS QUE PODEM SER USADOS
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
		
		for(String livro: livros){
			System.out.println(livro);
		}	
	}
}
