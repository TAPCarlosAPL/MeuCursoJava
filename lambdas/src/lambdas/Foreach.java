package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Gui","Uva");
		List<String> reprovados = Arrays.asList("Joana","Nilse","Gil");
		
		System.out.println("<<Forma tradicional>>");
		for(String nome: aprovados){
			System.out.println(nome);
			}
		System.out.println("<<Forma tradicional>>");
		for(String nomeR: reprovados){
			System.out.println(nomeR);
			}
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "<Aprovado>"));
		System.out.println("\nLambda #02...");
		reprovados.forEach((nomeR) -> {System.out.println(nomeR + "<Reprovado>");});
		
		System.out.println("\nReref�ncia de um m�todo #01...");
		aprovados.forEach(System.out::println);
		reprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #03...");
		aprovados.forEach(nome -> imprimirNome(nome));
		System.out.println("\nReref�ncia de um m�todo #02...");
		aprovados.forEach(Foreach::imprimirNome);
		
		System.out.println("\nLambda #04...");
		reprovados.forEach(nomeR -> imprimirNome(nomeR));
		System.out.println("\nReref�ncia de um m�todo #03...");
		reprovados.forEach(Foreach::imprimirNome);
	}
	static void imprimirNome(String nome) {
		System.out.println("Ol�, meu nome � " + nome + "!!");
	}
}
