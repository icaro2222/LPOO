package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.MatriculaDisciplina;

public class MatDisciplinaDao {

	public void cadastrarmatriculaDisciplina(MatriculaDisciplina matriculaDisciplina) throws ClassNotFoundException {

		String sqlValor = "(select valorMatdis FROM dados)";
		String sqlmatricula = "(select MAX(cdmatricula) FROM matricula WHERE cdaluno ="+
					matriculaDisciplina.getMatricula().getAluno().getCdaluno()+")";
		
		String sql = "INSERT INTO matdisciplina(cdmatricula, cddisciplina, valor, status)"
				+ " VALUES ("+sqlmatricula+", ?, "+sqlValor+", 'MT')";
		PreparedStatement pStatement = null;
		Connection conn = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setLong(1, matriculaDisciplina.getDisciplina().getCddisciplina());
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
		}
	}

	public ArrayList<MatriculaDisciplina> BuscarmatriculaDisciplinasPorDescricao(String nome) {
		String sql = "SELECT * FROM matriculaDisciplina WHERE cdmatriculaDisciplina LIKE '%" + nome + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		MatriculaDisciplina matriculaDisciplina = null;
		ArrayList<MatriculaDisciplina> matriculaDisciplinas = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				matriculaDisciplinas = new ArrayList<MatriculaDisciplina>();
				while (rs.next()) {
					matriculaDisciplina = new MatriculaDisciplina();
					matriculaDisciplina.setCdmatdisciplina(rs.getInt("cdmatriculaDisciplina"));
					matriculaDisciplina.setValor(rs.getDouble("valor"));					matriculaDisciplinas.add(matriculaDisciplina);
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
		return matriculaDisciplinas;
	}

	public int BuscarmatriculaDisciplinasPorId(MatriculaDisciplina matriculaDisciplina) {
		
		int cd = 0;

		String sql = " SELECT cdmatdisciplina cdm FROM matdisciplina md "
				+ " JOIN matricula m "
				+ " On m.cdmatricula = md.cdmatricula "
				+ " WHERE m.cdaluno ="+matriculaDisciplina.getMatricula().getAluno().getCdaluno()
				+ " AND md.cddisciplina = " + matriculaDisciplina.getDisciplina().getCddisciplina()+";";
		
		
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				rs.next();
					cd = rs.getInt("cdm");
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
		return cd;
	}

//	public void ExcluirmatriculaDisciplina(int idmatriculaDisciplina) {
//		String sql = "DELETE FROM matriculaDisciplina WHERE cdmatriculaDisciplina = ?";
//		PreparedStatement pStatement = null;
//		Connection conn = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			pStatement.setInt(1, idmatriculaDisciplina);
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
//	public void AlterarmatriculaDisciplina(matriculaDisciplina matriculaDisciplina) {
//		String sql = "UPDATE matriculaDisciplina SET nome = ?, nmatriculaDisciplina = ?, status = ? WHERE idmatriculaDisciplina = ?";
//		PreparedStatement pStatement = null;
//		Connection conn = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			pStatement.setString(1, matriculaDisciplina.getNome());
//			pStatement.setString(2, matriculaDisciplina.getNmatriculaDisciplina());
//			pStatement.setString(3, matriculaDisciplina.getStatus());
//			pStatement.setInt(4, matriculaDisciplina.getCdmatriculaDisciplina());
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
