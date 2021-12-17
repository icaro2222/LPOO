package Model;

import java.util.ArrayList;

import Dao.CursoDao;

public class Curso {

	private int cdcurso;
	private String nomecurso;
	private double valor;
	
	public Curso() {
	}
	public Curso(String nomecurso, double valor) {
		this.nomecurso = nomecurso;
		this.valor = valor;
	}
	public Curso(int cdcurso, String nomecurso, double valor) {
		this.cdcurso = cdcurso;
		this.nomecurso = nomecurso;
		this.valor = valor;
	}
	public int getCdcurso() {
		return cdcurso;
	}
	public void setCdcurso(int cdcurso) {
		this.cdcurso = cdcurso;
	}
	public String getNomecurso() {
		return nomecurso;
	}
	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void salvar() throws ClassNotFoundException {
		new CursoDao().cadastrarCurso(this);
	}
	public ArrayList<Curso> consultar(String nome) {
		return new CursoDao().BuscarCursosPorDescricao(nome);
	}
	public void apagar(int idcurso) {
		new CursoDao().ExcluirCurso(idcurso);
	}
	public ArrayList<Curso> consultarPorId(int idcurso) {
		return new CursoDao().BuscarCursosPorId(idcurso);
	}	
}
