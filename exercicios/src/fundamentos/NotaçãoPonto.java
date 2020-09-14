package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		String s =  "Bom dia, Carlos";
		s = s.toUpperCase();
		s = s.replace("Carlos", "Erika");
		s = s.concat("!! =)");
		System.out.println(s);
		
		String x = "Bom dia Junin".toUpperCase().concat("!!!");
		System.out.println(x);
		
	}
}
