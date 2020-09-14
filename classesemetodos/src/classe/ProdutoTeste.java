package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
	
		Produto p1 = new Produto("Dipirona", 10.66);
		//p1.nome = "Dipirona";
		//p1.preco = 17.66;
		//p1.desconto = 0.25;
		
		var p2 = new Produto("Dorflex", 18.99);
		//p2.nome = "DorFlex 36";
		//p2.preco = 18.99;
		//p2.desconto = 0.25;
		
		//ALTERANDO O DESCONTO COM O ATRIBUTO STATICO DESC,
		//ACESSANDO A ALTERAÇÃO DO DESCONTO DIRETAMENTE DA CLASSE
		Produto.DESC = 0.40;
		System.out.println(p1.nome + " <- O valor com 40% de desconto é: " + p1.precoComDesconto());
		System.out.println(p2.nome + " <- O valor com 40% de desconto é: " + p2.precoComDesconto());
		
		
		//ALGORITMO APENAS PARA DESENHAR NA TELA UM SEPARADOR
		for(String s = "="; !s.equals("===="); s += "="){
			System.out.println(s);
		}
		//ALGORITMO APENAS PARA DESENHAR NA TELA UM SEPARADOR
		String y = "====";
		if(y == "===="){
			System.out.println("===");
			System.out.println("==");
			System.out.println("=");
		}
		
		
		System.out.println("["+p1.nome+"]" 
		+ "["+p1.preco+"]" 
		+ "["+p1.DESC+"]" 
		+ "["+p1.precoComDesconto()+"]");
		
		System.out.println("["+p2.nome+"]" 
		+ "["+p2.preco+"]" 
		+ "["+p2.DESC+"]" 
		+ "["+ p2.precoComDesconto() +"]");
		
		
		//ALGORITMO APENAS PARA DESENHAR NA TELA UM SEPARADOR
		for(String u = "="; !u.equals("===="); u += "="){
			System.out.println(u);
		}
		//ALGORITMO APENAS PARA DESENHAR NA TELA UM SEPARADOR
		String c = "====";
		if(c == "===="){
			System.out.println("===");
			System.out.println("==");
			System.out.println("=");
		}
				
				
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = precoFinal1 + precoFinal2;
		
		System.out.printf("A média do carrinho é: R$%.2f.", mediaCarrinho);
	}
}
