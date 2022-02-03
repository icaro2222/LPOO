package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Professor;

public class ProfessorDao {

	public void cadastrarProfessor(Professor professor) throws ClassNotFoundException {

		String sql = "INSERT INTO professor(nome, dataNascimento, estado, cidade, estadocivil, cpf, ativa)"
				+ " VALUES (?, ?, ?, ?, ?, ?, 1)";
		
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, professor.getNome());
			pStatement.setString(2, professor.getDataNascimento());
			pStatement.setString(3, professor.getEstado());
			pStatement.setString(4, professor.getCidade());
			pStatement.setString(5, professor.getEstadoCivil());
			pStatement.setString(6, professor.getCpf());
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

	public ArrayList<Professor> BuscarProfessorsPorCpf(String cpf) {
		String sql = "SELECT * FROM professor WHERE cpf = '" + cpf + "' AND ativa = 1";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Professor professor = null;
		ArrayList<Professor> professors = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				professors = new ArrayList<Professor>();
				while (rs.next()) {
					professor = new Professor();
					professor.setCdprofessor(rs.getInt("cdprofessor"));
					professor.setNome(rs.getString("nome"));
					professor.setCpf(rs.getString("cpf"));;
					professor.setDataNascimento(rs.getString("datanascimento"));
					professor.setEstado(rs.getString("estado"));
					professor.setCidade(rs.getString("cidade"));
					professor.setEstadoCivil(rs.getString("ativa"));
					professors.add(professor);
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
		return professors;
	}

	public ArrayList<Professor> BuscarProfessorsPorDescricao(String nome) {
		String sql = "SELECT * FROM professor WHERE nome LIKE '%" + nome + "%' AND ativa = 1";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Professor professor = null;
		ArrayList<Professor> professors = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				professors = new ArrayList<Professor>();
				while (rs.next()) {
					professor = new Professor();
					professor.setCdprofessor(rs.getInt("cdprofessor"));
					professor.setNome(rs.getString("nome"));
					professors.add(professor);
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
		return professors;
	}

	public ArrayList<Professor> BuscarProfessorsPorId(int idProfessor) {

		String sql;
		if(idProfessor ==  -1) {
			sql = "SELECT * FROM professor";
		}else {
			sql = "SELECT * FROM professor WHERE cdProfessor LIKE '%" + idProfessor + "%'";
		}
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Professor professor = null;
		ArrayList<Professor> professors = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				professors = new ArrayList<Professor>();
				while (rs.next()) {
					professor = new Professor();
					professor.setCdprofessor(rs.getInt("cdProfessor"));
					professor.setNome(rs.getString("nome"));
					professors.add(professor);
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
		return professors;
	}

	public void ExcluirProfessor(int idProfessor) {
		String sql = "DELETE FROM Professor WHERE cdProfessor = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, idProfessor);
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

	public void AlterarProfessor(Professor professor) {
		String sql = "UPDATE Professor SET nome = ? WHERE idprofessor = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, professor.getNome());
			pStatement.setInt(2, professor.getCdprofessor());
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
