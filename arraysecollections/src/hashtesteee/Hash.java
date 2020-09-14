package hashtesteee;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();		
		usuarios.add(new Usuario("Carlos"));
		usuarios.add(new Usuario("Erika"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Bruno"));
		
		System.out.println(usuarios.contains(new Usuario("Carlos")));
		
		
	}
}
