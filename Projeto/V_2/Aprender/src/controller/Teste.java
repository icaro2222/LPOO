package controller;

import Model.Aluno;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Aluno aluno = new Aluno(1112, "Ícaro", "000323-2020", "AP");
		
		aluno.consultar("ica");
		
	}

}
