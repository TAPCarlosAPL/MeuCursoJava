package conjuntobagunçado;

import java.util.HashSet;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//O HashSet já faz as conversões no conjunto,
		//Uma vez que o collections não suporta tipos primitivos
		//Então ele converte um tipo primitivo em uma classe
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Mestre"); //String já é objeto
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> characteres
		
		System.out.println("Tamanho é: "+ conjunto.size());
	
		System.out.println(conjunto.remove("Mestre"));
		System.out.println(conjunto.remove(1));
		System.out.println(conjunto.remove(1.2));
		
		System.out.println("O novo tamanho é: "+ conjunto.size());
		System.out.println(conjunto.contains("Mestre"));
		
		System.out.println("---------------------------------");
		
		HashSet nums = new HashSet();
		
		nums.add(true);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); <- UNIÃO ENTRE DOIS CONJUNTOS
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
	}
}
