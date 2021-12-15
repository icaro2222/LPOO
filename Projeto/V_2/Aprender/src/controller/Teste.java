package controller;

import Model.Curso;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Curso curso = new Curso("Engeharia", 1000.1);
		Curso curso1 = curso.consultarPorId(1);
		
		
		System.out.println(curso1.getNomecurso());
		
		
		
	}

}
