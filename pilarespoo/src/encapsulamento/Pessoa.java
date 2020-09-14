package encapsulamento;


public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	
	//Construtor Expl�cito
	public Pessoa(String nome, String sobrenome, int idade){
		setNome(nome);
		setIdade(idade);
		setSobrenome(sobrenome);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto(){
		return getNome() + " " + getSobrenome();
	}
	
	
	//M�todo Getter (Ler)
	public int getIdade(){
		return idade;
	}
	//M�todo Setter (Alterar)
	public void setIdade(int novaIdade){
		novaIdade = Math.abs(novaIdade);
		if(novaIdade>=0 && novaIdade<=120){
			this.idade =  novaIdade;
		}else {
			System.out.println("Idade Inv�lida");
		}
	}
	public String toString(){
		return "Ol�, sou o " + getNome()
		+ " e tenho " + getIdade() + " anos!";
	}
}
