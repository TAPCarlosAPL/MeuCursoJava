package oo.desafio;

public class CompraTeste {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Carlos Alberto Passos");
		System.out.printf("Cliente: [%s]\n",cliente.nome);
		
		Compra c1 =  new Compra();
		c1.addItem("Cerveja", 5, 1);
		c1.addItem("Celular", 2000, 2);
		c1.addItem(new Produto("Bicicleta", 1000), 1);
		c1.addItem(new Produto("Relogio",500),3);
		System.out.print("Total de Itens da Compra 1 é: ");
		System.out.println("["+c1.itens.size()+"]");
		
		Compra c2 = new Compra();
		c2.addItem("Notebook", 2000, 2);
		c2.addItem(new Produto("PS5", 1000), 1);
		
		System.out.print("Total de Itens da Compra 2 é: ");
		System.out.println("["+c2.itens.size()+"]");
		
	    //System.out.println(c1.itens.size());
		//System.out.println(c2.itens.size());

		cliente.addCompra(c1);
		cliente.compras.add(c2);

		//System.out.println(cliente.compras.size());
		
		System.out.printf("Valor total das compras: ");
		System.out.println(cliente.obterValorTotal());
		
	}
}
