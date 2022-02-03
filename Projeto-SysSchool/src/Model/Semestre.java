package Model;

import java.util.ArrayList;

import Dao.SemestreDao;

public class Semestre {

	private int cdsemestre;
	private String  ano;

	
	public Semestre() {
	}

	public Semestre(int cdsemestre, String ano) {
		this.cdsemestre = cdsemestre;
		this.ano = ano;
	}

	public Semestre(int cdsemestre) {
		this.cdsemestre = cdsemestre;
	}

	public Semestre(String ano) {
		this.ano = ano;
	}
	public int getCdsemestre() {
		return cdsemestre;
	}
	public void setCdsemestre(int cdsemestre) {
		this.cdsemestre = cdsemestre;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void salvar() throws ClassNotFoundException {
		new SemestreDao().cadastrarSemestre(this);
	}
	public ArrayList<Semestre> consultar(String nome) {
		return new SemestreDao().BuscarSemestresPorDescricao(nome);
	}
//	public Semestre apagar(int idSemestre) {
//		new SemestreDao().ExcluirSemestre(idSemestre);
//		
//	}
	public ArrayList<Semestre> consultarPorId(int cdsemestre) {
		return new SemestreDao().BuscarSemestresPorId(cdsemestre);
	}
	
}
