package desafiowhile;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		//aqui com while faz o loop indeterminado...
		//no qual só sairá se o usuário digitar -1...
		//que é a condição definida para o fim do loop.
		while(nota != -1){
			System.out.println("Informe a nota (ou digite -1 para sair):");
			nota = ent.nextDouble();
			
			if(nota <= 10 && nota >= 0){
				total += nota;
				quantidadeNotas++;
			} else if(nota != -1){
				System.out.println("Nota inválida!");
			}
		}
		//AQUI CALCULA A MÉDIA
		double media = total / quantidadeNotas;
		System.out.println("Média = "+ media);
		
		ent.close();
		}	
	}
