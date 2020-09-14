package oo;

public class CarroTeste2 {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		
		// Faltou Encapsulamento!
		//c1.motor.fatorInjecao = -30;
		System.out.println(c1.motor.giros());
		
		//Relação Bidirecional
		System.out.println(c1.motor.carro.motor.carro);
	}
}
