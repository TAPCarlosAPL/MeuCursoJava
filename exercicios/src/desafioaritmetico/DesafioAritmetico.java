package desafioaritmetico;

public class DesafioAritmetico {
	public static void main(String[] args) {
		
		double numA = Math.pow(6 *(3 + 2),2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB/ denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		System.out.println("O resultado é"+ resultado);
		
		//LOOPING COM FOR
		//O ALGORITMO CONTA ATÉ 999 A PARTIR DO VALOR DA VARIÁVEL RESULTADO
		//QUE TEM O VALOR DE 125.0
		//E QUANDO CHEGA A 999 O ALGORITMO CONTA EM ORDEM DECRESCENTE ATÉ O VALOR RESULTADO
		for(int i=126; i>resultado; i++)
		{
			System.out.println(i);
			if(i==999) 
			{
			while(i<=999 & i>resultado) 
			{
				i--;
				System.out.println(i);
			}
			}
			if(i==resultado) 
			{
				i++;
				System.out.println(i);
			}
			if(i==999) 
			{
				System.out.println(i);
				break;
			}
		}
		System.out.println("FIM DO LOOP");
	}
}
