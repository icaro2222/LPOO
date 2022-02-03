package br.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aluno;


@WebServlet("/apagarAlunoController")
public class apagarAlunoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public apagarAlunoController() {
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
		String num = request.getParameter("idaluno");
		String apagar = request.getParameter("sim");
		
		int idaluno = Integer.parseInt(num);

		if(apagar != null){
			new Aluno().apagar(idaluno);
		}
		try {
			new Thread();
			Thread.sleep(1300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("aluno/ConsultarAluno.jsp");
	}
}
