package br.servlets.nota;

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
import Model.Nota;

@WebServlet("/notaController")
public class notaController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public notaController() {
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

		int cdaluno = Integer.parseInt(request.getParameter("cdaluno"));
		int cddisciplina = Integer.parseInt(request.getParameter("cddisciplina"));
		double nota = Double.parseDouble(request.getParameter("nota"));
		String referencia = request.getParameter("referencia");
		
		Aluno aluno = new Aluno(cdaluno);
		Disciplina disciplina = new Disciplina(cddisciplina);
		
		Matricula matricula = new Matricula(aluno);
		MatriculaDisciplina matriculaDisciplina = new MatriculaDisciplina(disciplina, matricula);
		matriculaDisciplina.buscarcd();
		
		Nota nota1 = new Nota(matriculaDisciplina, nota, referencia);
		
		try {
			nota1.salvar();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		response.sendRedirect("nota/CadastrarNota.jsp");
	}
}
