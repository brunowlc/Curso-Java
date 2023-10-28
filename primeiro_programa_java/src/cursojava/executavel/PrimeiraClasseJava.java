package cursojava.executavel;

import javax.swing.JOptionPane;

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
		System.out.println("RG do aluno: " + aluno1.getRegistroGeral());
		System.out.println("CPF do aluno: " + aluno1.getNumeroCpf());
		System.out.println("Media do Aluno: " + aluno1.getMediaAluno());
		System.out.println("O aluno está " + aluno1.getAlunoAprovado());
		System.out.println("(Metodo Boolean) resultado = " + aluno1.getAlunoAprovado1());
		System.out.println("(Metodo Boolean + Operador ternario) resultado = " + (aluno1.getAlunoAprovado1() ? "Aprovado" : "Reprovado") + "\n");
		
		/*============================================================================*/
		
		/* Utilizando o swing do java para criar caixas de dialogo */
		
		Aluno aluno2 = new Aluno(); /*Objeto criado*/
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		String idade = JOptionPane.showInputDialog("Digite a idade");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
		String rg = JOptionPane.showInputDialog("Digite o RG do aluno");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da mae");
		String nomePai = JOptionPane.showInputDialog("Digite o nome da pai");
		String dataMatricula = JOptionPane.showInputDialog("Informe a data da matricula do aluno");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola");
		String serieMatriculado = JOptionPane.showInputDialog("Digite qual serie ele esta matriculado");
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota do aluno");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota do aluno");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota do aluno");
		String nota4 = JOptionPane.showInputDialog("Digite a quarta nota do aluno");
		
		aluno2.setNome(nome);
		aluno2.setIdade(Integer.valueOf(idade)); /*Integer.valueOf() => converte String em inteiro*/
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setRegistroGeral(rg);
		aluno2.setNumeroCpf(cpf);
		aluno2.setNomeMae(nomeMae);
		aluno2.setNomePai (nomePai);
		aluno2.setDataMatricula(dataMatricula);
		aluno2.setNomeEscola(nomeEscola);
		aluno2.setSerieMatriculado(serieMatriculado);
		aluno2.setNota1(Double.parseDouble(nota1));
		aluno2.setNota2(Double.parseDouble(nota2));
		aluno2.setNota3(Double.parseDouble(nota3));
		aluno2.setNota4(Double.parseDouble(nota4));
		
		
		System.out.println("Aluno: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade() + " Anos");
		System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());
		System.out.println("RG: " + aluno2.getRegistroGeral());
		System.out.println("CPF: " + aluno2.getNumeroCpf());
		System.out.println("Nome da mae: " + aluno2.getNomeMae());
		System.out.println("Nome do pai: " + aluno2.getNomePai());
		System.out.println("Data da matricula: " + aluno2.getDataMatricula());
		System.out.println("Nome da escola: " + aluno2.getNomeEscola());
		System.out.println("Série matriculado: " + aluno2.getSerieMatriculado());
		System.out.println("Media do Aluno: " + aluno2.getMediaAluno());
		System.out.println("O aluno está " + aluno2.getAlunoAprovado());
		System.out.println("(Metodo Boolean) resultado = " + aluno2.getAlunoAprovado1());
		System.out.println("(Metodo Boolean + Operador ternario) resultado = " + (aluno2.getAlunoAprovado1() ? "Aprovado" : "Reprovado") + "\n");
		
		
		/*============================================================================*/
		
		
		
	}
}
