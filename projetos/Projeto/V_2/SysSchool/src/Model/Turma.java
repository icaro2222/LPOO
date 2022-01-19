package Model;

import java.util.ArrayList;

import Dao.TurmaDao;

public class Turma {

	private int cdturma;
	private String nometurma;
	
	public Turma() {
	}
	
	public Turma(String nometurma) {
		this.nometurma = nometurma;
	}
	public int getCdturma() {
		return cdturma;
	}
	public void setCdturma(int cdturma) {
		this.cdturma = cdturma;
	}
	public String getNometurma() {
		return nometurma;
	}
	public void setNometurma(String nometurma) {
		this.nometurma = nometurma;
	}
	

	public void salvar() throws ClassNotFoundException {
		new TurmaDao().cadastrarTurma(this);
	}
	public ArrayList<Turma> consultar(String nome) {
		return new TurmaDao().BuscarTurmasPorDescricao(nome);
	}
	public void apagar(int idturma) {
		new TurmaDao().ExcluirTurma(idturma);
	}
	public ArrayList<Turma> consultarPorId(int idturma) {
		return new TurmaDao().BuscarTurmasPorId(idturma);
	}	
}
