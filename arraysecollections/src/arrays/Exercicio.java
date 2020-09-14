package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA [0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 10.0;
				
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length -1]);
		//System.out.println(notasAlunoA[4]); ERRO! 
		//TENTEI ACESSAR UM ELEMENTO FORA DOS LIMITES DO ARRAY
		
		double total = 0;
		for(int i=0; i< notasAlunoA.length; i++){
			total += notasAlunoA[i];
			}
		System.out.println(total / notasAlunoA.length);	
		
		double[] notasAlunoB = {10.0, 9.0, 8.0, 7.0};
		double totalAlunoB = 0;
		for(int i=0; i<notasAlunoB.length; i++){
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		}
	}
