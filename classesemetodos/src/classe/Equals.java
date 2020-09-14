package classe;

import java.util.Date;

import Usuario;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Carlos Passos";
		u1.email = "Carlos.lamounier@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Carlos Passos";
		u2.email = "Carlos.lamounier@gmail.com";
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
		//System.out.println(u2.equals(new Date()));
	}
}
