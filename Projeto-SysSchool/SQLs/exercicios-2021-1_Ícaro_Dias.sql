
DROP table aluno;

CREATE TABLE funcionario (
	nome VARCHAR(40) NOT NULL,
	email VARCHAR(40) NOT NULL,
	senha VARCHAR(50) NOT NULL,
	cdFuncionario INT(10) NOT NULL AUTO_INCREMENT PRIMARY key,
    cpf VARCHAR(15) not null unique,
    dataNascimento date,
    estado VARCHAR(15) ,
    cidade VARCHAR(15) ,
    estadocivil VARCHAR(15) ,
    ativa boolean
);
ALTER TABLE `funcionario`
	ADD COLUMN `nivel` INT NOT NULL DEFAULT '4' AFTER `ativa`;
INSERT INTO funcionario(nome, email, senha, cpf, ativa) VALUES( 'admin', 'admin@admin.com', 'admin', 000000, TRUE);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('admin', 'admin@admin.com', 'admin', 1, '0', NULL, NULL, NULL, NULL, 1, 1);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'aluno@gmail.com', 'admin', 2, '799.164.420-02', '2022-02-17', '332', 'er', '332', 1, 4);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'funcionario@gmail.com', 'admin', 3, '799.164.42043', '2022-03-02', '332', 'er', '332', 1, 2);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'professor@gmail.com', 'admin', 4, '1', '2022-02-04', '332', 'er', '332', 1, 3);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 6, '755.164.420-02', '2022-02-10', '332', 'er', '332', 1, 4);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'admin@admin.com', 'admin', 7, '2', '2022-02-10', '332', 'er', '332', 1, 4);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 8, 'ww-02', '2022-02-17', '332', 'er', '332', 1, 4);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 10, '121212', '2022-02-10', '332', 'er', '332', 1, 4);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 11, '755.164.420-04', '2022-03-04', '332', 'er', '332', 1, 4);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'icarodias2222@gmail.com', 'admin', 12, '799.164.420', '2022-02-24', '332', 'er', '332', 1, 4);
INSERT INTO `funcionario` (`nome`, `email`, `senha`, `cdFuncionario`, `cpf`, `dataNascimento`, `estado`, `cidade`, `estadocivil`, `ativa`, `nivel`) VALUES ('icaro dias dos santos', 'admin@admin.com', 'admin', 13, '111111', '2022-02-24', '332', 'er', '332', 1, 1);

CREATE TABLE `grafic` (
	`cdnotas` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`notas` DOUBLE NOT NULL
);


CREATE TABLE aluno (
    cdaluno INTEGER PRIMARY KEY  NOT NULL AUTO_INCREMENT,
    nome VARCHAR(40) ,
	email VARCHAR(40),
	senha VARCHAR(50),
    cpf VARCHAR(15) not null unique,
    nmatricula VARCHAR(15) ,
    status CHAR(2),
    dataNascimento date,
    estado VARCHAR(15) ,
    cidade VARCHAR(15) ,
    estadocivil VARCHAR(15) ,
    ativa boolean,
    periodo integer);

  INSERT INTO aluno(nome, cpf, status ) values('Antonio Bandeiras', '000102018','MT'),
                         ('Bill Gates',    '00002-2018', 'MT'),
                         ('Steve Sniack', '00003-2018', 'MT'),
                         ('Linus Torvals','000404-2018','MT');
                         
CREATE TABLE curso (
    cdcurso INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nomecurso VARCHAR(20) ,
    valor NUMERIC(7,2));

insert into curso(nomecurso, valor) values('ADS', 800.00),
                        ('Quimica',900.00),
                        ('Agronomia', 1000.00),
                        ('Agroindustria', 1100.00);

CREATE TABLE professor (
    cdprofessor INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(40),
	email VARCHAR(40) NOT NULL,
	senha VARCHAR(50) NOT NULL,
    cpf VARCHAR(15) not null unique,
    dataNascimento date,
    estado VARCHAR(15) ,
    cidade VARCHAR(15) ,
    estadocivil VARCHAR(15) ,
    ativa boolean);

