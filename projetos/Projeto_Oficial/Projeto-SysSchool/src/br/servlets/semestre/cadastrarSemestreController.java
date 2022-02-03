package br.servlets.semestre;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Semestre;

@WebServlet("/cadastrarSemestreController")
public class cadastrarSemestreController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public cadastrarSemestreController() {
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

		String ano = request.getParameter("ano");
		
		Semestre semestre = new Semestre(ano);
				
		try {
			semestre.salvar();
			new Thread();
			Thread.sleep(1300);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		response.sendRedirect("semestre/CadastrarSemestre.jsp");
	}
}
