package br.servlets.cadastro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aluno;
import Model.Curso;
import Model.Matricula;
import Model.Turma;

@WebServlet("/cadastrarMatriculaAlunoController")
public class  cadastrarMatriculaAlunoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public cadastrarMatriculaAlunoController() {
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

		String nome = request.getParameter("nome");
		String dataNascimento = request.getParameter("datanascimento");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String estadoCivil = request.getParameter("estadocivil");
		String cpf = request.getParameter("cpf");
		
//		Dados da Matricula

		int cdcurso = Integer.parseInt(request.getParameter("cdcurso"));
		int cdturma  = Integer.parseInt(request.getParameter("cdturma"));
		
		Curso curso = new Curso(cdcurso);
		Turma turma = new Turma(cdturma);
		Aluno aluno = new Aluno(nome, nome, cpf, dataNascimento, estado, cidade, estadoCivil);
		
		Matricula matricula = new Matricula(curso, aluno, turma);
				
		try {
			matricula.salvar();
		} catch (ClassNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}
		response.sendRedirect("matricula/CadastrarMatriculaAluno.jsp");
	}
}
