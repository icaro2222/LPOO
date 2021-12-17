package br.servlets.cadastro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aluno;
import Model.Curso;
import Model.Matricula;
import Model.MatriculaDisciplina;

@WebServlet("/cadastrarMatriculaAlunoController")
public class cadastrarMatriculaAlunoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public cadastrarMatriculaAlunoController() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequfeweeef\est request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
//		Dados de Aluno
		
		String nome = request.getParameter("nome");
		String nmatricula = request.getParameter("numMatricula");
		String status = request.getParameter("status");
		
//		Dados da Matricula

		Curso curso = new Curso(Integer.parseInt(request.getParameter("cdcurso")));
		Aluno aluno = new Alun
		
		int cdsemestre = Integer.parseInt(request.getParameter("cdsemestre"));
		Double valor = Double.parseDouble(request.getParameter("valor"));
		int cdturma  = Integer.parseInt(request.getParameter("cdturma"));

		Matricula matricula = new Matricula(curso, 0, cdsemestre, valor, cdturma);
		

		Matricula matricula = new Matricula(0, curso, aluno, semestre, valor, turma)
		
		Aluno aluno = new Aluno(nome, nmatricula, "MT");
		
		try {
			aluno.salvar();
			new Thread();
			Thread.sleep(1000);
			matricula.salvar();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
