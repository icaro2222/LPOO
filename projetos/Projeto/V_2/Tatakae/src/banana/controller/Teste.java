package banana.controller;

import banana.dao.alunoDao;
import banana.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(6, "Ícaro", "000323-2020", "AP");
		
		alunoDao doa = new alunoDao();
		
		doa.cadastraraluno(aluno);
		
		aluno.getNome();
	}

}
