package Model;

public class MatriculaDisciplina {

	private int idmatDisciplina;
	private Matricula matricula;
	private Professor professor;
	private Disciplina disciplina;
	private Nota nota;
	
	public MatriculaDisciplina() {
	}
	
	public MatriculaDisciplina(int idmatDisciplina, Matricula matricula, Professor professor, Disciplina disciplina,
			Nota nota) {
		this.idmatDisciplina = idmatDisciplina;
		this.matricula = matricula;
		this.professor = professor;
		this.disciplina = disciplina;
		this.nota = nota;
	}

	public int getIdmatDisciplina() {
		return idmatDisciplina;
	}
	public void setIdmatDisciplina(int idmatDisciplina) {
		this.idmatDisciplina = idmatDisciplina;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Nota getNota() {
		return nota;
	}
	public void setNota(Nota nota) {
		this.nota = nota;
	}
}
