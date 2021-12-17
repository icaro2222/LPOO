package br.servlets.disciplina;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Disciplina;


@WebServlet("/consultarDisciplinaController")
public class consultarDisciplinaController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public consultarDisciplinaController() {
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
		String nome = request.getParameter("nomedisciplina");	
		ArrayList<Disciplina> disciplinas = new Disciplina().consultar(nome);
		
		request.setAttribute("disciplinas", disciplinas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("disciplina/ViewDisciplina.jsp");
		dispatcher.forward(request, response);
	}
}
