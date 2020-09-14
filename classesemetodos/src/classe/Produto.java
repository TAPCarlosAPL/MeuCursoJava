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
		    //		if(!nomeInicial.equals("(ALGUM REMÉDIO QUE NÃO ESTEJA CONSTANDO NA LISTA)")){
			//		System.out.println("Está faltando TAL REMÉDIO no estoque!");
			//	}
	}
	
	double precoComDesconto(){
		return preco * (1- DESC);
	}
	double precoComDesconto(double descontoGerente){
		return preco * (1- DESC +  descontoGerente);
	}
}