insert into professor(nome) values('REINALDA FERNANDES'),
                             ('MARQUESA LIMA'),
                             ('GEORGINA COTRIM'),
                             ('PAULITA FERREIRA'),
                             ('ICARO DIAS');


CREATE TABLE disciplina (
    cddisciplina INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nomedisciplina varchar(40),
    cdprofessor INTEGER,
    valor NUMERIC(7,2),
	 FOREIGN KEY (cdprofessor) REFERENCES professor(cdprofessor)   
	 on delete cascade);

insert into disciplina(nomedisciplina, cdprofessor, valor) values('ALGORITMO',1,500.00),
                             ('BANCO DE DADOS',2, 600.00),
                             ('TABD',2, 600.00),
                             ('SO',2, 700.00),
                             ('SD',2, 700.00),
                             ('IHM',2,700.00),
                             ('ESTAGIO 1',3, 900.00),                             
                             ('ESTAGIO I1',3, 900.00),                             
                             ('ESTATISTICA',3, 900.00),                             
                             ('PORTUGUES',3, 900.00),                         
                             ('FISICA 1',4, 1000.00),                             
                             ('ROBOTICA',4, 1000.00);

CREATE TABLE semestre (
    cdsemestre INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    ano VARCHAR(15));

INSERT INTO semestre(ano) VALUES('2017.1'),
                           ('2017.2'),
                           ('2018.1'),
                           ('2018.2');
                           
CREATE TABLE turma (
    cdturma INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nometurma VARCHAR(20));

INSERT INTO turma(nometurma) VALUES('PROGRAMADORES'),
                        ('ANALISTAS');


CREATE TABLE matricula (
    cdmatricula INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    cdcurso INTEGER,
    cdaluno INTEGER,
    cdsemestre INTEGER,
    valor NUMERIC(7,2),
    cdturma INTEGER,
	 FOREIGN KEY (cdcurso) REFERENCES curso(cdcurso),
	 FOREIGN KEY (cdaluno) REFERENCES aluno(cdaluno),
	 FOREIGN KEY (cdsemestre) REFERENCES semestre(cdsemestre),
	 FOREIGN KEY (cdturma) REFERENCES turma(cdturma)   
	 on delete cascade);


INSERT INTO matricula(cdcurso, cdaluno, cdsemestre, valor, cdturma) values(1, 1, 4,300.00,1),
                            ( 1, 2, 4,400.00,1),
                            ( 2, 3, 4,500.00,2),
                            ( 3, 4, 4,500.00,2),

                            ( 1, 1, 1, 300.00, 1),
                            ( 1, 2, 1, 400.00, 1),
                            ( 2, 3, 1, 500.00, 2),                         
                            ( 1, 4, 1, 500.00, 2),

                            ( 1, 1, 2, 300.00, 1),
                            ( 1, 2, 2, 400.00, 1),
                            ( 2, 3, 3, 500.00, 2),                         
                            ( 2, 4, 3, 500.00, 2);

CREATE TABLE matdisciplina (
    cdmatdisciplina INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    cdmatricula INTEGER,
    cddisciplina INTEGER,
    media NUMERIC(7,2),
    status CHAR(2) ,
    cdprofessor INTEGER,
    valor NUMERIC(7,2),
	 FOREIGN KEY (cdmatricula) REFERENCES matricula(cdmatricula),
	 FOREIGN KEY (cddisciplina) REFERENCES disciplina(cddisciplina),
	 FOREIGN KEY (cdprofessor) REFERENCES professor(cdprofessor)   
	 on delete cascade);

    insert into matdisciplina(cdmatricula,cddisciplina, status,valor) 
           values( 1,3,'MT', 500.00),
                 ( 1,1,'MT', 600.00),
                 ( 1,2,'MT', 600.00),
                 ( 1,3,'MT', 500.00),
                 ( 3,10,'MT', 500.00),
                 ( 3,3,'MT', 350.00),
                 ( 3,4,'MT', 400.00),
                 ( 2,5,'MT', 350.00),
                 ( 2,5,'MT', 300.00),
                 ( 8,6,'MT', 660.00),
                 ( 9,7,'MT', 760.00),
                 ( 1,8,'MT', 900.00),
                 ( 1,9,'MT', 800.00);


