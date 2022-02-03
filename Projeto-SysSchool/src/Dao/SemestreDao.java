package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Semestre;

public class SemestreDao {

	public void cadastrarSemestre(Semestre Semestre) throws ClassNotFoundException {

		String sql = "INSERT INTO semestre(ano) VALUES (?)";
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, Semestre.getAno());
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

	public ArrayList<Semestre> BuscarSemestresPorDescricao(String nome) {
		String sql = "SELECT * FROM semestre WHERE ano LIKE '%" + nome + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Semestre semestre = null;
		ArrayList<Semestre> semestres = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				semestres = new ArrayList<Semestre>();
				while (rs.next()) {
					semestre = new Semestre();
					semestre.setCdsemestre(rs.getInt("cdsemestre"));
					semestre.setAno(rs.getString("ano"));
					semestres.add(semestre);
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
		return semestres;
	}

	public ArrayList<Semestre> BuscarSemestresPorId(int idSemestre) {
		
		String sql;
		if(idSemestre == -1) {
			sql = "SELECT * FROM semestre";
		}else {
			sql = "SELECT * FROM semestre WHERE cdsemestre LIKE '%" + idSemestre + "%'";
		}
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Semestre semestre = null;
		ArrayList<Semestre> semestres = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				semestres = new ArrayList<Semestre>();
				while (rs.next()) {
					semestre = new Semestre();
					semestre.setCdsemestre(rs.getInt("cdsemestre"));
					semestre.setAno(rs.getString("ano"));
					semestres.add(semestre);
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
		return semestres;
	}

//	public void ExcluirSemestre(int idSemestre) {
//		String sql = "DELETE FROM Semestre WHERE cdSemestre = ?";
//		PreparedStatement pStatement = null;
//		Connection conn = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			pStatement.setInt(1, idSemestre);
//			pStatement.execute();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pStatement != null)
//					pStatement.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//
//			try {
//				if (conn != null)
//					conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//	}
//
//	public void AlterarSemestre(Semestre Semestre) {
//		String sql = "UPDATE Semestre SET nome = ? WHERE idSemestre = ?";
//		PreparedStatement pStatement = null;
//		Connection conn = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			pStatement.setString(1, Semestre.getNome());
//			pStatement.setInt(2, Semestre.getCdSemestre());
//			pStatement.execute();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pStatement != null)
//					pStatement.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//
//			try {
//				if (conn != null)
//					conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//	}
}
