CREATE TABLE Filmes
(
	id int NOT NULL,
	titulo varchar(200) NOT NULL,
	ano int NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE Pessoas
(
	id int NOT NULL,
	nome varchar(50) NOT NULL,
	sexo varchar(50) NOT NULL,
	data_nasc date,
	PRIMARY KEY (id)
);

CREATE TABLE Tipos
(
	id int NOT NULL,
	descricao varchar(200) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE Creditos
(
	pessoa_id int NOT NULL,
	filme_id int NOT NULL,
	tipo_id int NOT NULL,
	personagem varchar(50) NOT NULL,
	FOREIGN KEY (pessoa_id) REFERENCES pessoas (id),
	FOREIGN KEY (filme_id) REFERENCES filmes (id),
	FOREIGN KEY (tipo_id) REFERENCES tipos (id)
);

CREATE TABLE Generos
(
	id int NOT NULL,
	descricao varchar(200) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE Genero_Filme
(
	filme_id int NOT NULL,
	genero_id int NOT NULL,
	FOREIGN KEY (filme_id) REFERENCES filmes (id),
	FOREIGN KEY (genero_id) REFERENCES generos (id)
);

CREATE TABLE Linguas
(
	filme_id int NOT NULL,
	lingua varchar(50) NOT NULL,
	FOREIGN KEY (filme_id) REFERENCES filmes (id)
);