CREATE TABLE nota (
    cdnota INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    cdmatdisciplina INTEGER,
    nota NUMERIC(7,2),
    referencia VARCHAR(20) ,
    status CHAR(2),
	 FOREIGN KEY (cdmatdisciplina) REFERENCES matdisciplina(cdmatdisciplina)   
	 on delete cascade);


INSERT INTO nota( cdmatdisciplina, nota, referencia, status)
   values( 1, 8.00, 'Av I',   'AP'),
   (1, 4.00, 'AV II',  'RP'),
   (1, 3.00, 'AV III', 'RP'),
   
   (2, 6.00, 'Av I',   'RP'),
   (2, 4.00, 'AV II',  'RP'),
   (3, 8.00, 'Av I',   'AP'),
   
   (4, 8.00, 'AV I',   'AP'),
   
   (5, 8.00, 'Av I',   'AP'),
   (5, 4.00, 'AV II', 'RP'),
   (5, 3.00, 'AV III','RP'),
   
   (6, 5.00, 'Av I',  'RP'),
   (6, 5.00, 'AV II', 'RP'),
   
   (7, 7.00, 'Av I',  'AP'),
   (7, 3.00, 'AV II',  'RP'),
   (7, 6.00, 'Av III',  'RP'),
   (7, 4.00, 'AV IV',  'RP'),
   
   (8, 9.00, 'AV I',  'AP'),
   
   (9, 10.00, 'AV I', 'AP'),
   (9, 7.00, 'AV II',  'AP'),
   
   (10, 6.00, 'AV I',  'RP'),
	
	
   (11, 3.00, 'AV I', 'AP'),
   (11, 7.00, 'AV II',  'AP'),
   
   (12, 6.00, 'AV I',  'RP'),
   
   (13, 5.00, 'AV I',  'RP'),
   (13, 3.00, 'AV II',  'RP'),
   (13, 4.00, 'AV III',  'RP');
   
CREATE TABLE dados (
	valorMatDis DOUBLE NULL DEFAULT NULL,
	valorMat DOUBLE NULL DEFAULT NULL,
	numMatPadrao VARCHAR(25) NULL DEFAULT NULL,
	numMat INT(10) NULL DEFAULT NULL
);

CREATE TABLE grafic (
	cdnotas INT(10) NOT NULL AUTO_INCREMENT,
	notas DOUBLE NOT NULL,
	PRIMARY KEY (`cdnotas`) USING BTREE
);

   
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE updateMedia()
BEGIN
	   UPDATE  matdisciplina  set media = CASE
		WHEN cdmatdisciplina = 1 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 1)
		WHEN cdmatdisciplina = 2 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 2)
		WHEN cdmatdisciplina = 3 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 3)
		WHEN cdmatdisciplina = 4 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 4)
		WHEN cdmatdisciplina = 5 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 5)
		WHEN cdmatdisciplina = 6 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 6)
		WHEN cdmatdisciplina = 7 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 7)
		WHEN cdmatdisciplina = 8 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 8)
		WHEN cdmatdisciplina = 9 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 9)
		WHEN cdmatdisciplina = 10 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 10)
		WHEN cdmatdisciplina = 11 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 11)
		WHEN cdmatdisciplina = 12 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 12)
		WHEN cdmatdisciplina = 13 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 13)
	END;
end $$
DELIMITER ;



call updateMedia();

