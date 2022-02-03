package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Curso;

public class CursoDao {

	public void cadastrarCurso(Curso curso) throws ClassNotFoundException {

		String sql = "INSERT INTO curso(nomecurso, valor) VALUES ( ?, ?)";
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, curso.getNomecurso());
			pStatement.setDouble(2, curso.getValor());
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

	public ArrayList<Curso> BuscarCursosPorDescricao(String nome) {
		String sql = "SELECT * FROM curso WHERE nomecurso LIKE '%" + nome + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Curso curso = null;
		ArrayList<Curso> cursos = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				cursos = new ArrayList<Curso>();
				while (rs.next()) {
					curso = new Curso();
					curso.setCdcurso(rs.getInt("cdcurso"));
					curso.setNomecurso(rs.getString("nomecurso"));
					curso.setValor(rs.getDouble("valor"));;
					cursos.add(curso);
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
		return cursos;
	}

	public ArrayList<Curso> BuscarCursosPorId(int idcurso) {

		String sql;
		if(idcurso == -1) {
			sql = "SELECT * FROM curso";
		}else {
			sql = "SELECT * FROM curso WHERE cdcurso LIKE '%" + idcurso + "%'";
		}
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Curso curso = null;
		ArrayList<Curso> cursos = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				cursos = new ArrayList<Curso>();
				while (rs.next()) {
					curso = new Curso();
					curso.setCdcurso(rs.getInt("cdcurso"));
					curso.setNomecurso(rs.getString("nomecurso"));
					curso.setValor(rs.getDouble("valor"));;
					cursos.add(curso);
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
		return cursos;
	}

	public void ExcluirCurso(int idcurso) {
		String sql = "DELETE FROM curso WHERE cdcurso = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, idcurso);
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

	public void AlterarCurso(Curso curso) {
		String sql = "UPDATE curso SET nomecurso = ?, valor = ? WHERE idcurso = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, curso.getNomecurso());
			pStatement.setDouble(2, curso.getValor());
			pStatement.setInt(3, curso.getCdcurso());
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
