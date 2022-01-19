package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Disciplina;

public class DisciplinaDao {

	public void cadastrarDisciplina(Disciplina Disciplina) throws ClassNotFoundException {

		String sql = "INSERT INTO disciplina(nomedisciplina) VALUES (?)";
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, Disciplina.getNome());
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

	public ArrayList<Disciplina> BuscarDisciplinasPorDescricao(String nome) {
		String sql = "SELECT * FROM disciplina WHERE nomedisciplina LIKE '%" + nome + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Disciplina disciplina = null;
		ArrayList<Disciplina> disciplinas = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				disciplinas = new ArrayList<Disciplina>();
				while (rs.next()) {
					disciplina = new Disciplina();
					disciplina.setCddisciplina(rs.getInt("cddisciplina"));
					disciplina.setNome(rs.getString("nomedisciplina"));
					disciplina.setCdprofessor(rs.getInt("cdprofessor"));
					disciplina.setValor(rs.getDouble("valor"));
					disciplinas.add(disciplina);
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
		return disciplinas;
	}

	public Disciplina BuscarDisciplinasPorId(int idDisciplina) {
		String sql = "SELECT * FROM Disciplina WHERE cdDisciplina LIKE '%" + idDisciplina + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Disciplina Disciplina = null;
		ArrayList<Disciplina> Disciplinas = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				Disciplinas = new ArrayList<Disciplina>();
				while (rs.next()) {
					Disciplina = new Disciplina();
					Disciplina.setCddisciplina(rs.getInt("cdDisciplina"));
					Disciplina.setNome(rs.getString("nome"));
					Disciplinas.add(Disciplina);
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
		return Disciplina;
	}

	public void ExcluirDisciplina(int idDisciplina) {
		String sql = "DELETE FROM Disciplina WHERE cdDisciplina = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, idDisciplina);
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

	public void AlterarDisciplina(Disciplina Disciplina) {
		String sql = "UPDATE Disciplina SET nome = ? WHERE idDisciplina = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, Disciplina.getNome());
			pStatement.setInt(2, Disciplina.getCddisciplina());
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
