package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		/* Criando lista de alunos */
		
       List<Aluno> alunos = new ArrayList<Aluno>();
       
		for(int qtd = 1; qtd <=1; qtd++) {
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
		
		for (int posicao = 0; posicao < alunos.size(); posicao++) {
			
			Aluno aluno = alunos.get(posicao);
			
			if(aluno.getNome().equalsIgnoreCase("Alex")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Bruno Wellington");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Angular");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(posicao, trocar);
				aluno = alunos.get(posicao);
			}
			
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média do aluno " + aluno.getMediaAluno());
			System.out.println("resultado " + aluno.getAlunoAprovado());
			
			for(int posicaod = 0; posicaod < aluno.getDisciplinas().size(); posicaod++) {
				Disciplina disc = aluno.getDisciplinas().get(posicaod);
				System.out.println("materia: " + disc.getDisciplina());
				System.out.println("Nota: " + disc.getNota());
			}
		}
	
		
	}
}
