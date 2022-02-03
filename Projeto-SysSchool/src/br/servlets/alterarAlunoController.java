package br.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aluno;


@WebServlet("/alterarAlunoController")
public class alterarAlunoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public alterarAlunoController() {
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


		int idaluno = Integer.parseInt(request.getParameter("idaluno"));
		String nome = request.getParameter("nome");
		String dataNascimento = request.getParameter("datanascimento");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String estadoCivil = request.getParameter("estadocivil");
		String cpf = request.getParameter("cpf");
		

		Aluno aluno = new Aluno(nome, nome, cpf, dataNascimento, estado, cidade, estadoCivil);
		aluno.setCdaluno(idaluno);
		aluno.alterarDados();
		
		new Thread();
		try {
			Thread.sleep(1300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("aluno/ConsultarAluno.jsp");
	}
}
