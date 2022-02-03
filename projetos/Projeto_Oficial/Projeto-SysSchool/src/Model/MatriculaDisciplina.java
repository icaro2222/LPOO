package Model;

import Dao.MatDisciplinaDao;

public class MatriculaDisciplina {

	private int cdmatdisciplina;
	private Matricula matricula;
	private Professor professor;
	private Disciplina disciplina;
	private Double media;
	private String status;
	private Double valor;

	public MatriculaDisciplina(){}

	public MatriculaDisciplina(Disciplina disciplina, Matricula matricula) {
		this.matricula = matricula;
		this.disciplina = disciplina;
	}

	public MatriculaDisciplina(Matricula matricula) {
		this.matricula = matricula;
	}

	public MatriculaDisciplina(Matricula matricula, Professor professor, Disciplina disciplina, Nota nota, Double media,
			String status, Double valor) {
		this.matricula = matricula;
		this.professor = professor;
		this.disciplina = disciplina;
		this.media = media;
		this.status = status;
		this.valor = valor;
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

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void salvar() throws ClassNotFoundException, InterruptedException {

		new Thread();
		Thread.sleep(1300);
		new MatDisciplinaDao().cadastrarmatriculaDisciplina(this);
	}

	public int getCdmatdisciplina() {
		return cdmatdisciplina;
	}

	public void setCdmatdisciplina(int cdmatdisciplina) {
		this.cdmatdisciplina = cdmatdisciplina;
	}

	public void buscarcd() {
		int cd = new MatDisciplinaDao().BuscarmatriculaDisciplinasPorId(this);
		setCdmatdisciplina(cd);
	}	
}
