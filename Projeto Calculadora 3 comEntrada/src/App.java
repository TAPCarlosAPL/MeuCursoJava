import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		Scanner n1 = new Scanner(System.in);
		Scanner n2 =  new Scanner(System.in);
		
		double entrada1;
		double entrada2;
		double result;
		
		String operador;
		
		System.out.println("Escolha um operador aritimético de acordo como índice: \n1-SOMAR\n2-MULTIPLICAR\n3-SUBTRAIR\n4-DIVIDIR ");
		operador = op.nextLine();
		if(operador.equals("1") && !operador.equals("2") && !operador.equals("3") && !operador.equals("4")){
			System.out.println("Digite dois números: ");
			entrada1 = n1.nextDouble();
			entrada2 = n2.nextDouble();
			
			result = entrada1 + entrada2;//cálculo
			System.out.println("O resultado da soma é: " + result);
		}else if(operador.equals("2") && !operador.equals("1") && !operador.equals("3") && !operador.equals("4")){
			System.out.println("Digite dois números: ");
			entrada1 = n1.nextDouble();
			entrada2 = n2.nextDouble();
			
			result = entrada1 * entrada2;//cálculo
			System.out.println("O resultado da soma é: " + result);
		}else if(operador.equals("3") && !operador.equals("1") && !operador.equals("2") && !operador.equals("4")){
			System.out.println("Digite dois números: ");
			entrada1 = n1.nextDouble();
			entrada2 = n2.nextDouble();
			
			result = entrada1 - entrada2;//cálculo
			System.out.println("O resultado da soma é: " + result);
		}else if(operador.equals("4") && !operador.equals("1") && !operador.equals("2") && !operador.equals("3")){
			System.out.println("Digite dois números: ");
			entrada1 = n1.nextDouble();
			entrada2 = n2.nextDouble();
			
			result = entrada1 / entrada2;//cálculo
			System.out.println("O resultado da soma é: " + result);
		}else if(!operador.equals("1") && !operador.equals("2") && !operador.equals("3") && !operador.equals("4")){
			System.out.println("ERRO: OPÇÃO INVÁLIDA!");
		}
	}
}
