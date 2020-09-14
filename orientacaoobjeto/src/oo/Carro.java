package oo;


public class Carro {
	
	protected final Motor motor;	
	/**protected boolean docEmDia = true;
	private int chassi = 5542442;
	public String nomeDono = "Carlos";
	int preco = 120000;//visibilidade default/pacote
	**/
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar(){
		if(motor.fatorInjecao < 2.6){
		motor.fatorInjecao += 0.4;
		}
	}
	void freiar(){
		if(motor.fatorInjecao > 0.5){
		motor.fatorInjecao -= 0.4;
		}
	}
	void ligar(){
		motor.ligado = true;
	}
	void desligar(){
		motor.ligado = false;
	}
	boolean estaLigado(){
		return motor.ligado;
	}
}
