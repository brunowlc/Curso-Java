package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		/* Criando lista de alunos */
       List<Aluno> alunos = new ArrayList<Aluno>();
       
       List<Aluno> alunosAprovados = new ArrayList<Aluno>();
       List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
       List<Aluno> alunosReprovados = new ArrayList<Aluno>();
       
		for(int qtd = 1; qtd <=5; qtd++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno "+qtd);
			/*String idade = JOptionPane.showInputDialog("Digite a idade");
			String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
			String rg = JOptionPane.showInputDialog("Digite o RG do aluno");
			String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno");
			String nomeMae = JOptionPane.showInputDialog("Digite o nome da mae");
			String nomePai = JOptionPane.showInputDialog("Digite o nome da pai");
			String dataMatricula = JOptionPane.showInputDialog("Informe a data da matricula do aluno");
			String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola");
			String serieMatriculado = JOptionPane.showInputDialog("Digite qual serie ele esta matriculado");
			*/
			Aluno aluno1 = new Aluno();
			
			aluno1.setNome(nome);
			/*aluno1.setIdade(Integer.valueOf(idade)); /*Integer.valueOf() => converte String em inteiro*/
			/*aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai (nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setNomeEscola(nomeEscola);
			aluno1.setSerieMatriculado(serieMatriculado);*/
			
			/* Solicitando as disciplinas e notas na tela */
			
			for (int posicao = 1; posicao <= 1; posicao++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + posicao);
				String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina " + posicao);
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			/* Removendo uma ou mais disciplina */
			int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina?");
			
			if(escolha == 0){				
				int continuarRemovendo = 0;
				int posicao = 1;
				
				while(continuarRemovendo == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;
				continuarRemovendo = JOptionPane.showConfirmDialog(null,"Deseja remover outra disciplina?");
				}
			}
			
		  alunos.add(aluno1);
		}
		/* Separando os alunos em lista dependendo do seu resultado */
		for (Aluno aluno : alunos) {
			if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
				alunosRecuperacao.add(aluno);
			}else {
				alunosReprovados.add(aluno);
			}				
		}
		
		System.out.println("------------ Lista dos alunos Aprovados ------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Aluno(a) "+ aluno.getNome() +" está "+ aluno.getAlunoAprovado() + " Com media: " + aluno.getMediaAluno());
		}
		
		System.out.println("\n------------ Lista dos alunos em Recuperação ------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Aluno(a) "+ aluno.getNome() +" está em "+ aluno.getAlunoAprovado() + " Com media: " + aluno.getMediaAluno());
		}
		
		System.out.println("\n ------------ Lista dos alunos Reprovados ------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Aluno(a) "+ aluno.getNome() +" está "+ aluno.getAlunoAprovado() + " Com media: " + aluno.getMediaAluno());	
		}
		
	}
}
