package switchpaconteee;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa ="preta";

		switch(faixa.toLowerCase()){
		case "preta":
			System.out.println("op��o 1: ");
		case "marrom":
			System.out.println("op��o 2: ");
		case "roxa":
			System.out.println("Op��o 3: ");
		case "verde":
			System.out.println("Op��o 4: ");
		case "laranja":
			System.out.println("Op��o 5: ");
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}
		
		int idade  = 3;
		
		//switch totalmente sem break
		switch(idade){
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
		
		
	}
}
