package operadoresatribui��o;

public class Atribui��o {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b; 
		
		c += b; //� O MESMO QUE C = C +B;
		c -= a; //� O MESMO QUE C = C -A;
		c *= b; //� O MESMO QUE C = C *B;
		c /= a; //� O MESMO QUE C = C / A;
		
		
		//OPERADOR UN�RIO DE IINCREMENTO
		c++;
		System.out.println(c);
		
		c %= 2; //� O MESMO QUE C = C % 2;   0 ou 1
		System.out.println(c);
	}
}
