package tipos_primitivos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionário
		
		
		//tipos numericos inteiros
		byte mesesDeEmpresa = 12;
		short numeroDeVoos = 525;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223l;
		
		//tipos numericos reais
		float salario = 1_330.50f;
		double vendasAcumulados =  2_991_797_104.01;
		
		//tipos booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = '?'; //ativo
		
		//Dias de empresa
		System.out.println(mesesDeEmpresa * 365);
		//numero de viagens
		System.out.println(numeroDeVoos/2);
		//pontos por real (acumulados)
		System.out.println(pontosAcumulados / vendasAcumulados);
		//
		System.out.println(id + " ganha -> " + salario * mesesDeEmpresa);
		System.out.println("Férias?" + status);
		System.out.println("Está de férias, Verdadeiro ou Falso? "+ estaDeFerias);
	}
}
