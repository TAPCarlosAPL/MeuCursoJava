package conversaotiposprimitivos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		
		double a = 1; //convers�o implicita
		System.out.println(a);
		
		float b = (float)1.1234567244152353453; //convers�o explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //convers�o expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; //convers�o expl�cita (CAST)
		System.out.println(f);
		
	}
}