/*
###### exercicios de revisão  ################

1 - Altere o sistema de forma que os alunos ao matricularem nas disciplinas abaixo sejam incluido os professores:
Algoritmo ,Banco de dados,TABD : Reinalda Fernandes
SO, SD, IHM: Georgina Cotrim
Estagio I, estagio II e Estatistica: Marquesa Lima
Portugues, Fisica I e Robotica: Paulita Ferreira
*/

	SET SCHEMA 'icaro';
	
	UPDATE matdisciplina SET cdprofessor = CASE
		WHEN cddisciplina IN (SELECT cddisciplina FROM disciplina WHERE nomedisciplina = 'ALGORITMO' 
		OR nomedisciplina = 'BANCO DE DADOS' OR nomedisciplina = 'TABD') 
		THEN (SELECT cdprofessor FROM professor WHERE nome = 'REINALDA FERNANDES')
		
		WHEN cddisciplina IN (SELECT cddisciplina FROM disciplina WHERE nomedisciplina = 'SO' 
		OR nomedisciplina = 'SD' OR nomedisciplina = 'IHM')
		THEN (SELECT cdprofessor FROM professor WHERE nome = 'MARQUESA LIMA')
		
		WHEN cddisciplina IN (SELECT cddisciplina FROM disciplina WHERE nomedisciplina = 'ESTAGIO 1' 
		OR nomedisciplina = 'ESTAGIO I1' OR nomedisciplina = 'ESTATISTICA')
		THEN (SELECT cdprofessor FROM professor WHERE nome = 'GEORGINA COTRIM')
		
		WHEN cddisciplina IN (SELECT cddisciplina FROM disciplina WHERE nomedisciplina = 'PORTUGUES' 
		OR nomedisciplina = 'FISICA 1' OR nomedisciplina = 'ROBOTICA') 
		THEN (SELECT cdprofessor FROM professor WHERE nome = 'PAULITA FERREIRA')
	END;


/*
2 - Atualize a media e o status das disciplinas em matdisciplina de acordo com os dados lançados na tabela nota.
Para o status utilize a seguinte regra: Média > 7        = AP
                                      				  Média > 3   < 7  = RE
                                      				  Média < 3        = RP
*/


set schema 'icaro';

   UPDATE  matdisciplina  set MEDIA = CASE
		WHEN cdmatdisciplina = 1 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 1)
		WHEN cdmatdisciplina = 2 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 2)
		WHEN cdmatdisciplina = 3 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 3)
		WHEN cdmatdisciplina = 4 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 4)
		WHEN cdmatdisciplina = 5 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 5)
		WHEN cdmatdisciplina = 6 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 6)
		WHEN cdmatdisciplina = 7 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 7)
		WHEN cdmatdisciplina = 8 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 8)
		WHEN cdmatdisciplina = 9 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 9)
		WHEN cdmatdisciplina = 10 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 10)
		WHEN cdmatdisciplina = 11 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 11)
		WHEN cdmatdisciplina = 12 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 12)
		WHEN cdmatdisciplina = 13 THEN (SELECT AVG(nota) FROM nota WHERE cdmatdisciplina = 13)
	END;
	
	UPDATE matdisciplina 
	SET status =  CASE
		WHEN cdmatdisciplina IN (SELECT cdmatdisciplina FROM matdisciplina WHERE media >= 7) THEN 'AP'
		WHEN cdmatdisciplina IN (SELECT cdmatdisciplina FROM matdisciplina WHERE media > 3 AND  media < 7) THEN 'RE'
		WHEN cdmatdisciplina IN (SELECT cdmatdisciplina FROM matdisciplina WHERE media <= 3) THEN 'RP'
	END;
	
/*
3 - Atualize o status da tabela aluno baseada na media da tabela matdisciplina, utilize as seguintes regras: 
                                - Se o aluno tiver 1 disciplina reprovada, status = CO
                                - Se o aluno tiver mais de uma disciplina reprovada,  status = RP,
                                - Nenhuma disciplina reprovada, status = AP
*/

	set schema 'icaro';
	
	
	update aluno 
	set status = 'CO'
	from matricula
	where aluno.cdaluno = matricula.cdaluno and
	(select count(cdmatdisciplina) from matdisciplina where status like 'RP')= 1;
	
	update aluno 
	set status = 'RP'
	from matricula
	where aluno.cdaluno = matricula.cdaluno and
	(select count(cdmatdisciplina) from matdisciplina where status like 'RP')> 1;
	
	update aluno 
	set status = 'AP'
	from matricula
	where aluno.cdaluno = matricula.cdaluno and
	(select count(cdmatdisciplina) from matdisciplina where status like 'RP')< 1;
		 
