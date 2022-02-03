package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Aluno;

public class alunoDao {

	public void cadastraraluno(Aluno aluno) throws ClassNotFoundException {

		String numMatricula = "(CONCAT((select numMatPadrao FROM dados), (select numMat FROM dados)))";
		
		//insertnumMat
		String inm = "update dados set numMat=numMat+1";
		
		String sql = "INSERT INTO aluno(nome, nmatricula, status, dataNascimento, estado, cidade, estadocivil, periodo, cpf, ativa)"
				+ " VALUES (?, "+numMatricula+", 'MT', ?, ?, ?, ?, 1, ?, 1)";
		PreparedStatement pStatement = null;
		PreparedStatement pStatementInm = null;
		Connection conn = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatementInm = conn.prepareStatement(inm);
			pStatement.setString(1, aluno.getNome());
			pStatement.setString(2, aluno.getDataNascimento());
			pStatement.setString(3, aluno.getEstado());
			pStatement.setString(4, aluno.getCidade());
			pStatement.setString(5, aluno.getEstadoCivil());
			pStatement.setString(6, aluno.getCpf());
			pStatement.execute();
			pStatementInm.execute();
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
				while (rs.next()) {
					alunos = new ArrayList<Aluno>();
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

	public ArrayList<Aluno> BuscaralunosPorCpf(String cpf) {
		String sql = "SELECT * FROM aluno WHERE cpf = '" + cpf + "'  AND ativa = 1";
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
				while (rs.next()) {
					alunos = new ArrayList<Aluno>();
					aluno = new Aluno();
					aluno.setCdaluno(rs.getInt("cdaluno"));
					aluno.setNome(rs.getString("nome"));
					aluno.setNmatricula(rs.getString("nmatricula"));
					aluno.setStatus(rs.getString("status"));
					aluno.setCpf(rs.getString("cpf"));;
					aluno.setDataNascimento(rs.getString("datanascimento"));
					aluno.setEstado(rs.getString("estado"));
					aluno.setCidade(rs.getString("cidade"));
					aluno.setEstadoCivil(rs.getString("ativa"));
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
		String sql = "UPDATE aluno SET ativa = '0' WHERE cdaluno = ?";
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
		
		String sql = "UPDATE aluno SET nome = ?, cpf = ?, dataNascimento = ?, "
				+ " estado = ?, cidade = ? , estadocivil = ? "
				+ " WHERE cdaluno = ? ";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, aluno.getNome());
			pStatement.setString(2, aluno.getCpf());
			pStatement.setString(3, aluno.getDataNascimento());
			pStatement.setString(4, aluno.getEstado());
			pStatement.setString(5, aluno.getCidade());
			pStatement.setString(6, aluno.getEstadoCivil());
			pStatement.setInt(7, aluno.getCdaluno());
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
