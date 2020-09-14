package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Erika;

public class Pedro extends Erika{
	
	Erika cunhada = new Erika();
	
	void testeAcessos(){

		System.out.println(cunhada.casa);
		System.out.println(cunhada.profissao);
		System.out.println(cunhada.relacionamento);
	}
	
}
