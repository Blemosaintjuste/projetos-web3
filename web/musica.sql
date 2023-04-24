/* musica_logico: */

CREATE TABLE Artistas (
    cod_artista INT PRIMARY KEY,
    nome VARCHAR(50),
    cod_genero INT,
    nacionalidade VARCHAR,
    solo TINYINT(1)
);

CREATE TABLE Albuns (
    cod_album INT PRIMARY KEY,
    lancamento INT(5),
    nome TEXT,
    gravadora VARCHAR(20),
    faixas INT,
    cod_Artista INT
);

CREATE TABLE genero (
    cod_genero INT NOT NULL PRIMARY KEY,
    genero VARCHAR(20)
);
 
ALTER TABLE Artistas ADD CONSTRAINT FK_Artistas_2
    FOREIGN KEY (cod_genero)
    REFERENCES genero (cod_genero)
    ON DELETE NO ACTION;
 
ALTER TABLE Albuns ADD CONSTRAINT FK_Albuns_2
    FOREIGN KEY (cod_Artista)
    REFERENCES Artistas (cod_artista)
    ON DELETE RESTRICT;