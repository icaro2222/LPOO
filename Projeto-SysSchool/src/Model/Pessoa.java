package Model;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;
	private String estado;
	private String cidade;
	private String estadoCivil;
	private boolean ativa;
	private int nivel;
	private String senha;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String email, String cpf, String dataNascimento, String estado, String cidade, String estadoCivil,
			boolean ativa) {
		this.nome = nome;
		this.setEmail(email);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.estado = estado;
		this.cidade = cidade;
		this.estadoCivil = estadoCivil;
		this.ativa = ativa;
	}

	public Pessoa(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String string() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void salvar() throws ClassNotFoundException{
	}
	
	public ArrayList<?> consultar(String cpf) {
		return null;
	}
	
	public void apagar(int id) {
	}
	
	public ArrayList<?> consultarPorId(int id) {
		return null;
	}

	public void alterarDados() {	
	}
}
