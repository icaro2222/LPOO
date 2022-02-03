-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.27 - MySQL Community Server - GPL
-- OS do Servidor:               Linux
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para sysschool
CREATE DATABASE IF NOT EXISTS `sysschool` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sysschool`;

-- Copiando estrutura para tabela sysschool.aluno
CREATE TABLE IF NOT EXISTS `aluno` (
  `cdaluno` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) DEFAULT NULL,
  `email` VARCHAR(40) NOT NULL DEFAULT 'aluno@gbi.com' COLLATE 'utf8mb4_0900_ai_ci',
  `senha` VARCHAR(50) NOT NULL DEFAULT 'aluno123' COLLATE 'utf8mb4_0900_ai_ci',
  `cpf` varchar(15) NOT NULL,
  `nmatricula` varchar(15) DEFAULT NULL,
  `status` char(2) DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `cidade` varchar(15) DEFAULT NULL,
  `estadocivil` varchar(15) DEFAULT NULL,
  `ativa` tinyint(1) DEFAULT NULL,
  `nivel` int NOT NULL DEFAULT '4',
  `periodo` int DEFAULT NULL,
  PRIMARY KEY (`cdaluno`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.aluno: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` (`cdaluno`, `nome`, `cpf`, `nmatricula`, `status`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `periodo`) VALUES
	(1, 'Antonio Bandeiras', '000102018', NULL, 'MT', NULL, NULL, NULL, NULL, 1, NULL),
	(2, 'Bill Gates', '00002-2018', NULL, 'MT', NULL, NULL, NULL, NULL, 1, NULL),
	(3, 'Steve Sniack', '00003-2018', NULL, 'MT', NULL, NULL, NULL, NULL, 1, NULL),
	(4, 'Linus Torvals', '000404-2018', NULL, 'MT', NULL, NULL, NULL, NULL, 1, NULL),
	(5, 'icaro dias dos santos', '799.164.420-02', '202201GBI0', 'MT', '2022-02-16', '332', 'er', '1', 0, 1),
	(7, 'antonio carlos de jesus teixeira', '755.164.420-02', '202201GBI1', 'MT', '2022-02-18', '332', 'er2313', '1', 1, 1),
	(8, 'eeeeeeeeeeeeee', '3', '202201GBI2', 'MT', '2022-02-18', '332', 'er', '1', 1, 1);
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.curso
CREATE TABLE IF NOT EXISTS `curso` (
  `cdcurso` int NOT NULL AUTO_INCREMENT,
  `nomecurso` varchar(20) DEFAULT NULL,
  `valor` decimal(7,2) DEFAULT NULL,
  PRIMARY KEY (`cdcurso`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.curso: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` (`cdcurso`, `nomecurso`, `valor`) VALUES
	(1, 'ADS', 800.00),
	(2, 'Quimica', 900.00),
	(3, 'Agronomia', 1000.00),
	(4, 'Agroindustria', 1100.00),
	(5, 'Dificil', 5424.00),
	(6, 'Dificil', 444.00),
	(7, 'Dificil', 344.00),
	(8, 'Dificil', 342.00);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.dados
CREATE TABLE IF NOT EXISTS `dados` (
  `valorMatDis` double DEFAULT NULL,
  `valorMat` double DEFAULT NULL,
  `numMatPadrao` varchar(25) DEFAULT NULL,
  `numMat` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.dados: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `dados` DISABLE KEYS */;
INSERT INTO `dados` (`valorMatDis`, `valorMat`, `numMatPadrao`, `numMat`) VALUES
	(300, 400, '202201GBI', 3);
/*!40000 ALTER TABLE `dados` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.disciplina
CREATE TABLE IF NOT EXISTS `disciplina` (
  `cddisciplina` int NOT NULL AUTO_INCREMENT,
  `nomedisciplina` varchar(40) DEFAULT NULL,
  `cdprofessor` int DEFAULT NULL,
  `valor` decimal(7,2) DEFAULT NULL,
  PRIMARY KEY (`cddisciplina`),
  KEY `cdprofessor` (`cdprofessor`),
  CONSTRAINT `disciplina_ibfk_1` FOREIGN KEY (`cdprofessor`) REFERENCES `professor` (`cdprofessor`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.disciplina: ~16 rows (aproximadamente)
/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` (`cddisciplina`, `nomedisciplina`, `cdprofessor`, `valor`) VALUES
	(1, 'ALGORITMO', 1, 500.00),
	(2, 'BANCO DE DADOS', 2, 600.00),
	(3, 'TABD', 2, 600.00),
	(4, 'SO', 2, 700.00),
	(5, 'SD', 2, 700.00),
	(6, 'IHM', 2, 700.00),
	(7, 'ESTAGIO 1', 3, 900.00),
	(8, 'ESTAGIO I1', 3, 900.00),
	(9, 'ESTATISTICA', 3, 900.00),
	(10, 'PORTUGUES', 3, 900.00),
	(11, 'FISICA 1', 4, 1000.00),
	(12, 'ROBOTICA', 4, 1000.00),
	(13, '2', 1, 11.00),
	(14, 'd', 2, 2.00),
	(15, 'Teste', 3, 100.00),
	(16, '3', 1, 3.00);
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `nome` varchar(40) NOT NULL,
  `email` VARCHAR(40) NOT NULL DEFAULT 'funcionario@gbi.com' COLLATE 'utf8mb4_0900_ai_ci',
  `senha` VARCHAR(50) NOT NULL DEFAULT 'funcionario123' COLLATE 'utf8mb4_0900_ai_ci',
  `cdFuncionario` int NOT NULL AUTO_INCREMENT,
  `cpf` varchar(15) NOT NULL,
  `dataNascimento` date DEFAULT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `cidade` varchar(15) DEFAULT NULL,
  `estadocivil` varchar(15) DEFAULT NULL,
  `ativa` tinyint(1) DEFAULT NULL,
  `nivel` int NOT NULL DEFAULT '2',
  PRIMARY KEY (`cdFuncionario`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.funcionario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES
	('admin', 'admin@admin.com', 'admin', 1, '0', NULL, NULL, NULL, NULL, 1, 1),
	('icaro dias dos santos', 'aluno@gmail.com', 'admin', 2, '799.164.420-02', '2022-02-17', '332', 'er', '332', 1, 4),
	('icaro dias dos santos', 'funcionario@gmail.com', 'admin', 3, '799.164.42043', '2022-03-02', '332', 'er', '332', 1, 2),
	('icaro dias dos santos', 'professor@gmail.com', 'admin', 4, '1', '2022-02-04', '332', 'er', '332', 1, 3),
	('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 6, '755.164.420-02', '2022-02-10', '332', 'er', '332', 1, 4),
	('icaro dias dos santos', 'admin@admin.com', 'admin', 7, '2', '2022-02-10', '332', 'er', '332', 1, 4),
	('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 8, 'ww-02', '2022-02-17', '332', 'er', '332', 1, 4),
	('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 10, '121212', '2022-02-10', '332', 'er', '332', 1, 4),
	('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 11, '755.164.420-04', '2022-03-04', '332', 'er', '332', 1, 4),
	('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 12, '799.164.420', '2022-02-24', '332', 'er', '332', 1, 4),
	('icaro dias dos santos', 'admin@admin.com', 'admin', 13, '111111', '2022-02-24', '332', 'er', '332', 1, 1);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.grafic
CREATE TABLE IF NOT EXISTS `grafic` (
  `cdnotas` int NOT NULL AUTO_INCREMENT,
  `notas` double NOT NULL,
  PRIMARY KEY (`cdnotas`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.grafic: ~19 rows (aproximadamente)
/*!40000 ALTER TABLE `grafic` DISABLE KEYS */;
INSERT INTO `grafic` (`cdnotas`, `notas`) VALUES
	(1, 5),
	(2, 4.5),
	(3, 3),
	(4, 6),
	(5, 9),
	(6, 6.12),
	(7, 6.08),
	(8, 6),
	(9, 9.21),
	(10, 32.71),
	(11, 36.86),
	(12, 37.69),
	(13, 36.34),
	(14, 35.71),
	(15, 35.3),
	(16, 35.89),
	(17, 35.45),
	(18, 35.2),
	(19, 35.62);
/*!40000 ALTER TABLE `grafic` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.matdisciplina
CREATE TABLE IF NOT EXISTS `matdisciplina` (
  `cdmatdisciplina` int NOT NULL AUTO_INCREMENT,
  `cdmatricula` int DEFAULT NULL,
  `cddisciplina` int DEFAULT NULL,
  `media` decimal(7,2) DEFAULT NULL,
  `status` char(2) DEFAULT NULL,
  `cdprofessor` int DEFAULT NULL,
  `valor` decimal(7,2) DEFAULT NULL,
  PRIMARY KEY (`cdmatdisciplina`),
  KEY `cdmatricula` (`cdmatricula`),
  KEY `cddisciplina` (`cddisciplina`),
  KEY `cdprofessor` (`cdprofessor`),
  CONSTRAINT `matdisciplina_ibfk_1` FOREIGN KEY (`cdmatricula`) REFERENCES `matricula` (`cdmatricula`),
  CONSTRAINT `matdisciplina_ibfk_2` FOREIGN KEY (`cddisciplina`) REFERENCES `disciplina` (`cddisciplina`),
  CONSTRAINT `matdisciplina_ibfk_3` FOREIGN KEY (`cdprofessor`) REFERENCES `professor` (`cdprofessor`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.matdisciplina: ~16 rows (aproximadamente)
/*!40000 ALTER TABLE `matdisciplina` DISABLE KEYS */;
INSERT INTO `matdisciplina` (`cdmatdisciplina`, `cdmatricula`, `cddisciplina`, `media`, `status`, `cdprofessor`, `valor`) VALUES
	(1, 1, 3, 5.00, 'MT', NULL, 500.00),
	(2, 1, 1, 4.50, 'MT', NULL, 600.00),
	(3, 1, 2, 8.00, 'MT', NULL, 600.00),
	(4, 1, 3, 8.00, 'MT', NULL, 500.00),
	(5, 3, 10, 5.00, 'MT', NULL, 500.00),
	(6, 3, 3, 334.00, 'MT', NULL, 350.00),
	(7, 3, 4, 5.00, 'MT', NULL, 400.00),
	(8, 2, 5, 54.00, 'MT', NULL, 350.00),
	(9, 2, 5, 8.50, 'MT', NULL, 300.00),
	(10, 8, 6, 6.00, 'MT', NULL, 660.00),
	(11, 9, 7, 5.00, 'MT', NULL, 760.00),
	(12, 1, 8, 6.00, 'MT', NULL, 900.00),
	(13, 1, 9, 4.00, 'MT', NULL, 800.00),
	(14, 15, 2, 45.70, 'MT', NULL, 300.00),
	(15, 15, 9, NULL, 'MT', NULL, 300.00),
	(16, 15, 1, NULL, 'MT', NULL, 300.00);
/*!40000 ALTER TABLE `matdisciplina` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.matricula
CREATE TABLE IF NOT EXISTS `matricula` (
  `cdmatricula` int NOT NULL AUTO_INCREMENT,
  `cdcurso` int DEFAULT NULL,
  `cdaluno` int DEFAULT NULL,
  `cdsemestre` int DEFAULT NULL,
  `valor` decimal(7,2) DEFAULT NULL,
  `cdturma` int DEFAULT NULL,
  PRIMARY KEY (`cdmatricula`),
  KEY `cdcurso` (`cdcurso`),
  KEY `cdaluno` (`cdaluno`),
  KEY `cdsemestre` (`cdsemestre`),
  KEY `cdturma` (`cdturma`),
  CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`cdcurso`) REFERENCES `curso` (`cdcurso`),
  CONSTRAINT `matricula_ibfk_2` FOREIGN KEY (`cdaluno`) REFERENCES `aluno` (`cdaluno`),
  CONSTRAINT `matricula_ibfk_3` FOREIGN KEY (`cdsemestre`) REFERENCES `semestre` (`cdsemestre`),
  CONSTRAINT `matricula_ibfk_4` FOREIGN KEY (`cdturma`) REFERENCES `turma` (`cdturma`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.matricula: ~17 rows (aproximadamente)
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
INSERT INTO `matricula` (`cdmatricula`, `cdcurso`, `cdaluno`, `cdsemestre`, `valor`, `cdturma`) VALUES
	(1, 1, 1, 4, 300.00, 1),
	(2, 1, 2, 4, 400.00, 1),
	(3, 2, 3, 4, 500.00, 2),
	(4, 3, 4, 4, 500.00, 2),
	(5, 1, 1, 1, 300.00, 1),
	(6, 1, 2, 1, 400.00, 1),
	(7, 2, 3, 1, 500.00, 2),
	(8, 1, 4, 1, 500.00, 2),
	(9, 1, 1, 2, 300.00, 1),
	(10, 1, 2, 2, 400.00, 1),
	(11, 2, 3, 3, 500.00, 2),
	(12, 2, 4, 3, 500.00, 2),
	(13, 1, 4, 4, 300.00, 1),
	(14, 1, 4, 4, 300.00, 1),
	(15, 1, 5, 4, 300.00, 1),
	(16, 1, 7, 4, 300.00, 1),
	(17, 1, 8, 4, 300.00, 1);
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.nota
CREATE TABLE IF NOT EXISTS `nota` (
  `cdnota` int NOT NULL AUTO_INCREMENT,
  `cdmatdisciplina` int DEFAULT NULL,
  `nota` decimal(7,2) DEFAULT NULL,
  `referencia` varchar(20) DEFAULT NULL,
  `status` char(2) DEFAULT NULL,
  PRIMARY KEY (`cdnota`),
  KEY `cdmatdisciplina` (`cdmatdisciplina`),
  CONSTRAINT `nota_ibfk_1` FOREIGN KEY (`cdmatdisciplina`) REFERENCES `matdisciplina` (`cdmatdisciplina`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.nota: ~40 rows (aproximadamente)
/*!40000 ALTER TABLE `nota` DISABLE KEYS */;
INSERT INTO `nota` (`cdnota`, `cdmatdisciplina`, `nota`, `referencia`, `status`) VALUES
	(1, 1, 8.00, 'Av I', 'AP'),
	(2, 1, 4.00, 'AV II', 'RP'),
	(3, 1, 3.00, 'AV III', 'RP'),
	(4, 2, 6.00, 'Av I', 'RP'),
	(5, 2, 4.00, 'AV II', 'RP'),
	(6, 3, 8.00, 'Av I', 'AP'),
	(7, 4, 8.00, 'AV I', 'AP'),
	(8, 5, 8.00, 'Av I', 'AP'),
	(9, 5, 4.00, 'AV II', 'RP'),
	(10, 5, 3.00, 'AV III', 'RP'),
	(11, 6, 5.00, 'Av I', 'RP'),
	(12, 6, 5.00, 'AV II', 'RP'),
	(13, 7, 7.00, 'Av I', 'AP'),
	(14, 7, 3.00, 'AV II', 'RP'),
	(15, 7, 6.00, 'Av III', 'RP'),
	(16, 7, 4.00, 'AV IV', 'RP'),
	(17, 8, 9.00, 'AV I', 'AP'),
	(18, 9, 10.00, 'AV I', 'AP'),
	(19, 9, 7.00, 'AV II', 'AP'),
	(20, 10, 6.00, 'AV I', 'RP'),
	(21, 11, 3.00, 'AV I', 'AP'),
	(22, 11, 7.00, 'AV II', 'AP'),
	(23, 12, 6.00, 'AV I', 'RP'),
	(24, 13, 5.00, 'AV I', 'RP'),
	(25, 13, 3.00, 'AV II', 'RP'),
	(26, 13, 4.00, 'AV III', 'RP'),
	(27, 2, 5.00, 'AV I', NULL),
	(28, 2, 3.00, 'AV IW', NULL),
	(29, 14, 5.00, 'AV IW', NULL),
	(30, 8, 99.00, 'mt', NULL),
	(31, 6, 992.00, 'AV IW', NULL),
	(32, 14, 121.00, 'AV I', NULL),
	(33, 14, 98.00, 'AV I', NULL),
	(34, 14, -1.00, 'AV I', NULL),
	(35, 14, 12.00, 'AV IW', NULL),
	(36, 14, 12.00, 'AV I', NULL),
	(37, 14, 99.00, 'AV I', NULL),
	(38, 14, 0.00, 'AV I', NULL),
	(39, 14, 12.00, 'AV IW', NULL),
	(40, 14, 99.00, 'AV IW', NULL);
/*!40000 ALTER TABLE `nota` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.professor
CREATE TABLE IF NOT EXISTS `professor` (
  `cdprofessor` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) DEFAULT NULL,
  `email` VARCHAR(40) NOT NULL DEFAULT 'professor@gbi.com' COLLATE 'utf8mb4_0900_ai_ci',
  `senha` VARCHAR(50) NOT NULL DEFAULT 'professor123' COLLATE 'utf8mb4_0900_ai_ci',
  `cpf` varchar(15) NOT NULL,
  `dataNascimento` date DEFAULT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `cidade` varchar(15) DEFAULT NULL,
  `estadocivil` varchar(15) DEFAULT NULL,
  `ativa` tinyint(1) DEFAULT NULL,
  `nivel` int NOT NULL DEFAULT '3',
  PRIMARY KEY (`cdprofessor`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.professor: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` (`cdprofessor`, `nome`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`) VALUES
	(1, 'REINALDA FERNANDES', '1', NULL, NULL, NULL, NULL, 1),
	(2, 'MARQUESA LIMA', '2', NULL, NULL, NULL, NULL, 1),
	(3, 'GEORGINA COTRIM', '3', NULL, NULL, NULL, NULL, 1),
	(4, 'PAULITA FERREIRA', '4', NULL, NULL, NULL, NULL, 1),
	(5, 'ICARO DIAS', '5', NULL, NULL, NULL, NULL, 1),
	(6, 'icaro dias dos santos', '799.164.420-02', '2022-01-06', '332', 'er', '332', 1),
	(8, 'icaro dias dos santos', '755.164.420-02', '2022-02-16', '332', 'er', '332', 1);
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.semestre
CREATE TABLE IF NOT EXISTS `semestre` (
  `cdsemestre` int NOT NULL AUTO_INCREMENT,
  `ano` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`cdsemestre`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.semestre: ~12 rows (aproximadamente)
/*!40000 ALTER TABLE `semestre` DISABLE KEYS */;
INSERT INTO `semestre` (`cdsemestre`, `ano`) VALUES
	(1, '2017.1'),
	(2, '2017.2'),
	(3, '2018.1'),
	(4, '2018.2'),
	(5, '2017-1'),
	(6, '2017-1'),
	(7, '2017-1'),
	(8, '2017-1'),
	(9, '2017-1'),
	(10, '17'),
	(11, '17'),
	(12, '2017-1');
/*!40000 ALTER TABLE `semestre` ENABLE KEYS */;

-- Copiando estrutura para tabela sysschool.turma
CREATE TABLE IF NOT EXISTS `turma` (
  `cdturma` int NOT NULL AUTO_INCREMENT,
  `nometurma` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cdturma`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela sysschool.turma: ~25 rows (aproximadamente)
/*!40000 ALTER TABLE `turma` DISABLE KEYS */;
INSERT INTO `turma` (`cdturma`, `nometurma`) VALUES
	(1, 'PROGRAMADORES'),
	(2, 'ANALISTAS'),
	(3, '5647'),
	(4, 'Develops'),
	(5, 'Develops'),
	(6, 'u'),
	(7, 'u'),
	(8, 'Da bagun�a'),
	(9, 'Da bagun�a'),
	(10, 'Develops'),
	(11, 'Develops'),
	(12, '5647'),
	(13, 'Da bagun�a'),
	(14, 'Develops'),
	(15, 'Develops'),
	(16, 'Develops'),
	(17, 'Develops'),
	(18, 'Develops'),
	(19, ''),
	(20, 'Engenharia'),
	(21, 'u'),
	(22, ''),
	(23, ''),
	(24, ''),
	(25, 'u');
/*!40000 ALTER TABLE `turma` ENABLE KEYS */;

-- Copiando estrutura para procedure sysschool.updateMedia
DELIMITER //
CREATE PROCEDURE `updateMedia`()
BEGIN
      DECLARE a INT DEFAULT(SELECT COUNT(cdmatdisciplina)+1 FROM matdisciplina);
      simple_loop: LOOP
         SET a=a-1;
			UPDATE matdisciplina SET media = (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = a)
			WHERE  cdmatdisciplina = a;
         IF a=1 THEN
            LEAVE simple_loop;
         END IF;
   END LOOP simple_loop;
END//
DELIMITER ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
