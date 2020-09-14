package desafiowhile;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		//aqui com while faz o loop indeterminado...
		//no qual s� sair� se o usu�rio digitar -1...
		//que � a condi��o definida para o fim do loop.
		while(nota != -1){
			System.out.println("Informe a nota (ou digite -1 para sair):");
			nota = ent.nextDouble();
			
			if(nota <= 10 && nota >= 0){
				total += nota;
				quantidadeNotas++;
			} else if(nota != -1){
				System.out.println("Nota inv�lida!");
			}
		}
		//AQUI CALCULA A M�DIA
		double media = total / quantidadeNotas;
		System.out.println("M�dia = "+ media);
		
		ent.close();
		}	
	}
