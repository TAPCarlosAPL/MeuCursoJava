package desafioconversao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		/*String s1 = JOptionPane.showInputDialog(
				"S1, digite o seu sal�rio: ");
		String s2 = JOptionPane.showInputDialog(
				"S2, digite o seu sal�rio: ");
		String s3 = JOptionPane.showInputDialog(
				"S3, digite o seu sal�rio: ");
		
		double cs1 = Double.parseDouble(s1);
		double cs2 = Double.parseDouble(s2);
		double cs3 = Double.parseDouble(s3);
		
		double soma = cs1 + cs2 + cs3;
		System.out.println(
				"A m�dia da soma dos �ltimos 3 sal�rios dividos por 3 equivale �: "+ soma / 3);
		*/
		
		System.out.println("Digite o seu Primeiro Sal�rio: ");
		String n1 = entrada.next().replace(",", ".");
		System.out.println("Digite o seu Segundo Sal�rio: ");
		String n2 = entrada.next().replace(",", ".");
		System.out.println("Digite o seu Terceiro Sal�rio: ");
		String n3 = entrada.next().replace(",", ".");
		
		double cn1 = Double.parseDouble(n1);
		double cn2 = Double.parseDouble(n2);
		double cn3 = Double.parseDouble(n3);
		
		Double soman = cn1 + cn2 + cn3;
		System.out.println(
				"A m�dia da soma dos �ltimos 3 sal�rios dividos por 3 equivale �: "+ soman / 3);
		
		entrada.close();
		
	}
}
