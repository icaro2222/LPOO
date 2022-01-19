package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Aluno;

public class alunoDao {

	public void cadastraraluno(Aluno aluno) throws ClassNotFoundException {

		String sql = "INSERT INTO aluno(nome, nmatricula, status) VALUES (?, ?, ?)";
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, aluno.getNome());
			pStatement.setString(2, aluno.getNmatricula());
			pStatement.setString(3, aluno.getStatus());
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

	public ArrayList<Aluno> BuscaralunosPorDescricao(String nome) {
		String sql = "SELECT * FROM aluno WHERE nome LIKE '%" + nome + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Aluno aluno = null;
		ArrayList<Aluno> alunos = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				alunos = new ArrayList<Aluno>();
				while (rs.next()) {
					aluno = new Aluno();
					aluno.setCdaluno(rs.getInt("cdaluno"));
					aluno.setNome(rs.getString("nome"));
					aluno.setNmatricula(rs.getString("nmatricula"));
					aluno.setStatus(rs.getString("status"));
					alunos.add(aluno);
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
		return alunos;
	}

	public ArrayList<Aluno> BuscarAlunosPorId(int idaluno) {

		String sql;
		if(idaluno ==  -1) {
			sql = "SELECT * FROM aluno";
		}else {
			sql = "SELECT * FROM aluno WHERE cdaluno LIKE '%" + idaluno + "%'";
		}
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Aluno aluno = null;
		ArrayList<Aluno> alunos = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				alunos = new ArrayList<Aluno>();
				while (rs.next()) {
					aluno = new Aluno();
					aluno.setCdaluno(rs.getInt("cdaluno"));
					aluno.setNome(rs.getString("nome"));
					aluno.setNmatricula(rs.getString("nmatricula"));
					aluno.setStatus(rs.getString("status"));
					alunos.add(aluno);
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
		return alunos;
	}

	public void Excluiraluno(int idaluno) {
		String sql = "DELETE FROM aluno WHERE cdaluno = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, idaluno);
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

	public void Alteraraluno(Aluno aluno) {
		String sql = "UPDATE aluno SET nome = ?, nmatricula = ?, status = ? WHERE idaluno = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, aluno.getNome());
			pStatement.setString(2, aluno.getNmatricula());
			pStatement.setString(3, aluno.getStatus());
			pStatement.setInt(4, aluno.getCdaluno());
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
