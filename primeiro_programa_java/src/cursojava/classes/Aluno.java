package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	/*Atributos*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	/*private Disciplina disciplina = new Disciplina();*/
	
	/* Utilizando listas no objeto disciplina */
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	public Aluno() { /* CRIA OS DADOS NA MEMORIA - SENDO PADRAO DO JAVA */
		
	}
	
	public Aluno(String nomePadrao){
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao){
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	
	/*===========================================================================*/
	
	
	/* Metodos GETTERS e SETTERS */ 
	/* GET é para resgatar ou obter o valor do atributo */
	/* SET é para adicionar ou receber dados para os atributos */
	
	
	/* GET/SET - Nome */
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome; /* THIS(esse, Este) é utilizado para referenciar o atributo nome da classe Aluno*/
	}
	
	
	
	/* GET/SET - Idade */
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	/* GET/SET - dataNascimento */
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	/* GET/SET - registroGeral */
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	
	
	/* GET/SET - numeroCpf */
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	
	
	/* GET/SET - nomeMae */
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	
	
	/* GET/SET - nomePai */
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	
	
	/* GET/SET - dataMatricula */
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
	
	/* GET/SET - nomeEscola */
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	
	
	/* GET/SET - serieMatriculado */
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	
	
	/* GET/SET - Disciplinas */
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	/*==================================================================*/
	
	
	/* Metodo get para calcular e retornar a media*/
	public double getMediaAluno() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}
	
	
	/*==================================================================*/
	

	/* Metodo para identificar se o aluno esta aprovado*/
	public String getAlunoAprovado() {
		double media = this.getMediaAluno();
		if(media >= 50) {
			if(media >= 70) {
			return "Aluno Aprovado!";
			}else {
				return "Aluno em recuperação!";
			}
		}else {
			return "Aluno Reprovado!";
		}
	}
	
	/* Outra forma de fazer usando boolean */
	public boolean getAlunoAprovado1() {
		double media = this.getMediaAluno();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}

	
	
	/*==================================================================*/
	
	/* toString */
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	
	
	/*==================================================================*/
	
	/* Equals e Hashcode */

	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, disciplinas, idade, nome, nomeEscola, nomeMae, nomePai,
				numeroCpf, registroGeral, serieMatriculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(disciplinas, other.disciplinas) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(numeroCpf, other.numeroCpf) && Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}
	
	
	
}
