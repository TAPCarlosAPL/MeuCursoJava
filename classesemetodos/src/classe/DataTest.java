package classe;

public class DataTest {
	public static void main(String[] args) {
		
		Data d1 = new Data(04,8,2020);
		d1.ano = 2023;
		//d1.dia = 04;
		//d1.mes = 8;
		//d1.ano = 2020;
		
		var d2 = new Data(04,8,2020);
		//d2.dia = 04;
		//d2.mes = 8;
		//d2.ano = 2020;
		
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
		System.out.printf("ANO de [%d] <-> [DIA[%d]] do [MÊS[%s]]", d1.ano, d1.dia, d1.mes);
	
		}
	}