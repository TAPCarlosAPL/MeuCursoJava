package operadoreslogicos;

public class Logicos {
	public static void main(String[] args) {
		
		boolean cond1 = true; //
		boolean cond2 = 3 > 7; //Condição falsa, pois 3 não é maior que 7
		
		System.out.println(cond1 && !cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!cond2);
		System.out.println(!cond1);
		
		//Tabela verdade E
		System.out.println("TABELA VERDADE -> E <-");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//Tabela verdade OU (OR)
		System.out.println("\nTABELA VERDADE -> OU(OR) <-");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//Tabela verdade OU EXCLUSIVO (XOR)
		System.out.println("\nTABELA VERDADE -> OU EXCLUSIVO(XOR) <-");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//Tabela verdade NOT
		System.out.println("\nTABELA VERDADE -> NOT <-");
		System.out.println(!true);
		System.out.println(!false);	
	}
}
