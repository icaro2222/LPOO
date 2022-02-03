package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.MatriculaDisciplina;
import Model.Nota;

public class NotaDao {

	public void cadastrarNota(Nota nota) throws ClassNotFoundException {

		int cdmatdisciplina = nota.getMatriculaDisciplina().getCdmatdisciplina();
		double notas = nota.getNota();
		String referencia = nota.getReferencia();
		
		double media = 0;
		
		String sqlmedia = "SELECT ROUND(AVG(media),2) as media FROM matdisciplina";
		String sql = "INSERT INTO nota(cdmatdisciplina, nota, referencia)"
				+ " VALUES ("+cdmatdisciplina+","+notas+",'"+referencia+"')";
		String sqlUpdate = "call updateMedia();";
		
		PreparedStatement pStatement = null, psnota = null, psup = null,psmedia = null;
		Connection conn = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			psup = conn.prepareStatement(sqlUpdate);
			pStatement.execute();
			new Thread();
			Thread.sleep(1300);
			psup.execute();
			
			psmedia = conn.prepareStatement(sqlmedia);
			ResultSet rsmedia = psmedia.executeQuery();

			if (rsmedia != null) {
				rsmedia.next();
				media = rsmedia.getDouble("media");
				String sqlnotas = "INSERT INTO grafic(notas) VALUES("+media+")";

				psnota = conn.prepareStatement(sqlnotas);
				psnota.execute();
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

	public ArrayList<MatriculaDisciplina> BuscarmatriculaDisciplinasPorId(int idmatriculaDisciplina) {
		
		String sql;
		if(idmatriculaDisciplina==  -1) {
			sql = "SELECT * FROM matriculaDisciplina";
		}else {
			sql = "SELECT * FROM matriculaDisciplina WHERE cdmatriculaDisciplina LIKE '%" + idmatriculaDisciplina + "%'";
		}
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
					matriculaDisciplina.setValor(rs.getDouble("valor"));
					matriculaDisciplinas.add(matriculaDisciplina);
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
