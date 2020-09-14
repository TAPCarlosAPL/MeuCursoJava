package classe;

public class ValorvsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribui��o por valor
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6,2022);
		Data d2 = d1; //atribui��o por refer�ncia(Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		d2.ano = 2020;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		if(c==5){
			alterarPrimitivo(c);
			System.out.println(c);
		}	
	}
	static void voltarDataValorPadrao(Data d){
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;	
	}
	static void alterarPrimitivo(int a){
		a+=1;	
	}
}