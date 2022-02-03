package Model;

import Dao.NotaDao;

public class Nota {

	private int cdnota;
	private MatriculaDisciplina matriculaDisciplina;
	private double nota;
	private String referencia;
	private String status;

	public Nota(){}

	public Nota(MatriculaDisciplina matriculaDisciplina, double nota, String referencia) {
		this.matriculaDisciplina = matriculaDisciplina;
		this.nota = nota;
		this.referencia = referencia;
	}
	public Nota(int cdnota, MatriculaDisciplina matriculaDisciplina, double nota, String referencia, String status) {
		this.cdnota = cdnota;
		this.matriculaDisciplina = matriculaDisciplina;
		this.nota = nota;
		this.referencia = referencia;
		this.status = status;
	}
	public int getCdnota() {
		return cdnota;
	}
	public void setCdnota(int cdnota) {
		this.cdnota = cdnota;
	}
	public MatriculaDisciplina getMatriculaDisciplina() {
		return matriculaDisciplina;
	}
	public void setMatriculaDisciplina(MatriculaDisciplina matriculaDisciplina) {
		this.matriculaDisciplina = matriculaDisciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void salvar() throws ClassNotFoundException {
		new NotaDao().cadastrarNota(this);
	}
}
