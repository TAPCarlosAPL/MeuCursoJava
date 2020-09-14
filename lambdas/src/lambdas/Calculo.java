package lambdas;

@FunctionalInterface
public interface Calculo {
	public abstract double executar(double a, double b);
	
	default String msg1(){
		return "Operação Concluída...";	
	}
	static String msg2(){
		return "Até a próxima!";
	}
}
