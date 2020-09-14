package continuepacote;

public class Continue {
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++){
			if(i%2==5){
				continue;
			}
			System.out.println(i);
			
		}System.out.println("\n\n");
		
		for(int i=0; i<=10; i++){
			if(i==5 || i==6 || i==7 || i==8)continue;
			System.out.println(i);
		}
	}
}
