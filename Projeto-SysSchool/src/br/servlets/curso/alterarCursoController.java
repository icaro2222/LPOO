package br.servlets.curso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aluno;
import Model.Curso;


@WebServlet("/alterarCursoController")
public class alterarCursoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public alterarCursoController() {
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


		int cdcurso = Integer.parseInt(request.getParameter("idcurso"));
		String nomecurso = request.getParameter("nome");
		Double valor = Double.parseDouble(request.getParameter("valor"));

		Curso curso = new Curso(cdcurso, nomecurso, valor);
		curso.alterar();
		
		new Thread();
		try {
			Thread.sleep(1300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("curso/ConsultarCurso.jsp");
	}
}
