package Model;

import java.util.ArrayList;

import Dao.alunoDao;

public class Aluno extends Pessoa{

	private int cdaluno;
	private String nmatricula;
	private String status;
	private int periodo;

	public Aluno() {super();}
	
	public Aluno(int cdaluno) {
		this.cdaluno = cdaluno;
	}

	public Aluno(String nome, String email, String cpf, int cdaluno, String nmatricula, String status, String dataNascimento, String estado, String cidade,
			String estadoCivil, int periodo) {
		super(nome, email, cpf, dataNascimento, estado, cidade, estadoCivil, true);
		this.cdaluno = cdaluno;
		this.nmatricula = nmatricula;
		this.status = status;
		this.periodo = periodo;
	}

	public Aluno(String nome, String email,  String cpf, String dataNascimento, String estado, String cidade, String  estadoCivil) {
		super(nome, email, cpf, dataNascimento, estado, cidade, estadoCivil, true);
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getCdaluno() {
		return cdaluno;
	}
	public void setCdaluno(int cdaluno) {
		this.cdaluno = cdaluno;
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
	
	public ArrayList<Aluno> consultar(String cpf) {
		return new alunoDao().BuscaralunosPorCpf(cpf);
	}
	
	public void apagar(int idaluno) {
		new alunoDao().Excluiraluno(idaluno);
	}
	
	public ArrayList<Aluno> consultarPorId(int idaluno) {
		return new alunoDao().BuscarAlunosPorId(idaluno);
	}

	public void alterarDados() {
		new alunoDao().Alteraraluno(this);		
	}
}
