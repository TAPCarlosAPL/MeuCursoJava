 package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		//Não dá pra converter um tipo int primitivo para um tipo classe: int -> Double
		//Sim, dá pra converter um double primitivo para um double tipo classe: double -> Double
		//Double a= 1.0;
		
		
		BinaryOperator<Double> cal = (x, y) ->{return x + y; };
		System.out.println(cal.apply(10.0, 10.0));
		
		cal = (x, y) -> x*y;
		System.out.println(cal.apply(11.0, 11.0));
		
		cal = (x, y) ->{return x/y; };
		System.out.println(cal.apply(12.0, 12.0));
		
		cal = (x, y) -> {return x-y;};
		System.out.println(cal.apply(13.0, 13.0));
		
		
		BinaryOperator<Integer> cal2 = (x, y) ->{return x + y; };
		System.out.println(cal2.apply(10, 10));
		
		cal2 = (x, y) -> x*y;
		System.out.println(cal2.apply(11, 11));
		
		cal2 = (x, y) ->{return x/y; };
		System.out.println(cal2.apply(12, 12));
		
		cal2 = (x, y) -> {return x-y;};
		System.out.println(cal2.apply(13, 13));
		
		
		BinaryOperator<String> cal3 = (x, y) ->{return x + y; };
		System.out.println(cal3.apply("Até", " Logo!"));
		
		
		
		}
	}

