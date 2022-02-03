package Model;

import Dao.MatriculaDao;

public class Matricula {

	private int cdmatricula;
	private Curso curso;
	private Aluno aluno;
	private Semestre semestre;
	private Turma turma;
	private Double valor;

	public Matricula() {
	}

	public Matricula(int cdmatricula, Curso curso, Aluno aluno, Semestre semestre, Turma turma, Double valor) {
		this.cdmatricula = cdmatricula;
		this.curso = curso;
		this.aluno = aluno;
		this.semestre = semestre;
		this.turma = turma;
		this.valor = valor;
	}

	public Matricula(Aluno aluno) {
		this.aluno = aluno;
	}

	public Matricula(Curso curso, Aluno aluno, Semestre semestre, Turma turma) {
		this.curso = curso;
		this.aluno = aluno;
		this.semestre = semestre;
		this.turma = turma;
	}

	public Matricula(Curso curso, Aluno aluno, Turma turma) {
		this.curso = curso;
		this.aluno = aluno;
		this.turma = turma;
	}

	public int getCdmatricula() {
		return cdmatricula;
	}

	public void setCdmatricula(int cdmatricula) {
		this.cdmatricula = cdmatricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void salvar() throws ClassNotFoundException, InterruptedException {
		aluno.salvar();
		new Thread();
		Thread.sleep(1300);
		new MatriculaDao().cadastrarMatricula(this);
	}	
}
