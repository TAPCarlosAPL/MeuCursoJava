/**
 * @author Carlos
 * 
 */

//AQUI EU IREI CRIAR A MINHA PRIMEIRA CALCULADORA DIRETAMENTE DA MINHA CABE�A!
package desafiodomodulofundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		double n1;
		double n2;
		
		int op�1 = 1;
		int op�2 = 2;
		int op�3 = 3;
		int op�4 = 4;
		
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner (System.in);
		Scanner op = new Scanner(System.in);
		
		//CAPTURA DOS VALORES 
		System.out.println("Digite dois valores: ");
		n1 = num1.nextDouble();
		n2 = num2.nextDouble();
		System.out.printf("Voc� digitou os seguintes valores a serem calculados: %1f e %1f ",n1,n2);
						
		//CAPTURA DO OPERADOR DA PREFERENCIA DO USU�RIO		
		System.out.println("\nEscolha uma das seguntes op��es de operadores aritm�ticos:"
						+ "\n1(SUBTRA��O)\n2(ADI��O)\n3(DIVIS�O)\n4(MULTIPLICA��O)");
		double dop = op.nextDouble();
		if(dop==op�1 && dop!=op�2 && dop!=op�3 && dop!=op�4){
			double sub = n1 - n2;
			double resultSub = sub;
			System.out.printf(
					"O resultado da subtra��o �: %1f",resultSub);
			}
		if(dop==op�2 && dop!=op�1 && dop!=op�3 && dop!=op�4){
			double soma = n1 + n2;
			double resultSoma = soma;
			System.out.printf(
					"O resultado da soma �: %1f",resultSoma);
			}
		if(dop==op�3 && dop!=op�1 && dop!=op�2 && dop!=op�4){
			double div = n1 / n2;
			double resultDiv = div;
			System.out.printf(
					"O resultado da divis�o �: %.3f",resultDiv);
			}
			
		if(dop==op�4 && dop!=op�1 && dop!=op�2 && dop!=op�3){
			double mult = n1 * n2;
			double resultMult = mult;
			System.out.printf(
					"O resultado da multiplica��o �: %1f",resultMult);
			}
		if(dop!=op�1 && dop!=op�2 && dop!=op�3 && dop!=op�4){
				System.out.println("Desculpe, voc� n�o digitou algum operador v�lido! =( ");
				System.out.println("Desenvolvido por @DevCarlos @CarlosPassos");
			}		
		
		
		
	//TAMB�M TEM COMO CONSTRUIR A CALCULADORA ASSIM LOGO ABAIXO, 
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
