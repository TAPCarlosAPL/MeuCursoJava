package operadoresternarios;

public class OperadoresTernarios {
	public static void main(String[] args) {
		
		double media = 7.6;
		
		//CALCULANDO CONDIÇÃO DA MÉDIA USANDO OPERADORES TERNÁRIOS >= ? :
		String resultParcial = media >= 5.0 ? 
				"em recuperação" : "reprovado";
		String resultFinal = media >= 7.0 ?
				"Aprovado" : resultParcial; 
		
		System.out.println("O aluno está " + resultFinal);
		
		//OUTRA FORMA DE USAR OS OPERADORES TERNÁRIOS
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}


//POSSO IMPLEMENTAR ALGUMAS CONDIÇÕES E TORNAR O ALGORITMO EM UM
//CONTROLE DE PROMOÇÕES E COMPORTAMENTO/NOTA E MENÇÃO DE ALUNOS PARA 
//PROFESSORES DE DIVERSAS MODALIDADES.