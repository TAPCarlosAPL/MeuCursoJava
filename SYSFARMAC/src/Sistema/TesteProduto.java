package Sistema;

import java.util.Arrays;
import java.util.List;

public class TesteProduto {
	public static void main(String[] args) {
		
		List<String> produtoLista = Arrays.asList("Azitromicina","Dipirona","Ibuprofeno");
		for(String contemEstoque: produtoLista){
			System.out.println(contemEstoque);
		}
		produtoLista.forEach(contemEstoque -> System.out.println(contemEstoque + " <<Disponível no Estoque>>"));
	}
}
