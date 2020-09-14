package operadoresrelacionais;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		//FORMANDO A PALAVRA AMOR ATRÁVES DO PRINT E DA REFERENCIA
		//DO CODIGO NA TABELA UNICODE 
		System.out.println(a==b);
		System.out.print('\u0041');
		System.out.print('\u004D');
		System.out.print('\u004F');
		System.out.print('\u0052');
		
		System.out.println("\n");
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 6.5;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto?"+ temDesconto);
	}
}
