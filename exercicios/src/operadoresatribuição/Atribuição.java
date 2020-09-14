package operadoresatribuição;

public class Atribuição {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b; 
		
		c += b; //É O MESMO QUE C = C +B;
		c -= a; //É O MESMO QUE C = C -A;
		c *= b; //É O MESMO QUE C = C *B;
		c /= a; //É O MESMO QUE C = C / A;
		
		
		//OPERADOR UNÁRIO DE IINCREMENTO
		c++;
		System.out.println(c);
		
		c %= 2; //É O MESMO QUE C = C % 2;   0 ou 1
		System.out.println(c);
	}
}
