package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo cal = (x, y) ->{return x + y; };
		System.out.println(cal.executar(10, 10));
		
		cal = (x, y) -> x*y;
		System.out.println(cal.executar(11, 11));
		
		cal = (x, y) ->{return x/y; };
		System.out.println(cal.executar(12, 12));
		
		cal = (x, y) -> {return x-y;};
		System.out.println(cal.executar(13, 13));
		
		System.out.println(cal.msg1());
		System.out.println(Calculo.msg2());
		}
	}

