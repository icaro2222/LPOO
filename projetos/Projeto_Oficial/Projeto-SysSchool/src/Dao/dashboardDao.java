package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dashboardDao {

	public double[] dados() {

		double valor[] = new double[40];

		String sqlmedia = "SELECT ROUND(AVG(media),2) as media FROM matdisciplina";
		String sqlQuantDis = "SELECT COUNT(cddisciplina) as dis FROM disciplina";
		String sqlaluno = "SELECT count(cdaluno) as alun FROM aluno";
		String sqlprofessor = "SELECT count(cdprofessor) as prof FROM professor";
		String sqlnotas = "SELECT notas as notas FROM grafic ORDER BY cdnotas DESC LIMIT 10";
		
		ResultSet rs, rsaluno, rsprof, rsnotas = null, rsdis = null;
		Connection conn = null;
		PreparedStatement pStatement = null, psAluno = null, psProfessor = null, psNotas = null, psDis = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			
			pStatement = conn.prepareStatement(sqlmedia);
			psAluno = conn.prepareStatement(sqlaluno);
			psProfessor = conn.prepareStatement(sqlprofessor);
			psNotas = conn.prepareStatement(sqlnotas);
			psDis = conn.prepareStatement(sqlQuantDis);
			
			rs = pStatement.executeQuery();
			rsaluno = psAluno.executeQuery();
			rsprof = psProfessor.executeQuery();
			rsnotas = psNotas.executeQuery();
			rsdis = psDis.executeQuery();
			
			if (rs != null) {
				rs.next();
				rsaluno.next();
				rsdis.next();
				rsprof.next();
				valor[0] = rs.getDouble("media");
				valor[1] = rsaluno.getInt("alun");
				valor[2] = rsprof.getInt("prof");
				valor[3] = rsdis.getInt("dis");
				int cont = 4;
				while (rsnotas.next()) {
					valor[cont]= rsnotas.getDouble("notas");
					cont++;
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
		
//		int cont = 0;
//		while (cont<10) {
//			System.out.println(valor[cont]);
//			cont++;
//		}
		return valor;
	}

	public double[] dadosAluno() {

		double valor[] = new double[40];

		String sqlmedia = "SELECT ROUND(AVG(media),2) as media FROM matdisciplina";
		String sqlQuantDis = "select count(m.cdsemestre) from aluno a" + 
				"	join matricula m" + 
				"	on a.cdaluno = m.cdaluno" + 
				"	join matdisciplina md" + 
				"	on m.cdmatricula = md.cdmatricula" + 
				"	where a.nome = nomeAluno" + 
				"	and m.cdsemestre in (select cdsemestre from semestre);";
		
		String sqlaluno = "SELECT count(cdaluno) as alun FROM aluno";
		String sqlprofessor = "SELECT count(cdprofessor) as prof FROM professor";
		String sqlnotas = "SELECT notas as notas FROM grafic ORDER BY cdnotas DESC LIMIT 10";
		
		ResultSet rs, rsaluno, rsprof, rsnotas = null, rsdis = null;
		Connection conn = null;
		PreparedStatement pStatement = null, psAluno = null, psProfessor = null, psNotas = null, psDis = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			
			pStatement = conn.prepareStatement(sqlmedia);
			psAluno = conn.prepareStatement(sqlaluno);
			psProfessor = conn.prepareStatement(sqlprofessor);
			psNotas = conn.prepareStatement(sqlnotas);
			psDis = conn.prepareStatement(sqlQuantDis);
			
			rs = pStatement.executeQuery();
			rsaluno = psAluno.executeQuery();
			rsprof = psProfessor.executeQuery();
			rsnotas = psNotas.executeQuery();
			rsdis = psDis.executeQuery();
			
			if (rs != null) {
				rs.next();
				rsaluno.next();
				rsdis.next();
				rsprof.next();
				valor[0] = rs.getDouble("media");
				valor[1] = rsaluno.getInt("alun");
				valor[2] = rsprof.getInt("prof");
				valor[3] = rsdis.getInt("dis");
				int cont = 4;
				while (rsnotas.next()) {
					valor[cont]= rsnotas.getDouble("notas");
					cont++;
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
		
//		int cont = 0;
//		while (cont<10) {
//			System.out.println(valor[cont]);
//			cont++;
//		}
		return valor;
	}

}
