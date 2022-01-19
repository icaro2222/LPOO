package Model;

import java.util.ArrayList;

import Dao.alunoDao;

public class Aluno {

	private int cdaluno;
	private String nome;
	private String nmatricula;
	private String status;
	
	public Aluno() {
	}

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, String nmatricula, String status) {
		this.nome = nome;
		this.nmatricula = nmatricula;
		this.status = status;
	}
	
	public Aluno(int cdaluno, String nome, String nmatricula, String status) {
		this.cdaluno = cdaluno;
		this.nome = nome;
		this.nmatricula = nmatricula;
		this.status = status;
	}
	public int getCdaluno() {
		return cdaluno;
	}
	public void setCdaluno(int cdaluno) {
		this.cdaluno = cdaluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNmatricula() {
		return nmatricula;
	}
	public void setNmatricula(String nmatricula) {
		this.nmatricula = nmatricula;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void salvar() throws ClassNotFoundException {
		new alunoDao().cadastraraluno(this);
	}
	public ArrayList<Aluno> consultar(String nome) {
		return new alunoDao().BuscaralunosPorDescricao(nome);
	}
	public void apagar(int idaluno) {
		new alunoDao().Excluiraluno(idaluno);
	}
	public ArrayList<Aluno> consultarPorId(int idaluno) {
		return new alunoDao().BuscarAlunosPorId(idaluno);
	}
}
