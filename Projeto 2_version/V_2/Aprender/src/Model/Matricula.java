package Model;

import java.util.ArrayList;

import Dao.MatriculaDao;

public class Matricula {

	private int cdmatricula;
	private Curso curso;
	private Aluno aluno;
	private Semestre semestre;
	private Double valor;
	private Turma turma;

	public Matricula() {
		super();
	}
	
	public Matricula(int cdmatricula, Curso curso, Aluno aluno, Semestre semestre, Double valor, Turma turma) {
		this.cdmatricula = cdmatricula;
		this.curso = curso;
		this.aluno = aluno;
		this.semestre = semestre;
		this.valor = valor;
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public void salvar() throws ClassNotFoundException {
		new MatriculaDao().cadastrarMatricula(this);
	}
	public ArrayList<Matricula> consultar(String nome) {
		return new MatriculaDao().BuscarMatriculasPorDescricao(nome);
	}
//	public matricula apagar(int idaluno) {
//		new alunoDao().Excluiraluno(idaluno);
//	}
	public ArrayList<Matricula> consultarPorId(int idaluno) {
		return new MatriculaDao().BuscarMatriculasPorId(idaluno);
	}
	
	
}
