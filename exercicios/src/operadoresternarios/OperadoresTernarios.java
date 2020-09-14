package operadoresternarios;

public class OperadoresTernarios {
	public static void main(String[] args) {
		
		double media = 7.6;
		
		//CALCULANDO CONDI��O DA M�DIA USANDO OPERADORES TERN�RIOS >= ? :
		String resultParcial = media >= 5.0 ? 
				"em recupera��o" : "reprovado";
		String resultFinal = media >= 7.0 ?
				"Aprovado" : resultParcial; 
		
		System.out.println("O aluno est� " + resultFinal);
		
		//OUTRA FORMA DE USAR OS OPERADORES TERN�RIOS
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}


//POSSO IMPLEMENTAR ALGUMAS CONDI��ES E TORNAR O ALGORITMO EM UM
//CONTROLE DE PROMO��ES E COMPORTAMENTO/NOTA E MEN��O DE ALUNOS PARA 
//PROFESSORES DE DIVERSAS MODALIDADES.