package hashtesteee;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		Set<String> listaApro = new TreeSet<>();
		listaApro.add("Carlos");
		listaApro.add("Erika");
		listaApro.add("Hanemman");
		listaApro.add("Pedro");
		
		for(String canditato: listaApro){
			System.out.println(canditato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(int n: nums){
			System.out.println(n);	
		}
		
	}
}
