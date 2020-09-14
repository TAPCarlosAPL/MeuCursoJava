package desafioslogicos;

public class DesafioLogicos {
	public static void main(String[] args) {
		//LIGOU A LUZ? (V OU F)
		boolean luz1 = true;
		boolean luz2 = false;
		
		boolean ligouLuz = luz1 && luz2;
		boolean ligouLuz1 = luz1 ^ luz2;
		boolean ligouLuz2 = luz1 || luz2;
		
		System.out.println("Alguém ligou a luz!"+ligouLuz);
		System.out.println("Alguém ligou a luz!"+ligouLuz1);
		System.out.println("Alguém ligou a luz!"+ligouLuz2);
		
		//Operador unário
		System.out.println("Alguém ligou a luz!"+ !ligouLuz2);	
    }
}

	
