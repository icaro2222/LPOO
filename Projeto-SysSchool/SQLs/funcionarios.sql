
CREATE TABLE funcionario (
	nome VARCHAR(40) NOT NULL,
	senha VARCHAR(50) NOT NULL,
	cdFuncionario INT(10) NOT NULL AUTO_INCREMENT PRIMARY key,
    cpf VARCHAR(15) not null unique,
    dataNascimento date,
    estado VARCHAR(15) ,
    cidade VARCHAR(15) ,
    estadocivil VARCHAR(15) ,
    ativa boolean
);

INSERT INTO funcionario(nome, senha, cpf, ativa) VALUES('admin@admin.com', 'admin', 000000, TRUE);

CREATE TABLE grafic (
	cdnotas INT(10) NOT NULL AUTO_INCREMENT,
	notas DOUBLE NOT NULL,
	PRIMARY KEY (`cdnotas`) USING BTREE
);


CREATE TABLE aluno (
    cdaluno INTEGER PRIMARY KEY  NOT NULL AUTO_INCREMENT,
    nome VARCHAR(40) ,
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
    cpf VARCHAR(15) not null unique,
    dataNascimento date,
    estado VARCHAR(15) ,
    cidade VARCHAR(15) ,
    estadocivil VARCHAR(15) ,
    ativa boolean);

insert into professor(nome, cpf) values('REINALDA FERNANDES', 1),
                             ('MARQUESA LIMA', 2),
                             ('GEORGINA COTRIM', 3),
                             ('PAULITA FERREIRA', 4),
                             ('ICARO DIAS', 5);


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
INSERT INTO dados VALUES(300, 400, '202201GBI', 0);

DELIMITER $$  
CREATE PROCEDURE updateMedia()

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
END $$
DELIMITER ;