#CREATE DATABASE Funcionario;
USE Funcionario;
DROP TABLE Salarios CASCADE;
DROP TABLE Funcionarios CASCADE;
CREATE TABLE Funcionarios(
	nome VARCHAR(50) NOT NULL,
	CPF  VARCHAR(11) CHECK (LEN(CPF)=11),
    PRIMARY KEY (CPF)
);

CREATE TABLE Salarios(
	salario int NOT NULL,
	CPF  VARCHAR(11) CHECK (LEN(CPF)=11),
    foreign key (CPF) REFERENCES Funcionarios(CPF)
);

INSERT INTO Funcionarios values ('Joao'       ,'12345678910');
INSERT INTO Funcionarios values ('Paulo'      ,'12358778782');
INSERT INTO Funcionarios values ('Deodo'      ,'36546546564');
INSERT INTO Funcionarios values ('Oliveira'   ,'46546498788');

INSERT INTO Salarios values (120   ,'36546546564');
INSERT INTO Salarios values (150   ,'46546498788');
INSERT INTO Salarios values (200   ,'46546498788');
INSERT INTO Salarios values (300   ,'46546498788');

SELECT * FROM Funcionarios f INNER JOIN Salarios s on f.cpf = s.cpf;
SELECT * FROM Funcionarios f NATURAL JOIN Salarios s;
SELECT * FROM Funcionarios f LEFT JOIN Salarios s on f.cpf = s.cpf;
SELECT * FROM Funcionarios f RIGHT JOIN Salarios s on f.cpf = s.cpf;
