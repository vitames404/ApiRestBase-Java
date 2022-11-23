INSERT INTO Filmes (id, titulo, ano) 
VALUES 
(1, 'Rambo', 1982),
(2, 'O Poderoso Chefão', 1972),
(3, 'Pulp Fiction', 1995),
(4, 'Rambo 2', 1985),
(5, 'Gente Grande', 2010),
(6, 'Superbad', 2007);

INSERT INTO Pessoas (id, nome, sexo, data_nasc) 
VALUES 
(1, 'Marlon Brando', 'Masculino', '01-01-1924'),
(2, 'Sylvester Stallone', 'Masculino', '01-01-1946'),
(3, 'Ted Kotcheff', 'Masculino', '01-01-1931'),
(4, 'Francis Ford Copolla', '01-01-1939'),
(5, 'Quentin Tarantino', '01-01-1963'),
(6, 'Samuel L. Jackson', '01-01-1948'),
(7, 'Adam Sandler', '01-01-1966'),
(8, 'Michael Cera', '01-01-1988');

INSERT INTO Tipos (id, descricao) 
VALUES 
(1, 'Atuação'),
(2, 'Direção');

INSERT INTO Creditos (pessoa_id, filme_id, tipo_id, personagem) 
VALUES 
(1, 2, 1, 'Vitor Corleone'),
(3, 1, 2, null),
(2, 1, 1, 'Rambo'),
(5, 3, 2, null),
(6, 3, 1, 'Jules Winnfield'),
(2, 4, 1, 'Rambo'),
(7, 5, 1, 'Lenny Feder'),
(8, 6, 1, 'Evan');

INSERT INTO Generos (id, descricao) 
VALUES (1, 'Açao'),
(2, 'Comédia'),
(3, 'Drama'),
(4, 'Terror');

INSERT INTO Genero_Filme (filme_id, genero_id) 
VALUES
(1, 1),
(2, 3),
(3, 3),
(4, 1),
(5, 2),
(6, 2);

INSERT INTO Linguas (filmes_id, lingua) 
VALUES (1, 'Inglês'),
(2, 'Inglês'),
(3, 'Inglês'),
(4, 'Inglês'),
(5, 'Português'),
(6, 'Português');
