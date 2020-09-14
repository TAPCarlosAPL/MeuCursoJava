package classe;

public class Data {
	
	static int dia;
	int mes;
	int ano;
	
	Data(){
		//dia =1;
		//mes =1; 
		//ano = 2020;
		this(1, 1, 2020);
		String s = null;
		System.out.println(s);	
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		String.format("%d/%d/%d \n", dia, mes, ano);
		//System.out.printf("%d/%d/%d", exibirDia, exibirMes, exibirAno);
	}
	String obterDataFormatada(){
			final String formato = "%d/%d/%d";
			return String.format(formato, dia, mes, ano);
			
		}
	void imprimirDataFormatada(){
		System.out.println(this.obterDataFormatada());
		}
	}