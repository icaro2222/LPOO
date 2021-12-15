package controller;

import java.util.ArrayList;

import Model.Aluno;
import Model.Curso;
import Model.Matricula;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		ArrayList<?> alunos = new Aluno().consultarPorId(-1);
		for(int s=0; s<(alunos.size()); s++){
		Aluno aluno = (Aluno) alunos.get(s);
		System.out.println(aluno.getNome());
		} 
	}

}
