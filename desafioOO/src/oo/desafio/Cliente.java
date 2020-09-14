package oo.desafio;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	void addCompra(Compra compra){
		this.compras.add(compra);
	}
	
	
	double obterValorTotal(){
		double total = 0;
		for(Compra compraAtual: compras){
			total += compraAtual.obterValorTotal();
		}
		return total;
	}
}
