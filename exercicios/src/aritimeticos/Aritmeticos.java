package aritimeticos;

public class Aritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		var x = 8.550;
		double y = 2.4;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 2;
		int b = 10;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); //cast
		
		System.out.println(a % b);
		System.out.println(2 % 10);
		System.out.println((x + y) - (a * b)/10);
		
		
		//FUNÇÃO MATEMÁTICA
		int c = 5;
		int d = 6;
		double u = 2.50;
		int j = 2;
		int l = 10;
		int ç = 3;
		
		int f1 = c + d;
		double f2 = u * l;
		double f3 = f1 + f2 / j;
		double resultf = f1 - f2 *f3/ç;
		
		System.out.println(resultf);
		
		
	}
}
