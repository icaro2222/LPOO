package Model;

import java.util.ArrayList;

import Dao.MatriculaDao;

public class Matricula {

	private int cdmatricula;
	private int cdcurso;
	private int cdaluno;
	private int cdsemestre;
	private Double valor;
	private int cdturma;

	public Matricula() {
	}
	public Matricula(int cdcurso, int cdaluno, int cdsemestre, Double valor, int cdturma) {
		this.cdcurso = cdcurso;
		this.cdaluno = cdaluno;
		this.cdsemestre = cdsemestre;
		this.valor = valor;
		this.cdturma = cdturma;
	}
	public int getCdmatricula() {
		return cdmatricula;
	}
	public void setCdmatricula(int cdmatricula) {
		this.cdmatricula = cdmatricula;
	}
	public int getCdcurso() {
		return cdcurso;
	}
	public void setCdcurso(int cdcurso) {
		this.cdcurso = cdcurso;
	}
	public int getCdaluno() {
		return cdaluno;
	}
	public void setCdaluno(int cdaluno) {
		this.cdaluno = cdaluno;
	}
	public int getCdsemestre() {
		return cdsemestre;
	}
	public void setCdsemestre(int cdsemestre) {
		this.cdsemestre = cdsemestre;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getCdturma() {
		return cdturma;
	}
	public void setCdturma(int cdturma) {
		this.cdturma = cdturma;
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
