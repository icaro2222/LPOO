package br.servlets.funcionario;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Funcionario;

@WebServlet("/cadastrarFuncionarioController")
public class  cadastrarFuncionarioController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public cadastrarFuncionarioController() {
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
		
//		Dados de Funcionario

		String email = request.getParameter("email");
		String nome = request.getParameter("nomefuncionario");
		String senha = request.getParameter("senha");
		String dataNascimento = request.getParameter("datanascimento");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String estadoCivil = request.getParameter("estadocivil");
		String cpf = request.getParameter("cpf");
		
		Funcionario funcionario = new Funcionario(nome, email, cpf, dataNascimento, estado, cidade, senha, estadoCivil);
		
		try {
			funcionario.CriptografarSenha(senha);
			funcionario.salvar();
			new Thread();
			Thread.sleep(1300);
		} catch (ClassNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}
		response.sendRedirect("funcionario/CadastrarFuncionario.jsp");
	}
}
