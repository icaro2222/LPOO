package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Matricula;

public class MatriculaDao {

	public void cadastrarMatricula(Matricula matricula) throws ClassNotFoundException {

		String sqlAluno = "(select max(cdaluno) FROM aluno)";
		String sqlValor = "(select valorMatDis FROM dados)";
		String sqlSemestre = "(SELECT cdsemestre FROM semestre WHERE ano = (SELECT MAX(ano) FROM semestre))";

		int sqlCurso = matricula.getCurso().getCdcurso();
		int sqlTurma = matricula.getTurma().getCdturma();
		

		String sql = "INSERT INTO matricula(cdcurso, cdaluno, cdsemestre, valor, cdturma)"
				+ " VALUES ("+sqlCurso+", "+sqlAluno+", "+sqlSemestre+", "+sqlValor+", "+sqlTurma+")";
		PreparedStatement pStatement = null;
		Connection conn = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
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

	public ArrayList<Matricula> BuscarMatriculasPorDescricao(String nome) {
		String sql = "SELECT * FROM matricula WHERE cdmatricula LIKE '%" + nome + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Matricula Matricula = null;
		ArrayList<Matricula> Matriculas = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				Matriculas = new ArrayList<Matricula>();
				while (rs.next()) {
					Matricula = new Matricula();
					Matricula.setCdmatricula(rs.getInt("cdmatricula"));
					Matricula.setValor(rs.getDouble("valor"));					Matriculas.add(Matricula);
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
		return Matriculas;
	}

	public ArrayList<Matricula> BuscarMatriculasPorId(int idMatricula) {
		
		String sql;
		if(idMatricula==  -1) {
			sql = "SELECT * FROM matricula";
		}else {
			sql = "SELECT * FROM matricula WHERE cdmatricula LIKE '%" + idMatricula + "%'";
		}
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Matricula Matricula = null;
		ArrayList<Matricula> Matriculas = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				Matriculas = new ArrayList<Matricula>();
				while (rs.next()) {
					Matricula = new Matricula();
					Matricula.setCdmatricula(rs.getInt("cdmatricula"));
					Matricula.setValor(rs.getDouble("valor"));
					Matriculas.add(Matricula);
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
		return Matriculas;
	}

//	public void ExcluirMatricula(int idMatricula) {
//		String sql = "DELETE FROM Matricula WHERE cdMatricula = ?";
//		PreparedStatement pStatement = null;
//		Connection conn = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			pStatement.setInt(1, idMatricula);
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
//	public void AlterarMatricula(Matricula Matricula) {
//		String sql = "UPDATE Matricula SET nome = ?, nmatricula = ?, status = ? WHERE idMatricula = ?";
//		PreparedStatement pStatement = null;
//		Connection conn = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			pStatement.setString(1, Matricula.getNome());
//			pStatement.setString(2, Matricula.getNmatricula());
//			pStatement.setString(3, Matricula.getStatus());
//			pStatement.setInt(4, Matricula.getCdMatricula());
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
