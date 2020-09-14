package desafiodiadasemana;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String dia = ent.next();
		
		
		if(dia.equalsIgnoreCase("Domingo")){
			System.out.println("1");	
		}else if("segunda".equalsIgnoreCase(dia)){
			System.out.println(2);
		}else if("terça".equalsIgnoreCase(dia) || 
				"terca".equalsIgnoreCase(dia)){
			System.out.println(3);
		}else if("quarta".equalsIgnoreCase(dia)){
			System.out.println(4);
		}else if("quinta".equalsIgnoreCase(dia)){
			System.out.println(5);
		}else if("sexta".equalsIgnoreCase(dia)){
			System.out.println(6);
		}else if("sábado".equalsIgnoreCase(dia) || 
				"sábado".equalsIgnoreCase(dia)){
			System.out.println(7);
		}else 
		{
			System.out.println("Dia inválido!");
		}
		
	}
}


/**
 * MEU JEITO NATURAL DE IDENTAÇÃO DOS BLOCOS NAS ESTRUTURAS IF/ELSE
 * 		if(dia.equalsIgnoreCase("Domingo"))
		{
			System.out.println(1);	
		}
		else if("segunda".equalsIgnoreCase(dia)){
			System.out.println(2);
		}
		else if("terça".equalsIgnoreCase(dia)){
			System.out.println(3);
		}
		else if("quarta".equalsIgnoreCase(dia)){
			System.out.println(4);
		}
		else if("quinta".equalsIgnoreCase(dia)){
			System.out.println(5);
		}
		else if("sexta".equalsIgnoreCase(dia)){
			System.out.println(6);
		}
		else if("sábado".equalsIgnoreCase(dia)){
			System.out.println(7);
		}
 * 
*/
