package heran�aa;

public class Jogo {
	public static void main(String[] args) {
		
		Vilao vilao = new Vilao();
		vilao.x = 10;
		vilao.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Antes do ataque, o vil�o tem -> "+vilao.vida);
		System.out.println("Antes do ataque, o her�i tem -> "+heroi.vida);
		
		vilao.atacar(heroi);
		heroi.atacar(vilao);
		
		//heroi.andar(Direcao.SUL);
		heroi.atacar(vilao);
		vilao.atacar(heroi);
		
		System.out.println("Atacando...");
		
		System.out.println("Vil�o tem -> "+vilao.vida);
		System.out.println("Her�i tem -> "+heroi.vida);
	}
}
