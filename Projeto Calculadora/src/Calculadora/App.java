package Calculadora;

public class App {
	public static void main(String[] args) {
		
		Calculo calcularS = new Somar();
		//calcularS.executar(10, 10);
		System.out.println("A soma de 10 + 10 �: " + calcularS.executar(10, 10));
		
		Calculo calcsub = new Subtrair();
		//calcsub.executar(10, 10);
		System.out.println("A subtra��o de 10 - 10 �: " + calcsub.executar(10, 10));
		
		Calculo caldiv = new Dividir();
		//caldiv.executar(10, 10);
		System.out.println("A divis�o de 10 / 10 �: " + caldiv.executar(10, 10));
		
		Calculo calmult = new Multiplicar();
		//calmult.executar(10, 10);
		System.out.println("A multiplica��o de 10 * 10 �: " + calmult.executar(10, 10));
	}
}
