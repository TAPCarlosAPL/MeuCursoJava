package Sistema;

import java.util.function.Predicate;

public class DescontoProduto {
	public static void main(String[] args) {
	Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 11000.00;
		
		Produto produto = new Produto("Carro", 24000.00, 0.5);
		System.out.println(isCaro.test(produto));
	}
}
