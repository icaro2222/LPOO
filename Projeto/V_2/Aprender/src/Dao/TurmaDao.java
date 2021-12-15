package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Turma;

public class TurmaDao {

	public void cadastrarTurma(Turma turma) throws ClassNotFoundException {

		String sql = "INSERT INTO turma(nometurma) VALUES (?)";
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, turma.getNometurma());
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

	public ArrayList<Turma> BuscarTurmasPorDescricao(String nome) {
		String sql = "SELECT * FROM turma WHERE nometurma LIKE '%" + nome + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Turma turma = null;
		ArrayList<Turma> turmas = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				turmas = new ArrayList<Turma>();
				while (rs.next()) {
					turma = new Turma();
					turma.setCdturma(rs.getInt("cdturma"));
					turma.setNometurma(rs.getString("nometurma"));
					turmas.add(turma);
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
		return turmas;
	}

	public ArrayList<Turma> BuscarTurmasPorId(int idturma) {

		String sql;
		if(idturma ==  -1) {
			sql = "SELECT * FROM turma";
		}else {
			sql = "SELECT * FROM turma WHERE cdturma LIKE '%" + idturma + "%'";
		}
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Turma turma = null;
		ArrayList<Turma> turmas = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				turmas = new ArrayList<Turma>();
				while (rs.next()) {
					turma = new Turma();
					turma.setCdturma(rs.getInt("cdturma"));
					turma.setNometurma(rs.getString("nometurma"));
					turmas.add(turma);
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
		return turmas;
	}

	public void ExcluirTurma(int idturma) {
		String sql = "DELETE FROM turma WHERE cdturma = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, idturma);
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

	public void AlterarTurma(Turma turma) {
		String sql = "UPDATE turma SET nometurso = ? WHERE idturma = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, turma.getNometurma());
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
