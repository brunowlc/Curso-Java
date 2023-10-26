package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		Aluno aluno0; /*objeto ainda nao existe na memoria*/
		
		/*new Aluno() é uma instancia (criação de objeto)*/
		/*O aluno1,2,3... é uma referencia para o objeto aluno*/
		
		Aluno aluno1 = new Aluno(); /*Objeto criado*/
		
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("44554.4544.545");
		aluno1.setNumeroCpf("536.265.774-89");
		aluno1.setNomeMae("Shirlei da Silva");
		aluno1.setNomePai ("Jose da Silva");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setNomeEscola("Santos Dumont");
		aluno1.setSerieMatriculado("5");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade() + " Anos");
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println("RG do aluno:" + aluno1.getRegistroGeral());
		System.out.println("Media do Aluno: " + aluno1.getMediaAluno() + "\n");
		
		/*============================================================================*/
		
		
		Aluno aluno2 = new Aluno(); /*Objeto criado*/
		aluno2.setNome("Antonio");
		aluno2.setIdade(25);
		aluno2.setDataNascimento("12/05/2003");
		aluno2.setNota1(70);
		aluno2.setNota2(68.8);
		aluno2.setNota3(56.9);
		aluno2.setNota4(88.7);
		
		System.out.println("Nome do aluno: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade() + " Anos");
		System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());
		System.out.println("Media do Aluno: " + aluno2.getMediaAluno() + "\n");
		
		/*============================================================================*/
		
		
		Aluno aluno3 = new Aluno(); /*Objeto criado*/
		
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		
	}
}
