package conversor;

public class CalculoTemperatura {
	 public static void main(String[] args) {
		double f = 86;
		final double elemt = 5.0/9.0;
		final double ajuste = 32;
		
		//calculo 32 F - 32
		double celc = (f - ajuste)*elemt;
		
		System.out.println(celc);
		
	}
}
