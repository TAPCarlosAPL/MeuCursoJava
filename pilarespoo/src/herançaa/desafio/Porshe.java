package herançaa.desafio;

public class Porshe extends Carro{
	
	@SuppressWarnings("unused")
	private String dono = "Carlos Lamounier";
	protected String marca = "Porshe";
	
	public Porshe() {
		super(340);
	}
	
	
	@Override
	public void acelerar() {
		velocidadeAtual += 6*5;
	}
	@Override
	public void frear() {
		velocidadeAtual -= 6*5;
	}
	public String toString(){
		return "Velocidade Atual da Porshe é: " + velocidadeAtual + "Km/h";
	}
}
