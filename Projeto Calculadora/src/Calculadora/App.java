package Calculadora;

public class App {
	public static void main(String[] args) {
		
		Calculo calcularS = new Somar();
		//calcularS.executar(10, 10);
		System.out.println("A soma de 10 + 10 é: " + calcularS.executar(10, 10));
		
		Calculo calcsub = new Subtrair();
		//calcsub.executar(10, 10);
		System.out.println("A subtração de 10 - 10 é: " + calcsub.executar(10, 10));
		
		Calculo caldiv = new Dividir();
		//caldiv.executar(10, 10);
		System.out.println("A divisão de 10 / 10 é: " + caldiv.executar(10, 10));
		
		Calculo calmult = new Multiplicar();
		//calmult.executar(10, 10);
		System.out.println("A multiplicação de 10 * 10 é: " + calmult.executar(10, 10));
	}
}
