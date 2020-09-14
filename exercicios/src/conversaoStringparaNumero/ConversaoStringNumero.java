package conversaoStringparaNumero;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		System.out.println(valor1 + valor2);
		
		
		//COVERSOR DE STRING PARA NUMERO, NO CASO ABAIXO
		//ESPECIFICO DE DOUBLE, CONVERTENDO AS DUAS STRINGS DIGITADAS EM NUMEROS DO TIPO DOUBLE
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		//CRIANDO UMA VARIÁVEL QUE É RESULTANTE DA SOMA DAS VARIÁVEIS CRIADAS PARA  AS STRINGS QUE FORAM CONVERTIDAS PARA NÚMEROS
		double soma = numero1 + numero2;
		System.out.printf("A soma das notas %s + %s, divida por %d equivale a: ",valor1,valor2, 2);
		System.out.println(soma);
		System.out.println("A média é: "+ soma / 2);
	}
}
