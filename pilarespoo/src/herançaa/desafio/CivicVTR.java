package herançaa.desafio;

public class CivicVTR extends Carro implements Esportivo, Luxo{

	@SuppressWarnings("unused")
	private String dono = "Carlos";
	private boolean ativarTurbo;
	private boolean ativarTeto;
	@SuppressWarnings("unused")
	private boolean ativarSom;
	
	//construtor
	public CivicVTR() {
		this(380);
	}
	public CivicVTR(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(5*4);
	}
	
	//interfaces
		@Override
		public void turboOn() {
			ativarTurbo = true;
		}
		@Override
		public void turboOff() {
			ativarTurbo = false;
		}
		public int getDelta(){
			if(ativarTurbo){
				return 5*10;
			}else{
				return 5*4;
			}
		}
		
		@Override
		public void tetoSolarOn() {
			ativarTeto = true;
		}
		@Override
		public void tetoSolarOff() {
			ativarTeto = false;
		}
	
		public String toString() {
			if(ativarTeto){
				return "Abrindo teto Solar...\nTeto solar aberto!";
			}
			return "Velocidade Atual do Civic é: " + velocidadeAtual + "Km/h";	
		}
	}
	
	//métodos
	/**public void acelerar() {
		if(velocidadeAtual + delta * 4 > VELOCIDADE_MAXIMA || velocidadeAtual + delta*10 > VELOCIDADE_MAXIMA){
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
		velocidadeAtual += delta * 4;
		}
	}
	@Override
	public void frear() {
		velocidadeAtual -= 4*5;
	}**/
	
	
	
	//@Override
	/**void acelerar() {
		if(velocidadeAtual + delta * 4 > VELOCIDADE_MAXIMA){
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
		velocidadeAtual += delta * 4;
		}
	}
	void frear(){
		if(velocidadeAtual >=5){
			velocidadeAtual -= 3*5;
		}
		else{
			velocidadeAtual = 0;
		}
	}
	public String toString() {
		return "Velocidade Atual do CivicVTR é: " + velocidadeAtual + "Km/h";
	}
}*/
