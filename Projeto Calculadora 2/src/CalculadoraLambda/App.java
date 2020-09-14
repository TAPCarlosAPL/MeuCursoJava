package CalculadoraLambda;

public class App {
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> x+y;
		System.out.println("A soma de 20 + 20 é: " + calc.executar(20, 20));
		
		calc = (x, y) -> x-y;
		System.out.println("A subtração de 20 + 20 é: " + calc.executar(20, 20));
		
		calc = (x, y) -> x*y;
		System.out.println("A multiplicação de 20 + 20 é: " + calc.executar(20, 20));
		
		calc = (x, y) -> x/y;
		System.out.println("A divisão de 20 + 20 é: " + calc.executar(20, 20));	
	}
}
