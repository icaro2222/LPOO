package br.servlets.buscarNota;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aluno;


@WebServlet("/buscarNotaController")
public class buscarNotaController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public buscarNotaController() {
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
		String nome = request.getParameter("nome");	
		ArrayList<Aluno> alunos = new Aluno().consultar(nome);
		
		if(alunos != null) {
			request.setAttribute("alunos", alunos);
		}else {
			request.setAttribute("alunos", null);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("nota/ViewNota.jsp");
		dispatcher.forward(request, response);
	}
}