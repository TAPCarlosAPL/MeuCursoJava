package conjuntobagun�ado;

import java.util.HashSet;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//O HashSet j� faz as convers�es no conjunto,
		//Uma vez que o collections n�o suporta tipos primitivos
		//Ent�o ele converte um tipo primitivo em uma classe
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Mestre"); //String j� � objeto
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> characteres
		
		System.out.println("Tamanho �: "+ conjunto.size());
	
		System.out.println(conjunto.remove("Mestre"));
		System.out.println(conjunto.remove(1));
		System.out.println(conjunto.remove(1.2));
		
		System.out.println("O novo tamanho �: "+ conjunto.size());
		System.out.println(conjunto.contains("Mestre"));
		
		System.out.println("---------------------------------");
		
		HashSet nums = new HashSet();
		
		nums.add(true);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); <- UNI�O ENTRE DOIS CONJUNTOS
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
	}
}
