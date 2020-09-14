package encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 =  new Pessoa("Carlos","Lamounier",-24);
		p1.setIdade(340); //alterar valor da variavel
		System.out.println(p1.getIdade()); //ler valor da variavel
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto());
	}
}
