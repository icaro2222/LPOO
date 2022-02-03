package br.servlets.turma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Turma;

@WebServlet("/cadastrarTurmaController")
public class cadastrarTurmaController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public cadastrarTurmaController() {
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

		String nome = request.getParameter("nometurma");
		
		Turma turma = new Turma(nome);
				
		try {
			turma.salvar();
			new Thread();
			Thread.sleep(1300);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		response.sendRedirect("turma/CadastrarTurma.jsp");
	}
}
