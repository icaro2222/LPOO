package Model;

import java.util.ArrayList;

import Dao.ProfessorDao;

public class Professor extends Pessoa{

	private int cdprofessor;
	
	public Professor() {
	}
	
	public Professor(String nome, String email,  String cpf, String dataNascimento, String estado, String cidade, String estadoCivil,
			boolean ativa) {
		super(nome, email, cpf, dataNascimento, estado, cidade, estadoCivil, ativa);
	}

	public Professor(String nome2) {
		super(nome2);
	}

	public int getCdprofessor() {
		return cdprofessor;
	}
	
	public void setCdprofessor(int cdprofessor) {
		this.cdprofessor = cdprofessor;
	}
	
	public void salvar() throws ClassNotFoundException {
		new ProfessorDao().cadastrarProfessor(this);
	}
	
	public ArrayList<Professor> consultar(String cpf) {
		return new ProfessorDao().BuscarProfessorsPorCpf(cpf);
	}
	
	public ArrayList<Professor> consultarPorId(int idprofessor) {
		return new ProfessorDao().BuscarProfessorsPorId(idprofessor);
	}
	
	public void apagar(int idprofessor) {
		new ProfessorDao().ExcluirProfessor(idprofessor);
	}
	
}
