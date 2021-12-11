package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.Aluno;

public class cursoDao {

	public void cadastraraluno(Aluno aluno) throws ClassNotFoundException {

		String sql = "INSERT INTO Aluno VALUES (?, ?, ?, ?)";
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, aluno.getCdaluno());
			pStatement.setString(2, aluno.getNome());
			pStatement.setString(3, aluno.getNmatricula());
			pStatement.setString(4, aluno.getStatus());
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
//	public ArrayList<aluno> BuscaralunosPorDescricao(String descricao) {
//		String sql = "SELECT * FROM aluno WHERE descricao LIKE '%" + descricao + "%'";
//		ResultSet rs = null;
//		Connection conn = null;
//		PreparedStatement pStatement = null;
//		aluno aluno = null;
//		ArrayList<aluno> alunos = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			rs = pStatement.executeQuery();
//			if (rs != null) {
//				alunos = new ArrayList<aluno>();
//				while (rs.next()) {
//					aluno = new aluno();
//					aluno.setIdaluno(rs.getInt("idaluno"));
//					aluno.setDescricao(rs.getString("descricao"));
//					aluno.setQuantidade(rs.getInt("quantidade"));
//					aluno.setPreco(rs.getDouble("preco"));
//					aluno.setOnLine(rs.getBoolean("onLine"));
//					alunos.add(aluno);
//				}
//			}
//
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
//		return alunos;
//	}
//
//	public void Excluiraluno(int idaluno) {
//		String sql = "DELETE FROM aluno WHERE idaluno = ?";
//		PreparedStatement pStatement = null;
//		Connection conn = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			pStatement.setInt(1, idaluno);
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
//	public void Alteraraluno(aluno aluno) {
//		String sql = "UPDATE aluno SET descricao = ?, quantidade = ?, preco = ?, onLine = ? WHERE idaluno = ?";
//		PreparedStatement pStatement = null;
//		Connection conn = null;
//		try {
//			conn = new MySqlConnection().getConnection();
//			pStatement = conn.prepareStatement(sql);
//			pStatement.setString(1, aluno.getDescricao());
//			pStatement.setInt(2, aluno.getQuantidade());
//			pStatement.setDouble(3, aluno.getPreco());
//			pStatement.setBoolean(4, aluno.isOnLine());
//			pStatement.setInt(5, aluno.getIdaluno());
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

//}
