package herançaa.desafio;

public class Celta extends Carro{
	
	@SuppressWarnings("unused")
	private int ano = 2012;
	protected String marca = "Chevrollet";
	
	public Celta() {
		super(145);
	}
	
	
	public void acelerar(){
		velocidadeAtual += 1*5;
	}
	public void frear(){
		if(velocidadeAtual >=5){
			velocidadeAtual -= 1*5;
		}
		else{
			velocidadeAtual = 0;
		}
	}
	public String toString() {
		return "Velocidade Atual do Celta é: " + velocidadeAtual + "Km/h";
	}
}

