/**
 * @author Carlos
 * 
 */

//AQUI EU IREI CRIAR A MINHA PRIMEIRA CALCULADORA DIRETAMENTE DA MINHA CABEÇA!
package desafiodomodulofundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		double n1;
		double n2;
		
		int opç1 = 1;
		int opç2 = 2;
		int opç3 = 3;
		int opç4 = 4;
		
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner (System.in);
		Scanner op = new Scanner(System.in);
		
		//CAPTURA DOS VALORES 
		System.out.println("Digite dois valores: ");
		n1 = num1.nextDouble();
		n2 = num2.nextDouble();
		System.out.printf("Você digitou os seguintes valores a serem calculados: %1f e %1f ",n1,n2);
						
		//CAPTURA DO OPERADOR DA PREFERENCIA DO USUÁRIO		
		System.out.println("\nEscolha uma das seguntes opções de operadores aritméticos:"
						+ "\n1(SUBTRAÇÃO)\n2(ADIÇÃO)\n3(DIVISÃO)\n4(MULTIPLICAÇÃO)");
		double dop = op.nextDouble();
		if(dop==opç1 && dop!=opç2 && dop!=opç3 && dop!=opç4){
			double sub = n1 - n2;
			double resultSub = sub;
			System.out.printf(
					"O resultado da subtração é: %1f",resultSub);
			}
		if(dop==opç2 && dop!=opç1 && dop!=opç3 && dop!=opç4){
			double soma = n1 + n2;
			double resultSoma = soma;
			System.out.printf(
					"O resultado da soma é: %1f",resultSoma);
			}
		if(dop==opç3 && dop!=opç1 && dop!=opç2 && dop!=opç4){
			double div = n1 / n2;
			double resultDiv = div;
			System.out.printf(
					"O resultado da divisão é: %.3f",resultDiv);
			}
			
		if(dop==opç4 && dop!=opç1 && dop!=opç2 && dop!=opç3){
			double mult = n1 * n2;
			double resultMult = mult;
			System.out.printf(
					"O resultado da multiplicação é: %1f",resultMult);
			}
		if(dop!=opç1 && dop!=opç2 && dop!=opç3 && dop!=opç4){
				System.out.println("Desculpe, você não digitou algum operador válido! =( ");
				System.out.println("Desenvolvido por @DevCarlos @CarlosPassos");
			}		
		
		
		
	//TAMBÉM TEM COMO CONSTRUIR A CALCULADORA ASSIM LOGO ABAIXO, 
	//DE ACORDO COM  A RESPOSTA DO CURSO DA UDEMY
		/**
		 * Scanner entrada = new Scanner(System.in);
		 * 
		 * Sysou("Inform...o num: ");
		 * double num1 = entrada.nextDoube();
		 * 
		 * Sysou("Inform...o num :");
		 * double num2 = entrada.nextDouble();
		 * 
		 * Sysou("inform...operador: ");
		 * String op = entrada.next();
		 * 
		 * LOGICA
		 * 
		 * double resultado = "+".equas(op) ? num1 + num2 :0;
		 * resultado = "-".equals(op) ? num 1 - num 2 : resultado;
		 * resultado = "-".equals(op) ? num 1 * num 2 : resultado;
		 * resultado = "-".equals(op) ? num 1 / num 2 : resultado;
		 * 
		 * Sysou("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		 * entrada.close();
		 *}
		 */
		
	
	}
}
