package CalculadoraLambda;

public class App {
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> x+y;
		System.out.println("A soma de 20 + 20 �: " + calc.executar(20, 20));
		
		calc = (x, y) -> x-y;
		System.out.println("A subtra��o de 20 + 20 �: " + calc.executar(20, 20));
		
		calc = (x, y) -> x*y;
		System.out.println("A multiplica��o de 20 + 20 �: " + calc.executar(20, 20));
		
		calc = (x, y) -> x/y;
		System.out.println("A divis�o de 20 + 20 �: " + calc.executar(20, 20));	
	}
}
