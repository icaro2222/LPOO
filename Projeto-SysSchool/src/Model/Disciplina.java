package Model;

import java.util.ArrayList;

import Dao.DisciplinaDao;

public class Disciplina {

	private int cddisciplina;
	private int cdprofessor;
	private String nome;
	private Double valor;
	
	
	public Disciplina() {
	}
	public Disciplina(int cddisciplina) {
		this.cddisciplina = cddisciplina;
	}
	public Disciplina(int cdprofessor, String nome, Double valor) {
		this.cdprofessor = cdprofessor;
		this.nome = nome;
		this.valor = valor;
	}
	public int getCddisciplina() {
		return cddisciplina;
	}
	public void setCddisciplina(int cddisciplina) {
		this.cddisciplina = cddisciplina;
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor; 
	}
	public void salvar() throws ClassNotFoundException {
		new DisciplinaDao().cadastrarDisciplina(this);
	}
	public ArrayList<Disciplina> consultar(String nome) {
		return new DisciplinaDao().BuscarDisciplinasPorDescricao(nome);
	}
	public ArrayList<Disciplina> consultarPorId(int idDisciplina){
		return new DisciplinaDao().BuscarDisciplinasPorId(idDisciplina);
	}
	public void  apagar(int idDisciplina) {
		new DisciplinaDao().ExcluirDisciplina(idDisciplina);
	}
	

	
}
