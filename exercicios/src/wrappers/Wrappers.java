package wrappers;
import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next()); 
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		
		//Algoritimo que adaptei pra validação, seja de senha, de teste e etc.
		//Entendi com esse algoritimo, na parte do tipo primitivo <<Boolean bo = Boolean.parseBoolean("True")>> 
		//e tbm <<Integer code = Integer.parseInt(entrada.next());>>
		//Que esse algoritimo pode ser usado para validação de algum dado de entrada, ou dados em geral.
		Boolean bo  = Boolean.parseBoolean("True");
		System.out.println("Digite a senha: ");
		Integer code = Integer.parseInt(entrada.next());
			
		if (code != 14) 
		{	
			bo = false;
			System.out.println(bo.toString().toUpperCase());
			System.out.println("Senha incorreta!");
		}
		else 
		{
			if (code == 14) 
		{	
			System.out.println(bo.toString().toUpperCase());
			System.out.println("Acesso Liberado!");
		}
		     entrada.close();
		     }
		
		}
		
	}

