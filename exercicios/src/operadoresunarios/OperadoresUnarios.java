package operadoresunarios;

public class OperadoresUnarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;//a = a +1; (POSTFIX)
		a--;//a = a -1; (POSTFIX)
		
		++b;//a = b +1; (PR�FIXX)
		--b;//b = b -1; (PR�FIXX)
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a==b);
		System.out.println(a);
		System.out.println(b);
	}
}
