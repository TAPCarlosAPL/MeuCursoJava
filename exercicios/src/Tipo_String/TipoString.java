package Tipo_String;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Carlos";
		var sobrenome = "Lamounier";
		var idade = 24;
		var salario = 4.600;
		
		System.out.println("Nome: "+ nome + "\nSobrenome: "
				+ sobrenome 
				+ "\nIdade: " + idade 
				+ "\nSalário: "+ salario 
				+ "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome,sobrenome,idade,salario);
		
		//Esse achei o melhor metodo para formatar string
		//DEFINIÇÕES DE % COMO REFERENCIA: %s para formatar Strings, %d para valores inteiros, %f para valores flutuantes 
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qaualquer".substring(6, 13));
	}
}
