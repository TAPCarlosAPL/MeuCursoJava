package herançaa.desafio.teste;

import herançaa.desafio.Celta;
import herançaa.desafio.CivicVTR;
import herançaa.desafio.Porshe;

public class CarroTeste {
	public static void main(String[] args) {
		
		CivicVTR civicvtr = new CivicVTR();
		civicvtr.acelerar();
		civicvtr.frear();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.turboOn();
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.turboOff();
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.acelerar();
		System.out.println(civicvtr);
		civicvtr.tetoSolarOn();

		//LIMITADOR DE VELOCIDADE DA PISTA (ou do carro)
		/**while(civicvtr.velocidadeAtual >= civicvtr.VELOCIDADE_MAXIMA){
			System.out.println("<<FREIO DA PISTA ATIVADO>>");
			System.out.println("ATENÇÃO: Você está indo rápido demais! ");
			System.out.println("Acionando freio automático da pista...");
			civicvtr.frear();
			civicvtr.frear();
			System.out.println(civicvtr);
		}*/
		CivicVTR tc1 = new CivicVTR(400);
		tc1.acelerar();
		tc1.frear();
		System.out.println(civicvtr);
		
		System.out.println("");
		
		Celta celta = new Celta();
		celta.acelerar();
		celta.frear();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		celta.acelerar();
		System.out.println(celta);
		//LIMITADOR DE VELOCIDADE DA PISTA
		while(celta.velocidadeAtual >= 60){
			System.out.println("<<FREIO DA PISTA ATIVADO>>");
			System.out.println("ATENÇÃO: Você está indo rápido demais! ");
			System.out.println("Acionando freio automático da pista...");
			celta.frear();
			celta.frear();
			System.out.println(celta);
		}
		
		System.out.println("");
		
		Porshe porshe = new Porshe();
		porshe.acelerar();
		porshe.frear();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		porshe.acelerar();
		System.out.println(porshe);
		//LIMITADOR DE VELOCIDADE DA PISTA
		while(porshe.velocidadeAtual >= 260){
			System.out.println("<<FREIO DA PISTA ATIVADO>>");
			System.out.println("ATENÇÃO: Você está indo rápido demais! ");
			System.out.println("Acionando freio automático da pista...");
			porshe.frear();
			porshe.frear();
			System.out.println(porshe);
		}
	}
}
