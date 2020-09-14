package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		Calculo s1 = new Somar();
		Calculo m1 = new Multiplicar();
		Calculo d1 = new Dividir();
		
		System.out.println(s1.executar(2, 10));
		System.out.println(m1.executar(2, 10));
		System.out.println(d1.executar(2, 10));
		
		
	}
}
