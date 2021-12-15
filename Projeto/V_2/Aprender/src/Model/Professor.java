package Model;

import java.util.ArrayList;

import Dao.ProfessorDao;

public class Professor {

	private int cdprofessor;
	private String nome;
	
	public Professor() {
	}
	public Professor(String nome) {
		this.nome = nome;
	}
	public int getCdprofessor() {
		return cdprofessor;
	}
	public void setCdprofessor(int cdprofessor) {
		this.cdprofessor = cdprofessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void salvar() throws ClassNotFoundException {
		new ProfessorDao().cadastrarProfessor(this);
	}
	public ArrayList<Professor> consultar(String nome) {
		return new ProfessorDao().BuscarProfessorsPorDescricao(nome);
	}
	public Professor apagar(int idprofessor) {
		return new ProfessorDao().BuscarProfessorsPorId(idprofessor);
	}
	public void consultarPorId(int idprofessor) {
		new ProfessorDao().ExcluirProfessor(idprofessor);
	}
	

	
}
