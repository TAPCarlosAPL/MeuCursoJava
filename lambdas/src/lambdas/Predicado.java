package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> isCaroComDesconto = prod -> (prod.preco *(1 - prod.desconto)) >=12000;
		Predicate<Produto> isCaro = prod -> prod.preco >= 12000;
		
		Produto produto = new Produto("Carro", 24000.00, 0.5);//0.5 significa 5% de desconto
		System.out.println(isCaro.test(produto));
		System.out.println(isCaroComDesconto.test(produto));
	}
}
