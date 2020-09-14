package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qntAlunos = ent.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qntNotas = ent.nextInt();
		
		
		//MATRIZ
		double[][] notasTurma = new double [qntAlunos][qntNotas];
		
		double total = 0;
		for(int a=0; a<notasTurma.length; a++){
			for(int n=0; n<notasTurma[a].length; n++){
				System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
				notasTurma[a][n] = ent.nextDouble();
				total += notasTurma[a][n];
			}
		}	
		double media = total / (qntAlunos * qntNotas);
		System.out.println("Média da turma é " + media);
		
		for(double[] notasDoAluno: notasTurma){
		System.out.println(Arrays.toString(notasDoAluno));
		}
		ent.close();
	}
}
