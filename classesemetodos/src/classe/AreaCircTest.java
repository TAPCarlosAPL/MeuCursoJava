package classe;

public class AreaCircTest {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		//a1.PI = 10000;
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
		System.out.println(a1.area());	
		
		
		AreaCirc a2 = new AreaCirc(5);
		//a2.PI = 155;
		
		//AreaCirc.PI = 3.1415;
		System.out.println(a1.area());
		
		//AreaCirc.PI = 0.4;
		System.out.println(a2.area());
		
		System.out.println(a2.area());
	}
}
