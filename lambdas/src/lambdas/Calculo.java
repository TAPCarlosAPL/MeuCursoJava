package lambdas;

@FunctionalInterface
public interface Calculo {
	public abstract double executar(double a, double b);
	
	default String msg1(){
		return "Opera��o Conclu�da...";	
	}
	static String msg2(){
		return "At� a pr�xima!";
	}
}
