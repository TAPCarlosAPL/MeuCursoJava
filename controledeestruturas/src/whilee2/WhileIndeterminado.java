package whilee2;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		Scanner nomeU = new Scanner(System.in);
		
		System.out.printf("Invocador, digite o seu nome: ");
		String nome = nomeU.nextLine();
		String resp1 = ("Bom dia, "+ nome);
		String conv1 = "Estou avaliando alguns arquivos, fique à vontade para escrever o que quiser aqui! =)";
		String resp2 = ("Até mais, Dev! "+ nome);
		String valor = "";
		
		while(!valor.equalsIgnoreCase("/sair")) {
			if(valor.equalsIgnoreCase("Bom dia")){
				System.out.println(resp1);
				System.out.println(conv1);
			}else if (valor.equalsIgnoreCase("Vou nessa")){
				System.out.println(resp2);
				System.out.println(
						"Digite /sair para sair a qualquer momento!");
				}
			valor = ent.nextLine();
		}
		ent.close();
	}
}
