package br.servlets.matDisciplina;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aluno;
import Model.Disciplina;
import Model.Matricula;
import Model.MatriculaDisciplina;

@WebServlet("/matriculaAlunoDisciplinaController")
public class matriculaAlunoDisciplinaController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public matriculaAlunoDisciplinaController() {
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

		int cddisciplina =  Integer.parseInt(request.getParameter("cddiscipina"));	
		int cdaluno =  Integer.parseInt(request.getParameter("cdaluno"));	

		Disciplina disciplina = new Disciplina(cddisciplina);
		Aluno aluno = new Aluno(cdaluno);
		Matricula matricula = new Matricula(aluno);
		
		MatriculaDisciplina matriculaDisciplina = new MatriculaDisciplina(disciplina, matricula);
		if(cdaluno!=0) {
			try {
				matriculaDisciplina.salvar();
			} catch (ClassNotFoundException | InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		response.sendRedirect("matriculaDisciplina/CadastrarMatriculaDisciplina.jsp");
	}
}
