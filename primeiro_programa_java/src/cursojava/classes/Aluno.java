package cursojava.classes;

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
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	
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
		this.nome = nome; /* THIS é utilizado para referenciar ao atributo nome da classe Aluno*/
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

	
	
	/* GET/SET - nota1 */
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	
	
	/* GET/SET - nota2 */
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	
	
	/* GET/SET - nota3 */
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	
	
	/* GET/SET - nota4 */
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	
	
	/*==================================================================*/
	
	
	/* Metodo get para calcular e retornar a media*/
	public double getMediaAluno() {
		return (nota1 + nota2 + nota3 + nota4)/4;
	}
	
	
	/*==================================================================*/
	
	
	/* Metodo para identificar se o aluno esta aprovado*/
	public String getAlunoAprovado() {
		double media = this.getMediaAluno();
		if(media >= 70) {
			return "Aluno Aprovado";
		}else {
			return "Aluno Reprovado";
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
	
	
}
