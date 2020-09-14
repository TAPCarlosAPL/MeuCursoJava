package oo;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Carlos");
		Aluno aluno2 = new Aluno("Erika");
		Aluno aluno3 = new Aluno("Julia");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Angular Completo");
		Curso curso3 = new Curso("Mysql Completo");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso1);
		aluno1.adicionarCurso(curso3);
		
		aluno2.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso2);
		
		for(Aluno aluno: curso1.alunos){
			System.out.println("Estou matriculado no curso 1: "+ curso1.nome + "...");
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		//System.out.print(aluno1.cursos.get(0).alunos);
		System.out.println("Relação de Cursos x Alunos Matriculados");
		Curso cursoBusca1Encontrado = aluno1.obterCursoPorNome("Mysql completo");
		if(cursoBusca1Encontrado != null){
			System.out.println(cursoBusca1Encontrado.nome);
			System.out.println("["+ cursoBusca1Encontrado.alunos + "]");
		}
		Curso cursoBusca2Encontrado = aluno2.obterCursoPorNome("angular Completo");
		if(cursoBusca2Encontrado != null){
			System.out.println(cursoBusca2Encontrado.nome);
			System.out.println("["+ cursoBusca2Encontrado.alunos + "]");
		}
		Curso cursoBusca3Encontrado = aluno3.obterCursoPorNome("Java Completo");
		if(cursoBusca3Encontrado != null){
			System.out.println(cursoBusca3Encontrado.nome);
			System.out.println("["+ cursoBusca3Encontrado.alunos + "]");
		}
	}
}
