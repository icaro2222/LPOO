package br.servlets.professor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Professor;


@WebServlet("/cadastrarProfessorController")
public class  cadastrarProfessorController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public cadastrarProfessorController() {
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

		String nome = request.getParameter("nomeprofessor");
		String dataNascimento = request.getParameter("datanascimento");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String estadoCivil = request.getParameter("estadocivil");
		String cpf = request.getParameter("cpf");
		
		Professor professor = new Professor(nome, nome, cpf, dataNascimento, estado, cidade, estadoCivil, true);
		
		try {
			professor.salvar();
			new Thread();
			Thread.sleep(1300);
		} catch (ClassNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}
		response.sendRedirect("professor/CadastrarProfessor.jsp");
	}
}
