package dowhileee;
import java.util.Scanner;
/**
*{author}
*{date}
*@DevCarlos
*/
public class DoWhile {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		String texto = "";
		
		do {
			System.out.println("Fale as palavras m�gicas: ");
			System.out.println("Qual � a palavra? ");
			texto = ent.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));

		System.out.println("Por nada!! Obrigado :)");
		ent.close();	
	}
}