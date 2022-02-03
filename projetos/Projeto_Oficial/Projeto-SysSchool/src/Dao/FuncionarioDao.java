package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Aluno;
import Model.Funcionario;
import Model.Professor;
public class FuncionarioDao {

	public void cadastrarfuncionario(Funcionario funcionario) throws ClassNotFoundException {

		String sql = "INSERT INTO funcionario(nome, email, senha, dataNascimento, estado, cidade, estadocivil, cpf, ativa)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, 1)";
		
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, funcionario.getNome());
			pStatement.setString(2, funcionario.getEmail());
			pStatement.setString(3, funcionario.getSenha());
			pStatement.setString(4, funcionario.getDataNascimento());
			pStatement.setString(5, funcionario.getEstado());
			pStatement.setString(6, funcionario.getCidade());
			pStatement.setString(7, funcionario.getEstadoCivil());
			pStatement.setString(8, funcionario.getCpf());
			pStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null)
					pStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public int ValidarFuncionarioDao(String email, String senha) {

		String sql = "SELECT * FROM funcionario WHERE email = '" + email + "' and senha = '" + senha + "'";
		String sqlaluno = "SELECT * FROM aluno WHERE email = '" + email + "' and senha = '" + senha + "'";
		String sqlprofessor = "SELECT * FROM professor WHERE email = '" + email + "' and senha = '" + senha + "'";

		ResultSet rs = null;
		ResultSet rsaluno = null;
		ResultSet rsprofessor = null;
		
		Connection conn = null;

		PreparedStatement pStatement = null;
		PreparedStatement pSaluno = null;
		PreparedStatement pSprofessor = null;

		Funcionario funcionario = null;
		ArrayList<Funcionario> funcionarios = null;
		Aluno aluno = null;
		ArrayList<Aluno> alunos = null;
		Professor professor= null;
		ArrayList<Professor> professores = null;
		
		int cdfuncionario = 0;
		try {
			conn = new MySqlConnection().getConnection();

			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			pSaluno = conn.prepareStatement(sqlaluno);
			rsaluno = pSaluno.executeQuery();
			pSprofessor = conn.prepareStatement(sqlprofessor);
			rsprofessor = pSprofessor.executeQuery();

			if (rs != null) {
				funcionarios = new ArrayList<Funcionario>();
				while (rs.next()) {
					funcionario = new Funcionario();
					funcionario.setCdFuncionario(rs.getInt("cdfuncionario"));
					funcionario.setNome(rs.getString("email"));
					funcionario.setSenha(rs.getString("senha"));
					funcionario.setNivel(rs.getInt("nivel"));
					funcionarios.add(funcionario);
				}
			}
			if (rsaluno != null) {
				alunos = new ArrayList<Aluno>();
				while (rsaluno.next()) {
					aluno = new Aluno();
					aluno.setCdaluno(rsaluno.getInt("cdaluno"));
					aluno.setNome(rsaluno.getString("email"));
					aluno.setSenha(rsaluno.getString("senha"));
					aluno.setNivel(rsaluno.getInt("nivel"));
					alunos.add(aluno);
				}
			}
			if (rsprofessor != null) {
				professores = new ArrayList<Professor>();
				while (rsprofessor.next()) {
					professor = new Professor();
					professor.setCdprofessor(rsprofessor.getInt("cdprofessor"));
					professor.setNome(rsprofessor.getString("email"));
					professor.setSenha(rsprofessor.getString("senha"));
					professor.setNivel(rsprofessor.getInt("nivel"));
					professores.add(professor);
				}
			}
			
			if(funcionario != null) {
				cdfuncionario = funcionario.getNivel();
			}else if(professor != null) {
				cdfuncionario = professor.getNivel();
			}else if(aluno != null) {
				cdfuncionario = aluno.getNivel();
			}else {
				cdfuncionario = 0;
			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null)
					pStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cdfuncionario;
	}

	public ArrayList<Funcionario> BuscarfuncionariosPorId(int idfuncionario) {

		String sql;
		if(idfuncionario ==  -1) {
			sql = "SELECT * FROM funcionario";
		}else {
			sql = "SELECT * FROM funcionario WHERE cdfuncionario LIKE '%" + idfuncionario + "%'";
		}
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Funcionario funcionario = null;
		ArrayList<Funcionario> funcionarios = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				funcionarios = new ArrayList<Funcionario>();
				while (rs.next()) {
					funcionario = new Funcionario();
					funcionario.setCdFuncionario(rs.getInt("cdfuncionario"));
					funcionario.setNome(rs.getString("nome"));
					funcionario.setNome(rs.getString("senha"));
					funcionarios.add(funcionario);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null)
					pStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return funcionarios;
	}

	public void Excluirfuncionario(int idfuncionario) {
		String sql = "DELETE FROM funcionario WHERE cdfuncionario = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, idfuncionario);
			pStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null)
					pStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void Alterarfuncionario(Funcionario funcionario) {
		String sql = "UPDATE funcionario SET nome = ?, nmatricula = ?, status = ? WHERE idfuncionario = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, funcionario.getNome());
			pStatement.setString(2, funcionario.getSenha());
			pStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null)
					pStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
