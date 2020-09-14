package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		//Consumer<String> imprimir1 = valor1 -> System.out.println(valor1);
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!");
		Produto p1 = new Produto("Lápis", 12.20, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Caneta", 18.50, 0.09);
		Produto p3 = new Produto("Borracha", 10.00, 0.9);
		Produto p4 = new Produto("Caderno", 23.50, 0.5);
		Produto p5 = new Produto("Marca-texto", 16.00, 0.05);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimir);
	}
}	
