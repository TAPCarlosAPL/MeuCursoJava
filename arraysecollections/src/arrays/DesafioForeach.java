package arrays;

import java.util.Scanner;

public class DesafioForeach {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Quantas notas? ");
		int qtNotas = ent.nextInt();
		double[] notas = new double[qtNotas];		
		
		for(int i=0; i<notas.length; i++){
			
			System.out.println("Informe a nota " + (i+1) + ": ");
			notas[i] = ent.nextDouble();
		}
		double total = 0;
		//foreach
		for(double nota: notas){
			total += nota;
		}
		double media = total / notas.length;
		System.out.println("A média é " + media + "!");		
		ent.close();
	}
}
