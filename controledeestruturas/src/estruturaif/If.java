package estruturaif;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media == 10.0 && media >= 7.0); 
		{
			System.out.println("Aprovado!");
			System.out.println("Parab�ns");
		}
		if(media <= 6.9 && media >= 4.5); 
		{
			System.out.println("Recupera��o");
			System.out.println("Estude mais!");
		}
		
		//OUTRA MANEIRA DE FAZER
		boolean criterioReprovacaoAtingido =
				media <4.5 && media >=0;
		if(criterioReprovacaoAtingido); 
		{
			System.out.println("REPROVADO!");
			System.out.println("SEFUDEU!");
		}
		entrada.close();
		}
}
