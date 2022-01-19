package br.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aluno;

@WebServlet("/cadastrarAlunoController")
public class cadastrarAlunoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public cadastrarAlunoController() {
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
		String nmatricula = request.getParameter("numMatricula");
		String status = request.getParameter("status");
		
		Aluno aluno = new Aluno(nome, nmatricula, status);
				
		try {
			aluno.salvar();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
