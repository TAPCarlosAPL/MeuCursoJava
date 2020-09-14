package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Erika;

public class Rayane extends Erika {
	
	Erika irma = new Erika();
	
	void testeAcessos(){

		System.out.println(irma.casa);
		System.out.println(irma.profissao);
		System.out.println(irma.relacionamento);
	}
	
	
}
