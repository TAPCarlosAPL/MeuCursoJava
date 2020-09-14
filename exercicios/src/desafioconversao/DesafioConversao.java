package desafioconversao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		/*String s1 = JOptionPane.showInputDialog(
				"S1, digite o seu salário: ");
		String s2 = JOptionPane.showInputDialog(
				"S2, digite o seu salário: ");
		String s3 = JOptionPane.showInputDialog(
				"S3, digite o seu salário: ");
		
		double cs1 = Double.parseDouble(s1);
		double cs2 = Double.parseDouble(s2);
		double cs3 = Double.parseDouble(s3);
		
		double soma = cs1 + cs2 + cs3;
		System.out.println(
				"A média da soma dos últimos 3 salários dividos por 3 equivale á: "+ soma / 3);
		*/
		
		System.out.println("Digite o seu Primeiro Salário: ");
		String n1 = entrada.next().replace(",", ".");
		System.out.println("Digite o seu Segundo Salário: ");
		String n2 = entrada.next().replace(",", ".");
		System.out.println("Digite o seu Terceiro Salário: ");
		String n3 = entrada.next().replace(",", ".");
		
		double cn1 = Double.parseDouble(n1);
		double cn2 = Double.parseDouble(n2);
		double cn3 = Double.parseDouble(n3);
		
		Double soman = cn1 + cn2 + cn3;
		System.out.println(
				"A média da soma dos últimos 3 salários dividos por 3 equivale á: "+ soman / 3);
		
		entrada.close();
		
	}
}
