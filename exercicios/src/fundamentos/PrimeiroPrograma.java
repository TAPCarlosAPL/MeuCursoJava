package fundamentos;

/**
 * @author Carlos
 * 
 * @param args
 */

public class PrimeiroPrograma {
	
	
	public static void main(String[] args) {
		/*
		int x = 10;
		int y = 20;
		int soma = (x + y);
		
		//Imprime na tela  o valor da soma
		System.out.println(soma);
		
		//imprime na tela a String
		System.out.println("Hello, Word! ^.^");
		*/
		double raio = 3.5;
		final double pi = 3.141519;
		pi = 1;
		
		double area = pi* raio  * raio;
		System.out.println(area);
		
		raio = 10;
		area = pi*raio*raio;
		System.out.println("Area = "+ area + " m2.");
	}
}
