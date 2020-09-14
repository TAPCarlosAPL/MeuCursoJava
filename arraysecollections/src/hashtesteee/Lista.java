package hashtesteee;
import java.util.ArrayList;

public class Lista{

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Carlos");
		lista.add(u1);
		lista.add(new Usuario("Erika"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Bruna"));
		lista.add(new Usuario("Thiago"));
		
		System.out.println(lista.get(4)); //Acessar a lista pelo índice
		
		System.out.println("Removido? " + lista.remove(0));
		System.out.println("Removido? " + lista.remove(new Usuario("Thiago")));
		System.out.println("Tem? " + lista.contains(new Usuario ("Thiago")));
		
		for(Usuario u: lista){
			System.out.println(u);
		}
	}
}
