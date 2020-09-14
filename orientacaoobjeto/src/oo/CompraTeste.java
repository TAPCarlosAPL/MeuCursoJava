package oo;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Carlos Lamounier";
		
		c1.adcionarItem(new Item("Café", 1, 7.99));
		c1.adcionarItem(new Item("Pão-de-Queijo", 1, 1.99));
		c1.adcionarItem(new Item("Wifi", 1, 0.50));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		//Só para mostrar a relação BIDERECIONAL, mesmo em uma relação 1 para N
		double total = c1.itens.get(1).compra.itens.get(2).compra.obterValorTotal();
		System.out.println("O total é R$ "+ total);
	}
}