/*
4 - Faça uma consulta que mostre: o nome do aluno, o nome da disciplina, a média e o status do aluno na disciplina
*/

	set schema 'icaro';
	
	SELECT a.nome, d.nomedisciplina, mt.media, mt.status
	FROM aluno AS a
	INNER JOIN matricula AS m
	ON m.cdaluno = a.cdaluno
	INNER JOIN matdisciplina AS mt
	ON mt.cdmatricula = m.cdmatricula
	INNER JOIN disciplina AS d
	ON d.cddisciplina = mt.cddisciplina;
	

5 - Faça uma consulta que mostre: o nome do aluno, o nome da disciplina, a nota, a referencia e o status, somente dos alunos matriculados no 
semestre 2017.1

	set schema 'icaro';


	SELECT a.nome, d.nomedisciplina, nota.nota, nota.referencia, nota.status
	FROM aluno AS a
	INNER JOIN matricula AS m
	ON m.cdaluno = a.cdaluno
	INNER JOIN matdisciplina AS mt
	ON mt.cdmatricula = m.cdmatricula
	INNER JOIN disciplina AS d
	ON d.cddisciplina = mt.cddisciplina
	INNER JOIN nota
	ON nota.CDMATDISCIPLINA = mt.CDMATDISCIPLINA
	INNER JOIN semestre as s
	ON s.cdsemestre = m.cdsemestre
	where s.ano = '2017.1';
	
6 -Após as inserções dos dados, Faça um código para apagar a tabela matdisciplina.


	DROP TABLE matdisciplinas;



7 -Faça uma consulta para mostrar o aluno que pagou o valor maior no semestre 2017.1(matricula + disciplinas)


	set schema 'icaro';

	SELECT a.nome, sum(mt.valor) + m.valor MaiorValor
	FROM aluno a
	INNER JOIN matricula m
	ON m.cdaluno = a.cdaluno
	INNER JOIN matdisciplina mt
	ON mt.cdmatricula = m.cdmatricula
	INNER JOIN disciplina d
	ON d.cddisciplina = mt.cddisciplina
	INNER JOIN semestre s
	ON s.cdsemestre = m.cdsemestre
	where s.ano = '2017.1'
	group by a.nome, m.valor
	ORDER BY maiorvalor DESC
	LIMIT 1;		   
					  
		  	

8 -faça uma consulte que mostre a disciplina(s) com  mais reprovação: apresente nome da diciplina, professor.


	SET SCHEMA 'icaro';

	SELECT p.nome, COUNT(d.nomedisciplina) quantReprovados, d.nomedisciplina
	FROM disciplina d
	JOIN professor p
	ON p.cdprofessor = d.cdprofessor
	JOIN  matdisciplina md
	ON  d.cddisciplina = md.cddisciplina 
	WHERE md.status = 'RE'
	GROUP BY d.nomedisciplina, p.nome
	ORDER BY quantReprovados DESC 
	LIMIT 1;
	
	
	
9 - mostre quantos alunos foram reprovados em algoritmo.


	set schema 'icaro';
	
	SELECT count(a.nome) AlunosReprovados
	FROM aluno a
	INNER JOIN matricula m
	ON m.cdaluno = a.cdaluno
	INNER JOIN matdisciplina mt
	ON mt.cdmatricula = m.cdmatricula
	INNER JOIN disciplina d
	ON d.cddisciplina = mt.cddisciplina
	where d.nomedisciplina = 'ALGORITMO' 
	AND mt.status = 'RE';

