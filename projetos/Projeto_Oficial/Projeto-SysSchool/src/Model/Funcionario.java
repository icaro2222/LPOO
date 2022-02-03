package Model;

import java.util.ArrayList;

import Dao.FuncionarioDao;

public class Funcionario extends Pessoa {

	private int cdFuncionario;
	
	public void CriptografarSenha(String senha){
		
//		MessageDigest md;
//        try {
//            md = MessageDigest.getInstance("MD5");
//        } catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        }
//        BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
//        System.out.println(hash.toString(16));
        
		senha = senha+"dkbcvdfjf"+senha+"dkbcvdfjf"+senha;
		
        this.setSenha(senha);
	}
	
	public Funcionario() { super();}
	
	public Funcionario(String email, String senha) {
		super(email);
		this.setSenha(senha);
	}

	public Funcionario(String nome, String email, String cpf, String dataNascimento, String estado, String cidade, String senha, String estadoCivil) {
		super(nome, email, cpf, dataNascimento, estado, cidade, estadoCivil, true);
		this.setSenha(senha);
	}

	public int validarFuncionario(){
		return new FuncionarioDao().ValidarFuncionarioDao(this.getEmail(), this.getSenha());
	}

	public int getCdFuncionario() {
		return cdFuncionario;
	}

	public void setCdFuncionario(int cdFuncionario) {
		this.cdFuncionario = cdFuncionario;
	}

	public void salvar() throws ClassNotFoundException{
		new FuncionarioDao().cadastrarfuncionario(this);
	}
	
	public ArrayList<Funcionario> consultar(String nome) {
		return null;
//		return new ProfessorDao().BuscarProfessorsPorDescricao(nome);
	}
	
	public ArrayList<Funcionario> consultarPorId(int idfuncionario) {
		return null;
//		return new ProfessorDao().BuscarProfessorsPorId(idprofessor);
	}
	
	public void apagar(int idfuncionario) {
//		new ProfessorDao().ExcluirProfessor(idprofessor);
	}

}
