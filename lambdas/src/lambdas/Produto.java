package lambdas;

public class Produto extends Object{
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		//super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
}
