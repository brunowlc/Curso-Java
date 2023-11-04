package cursojava.classes;

import java.util.Objects;


/* Essa classe Disciplina servira para todos os objetos e instancias de notas e materias */
public class Disciplina {
		
	/* Melhorando o codigo usando listas */
	
	private String disciplina;
	private double nota;
	
	
	
	/* GET/SET - Disciplina */
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	/* GET/SET - Nota */
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
/* ==================================================================================== */
	
	/* Equals e Hashcode*/
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
/* ==================================================================================== */
		
	/* toString */
	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota=" + nota + "]";
	}
	
	
	
}
