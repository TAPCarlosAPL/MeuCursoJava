package classe;

public class Produto {

	String nome;
	double preco;
	static double DESC = 0.50;
	
	Produto(){
	
	}
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		    //		if(!nomeInicial.equals("(ALGUM REM�DIO QUE N�O ESTEJA CONSTANDO NA LISTA)")){
			//		System.out.println("Est� faltando TAL REM�DIO no estoque!");
			//	}
	}
	
	double precoComDesconto(){
		return preco * (1- DESC);
	}
	double precoComDesconto(double descontoGerente){
		return preco * (1- DESC +  descontoGerente);
	}
}
