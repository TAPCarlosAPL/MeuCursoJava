package continue2;

public class ContinueRotulado {
	public static void main(String[] args) {
		externo:
			for(int i=0; i<6; i++){
				for(int j=0; j<6; j++){
					
					if(i==0){
						continue externo;
					}
					System.out.printf("[%d %d] ", i,j);
				}
				System.out.println();
		}
	}
}
