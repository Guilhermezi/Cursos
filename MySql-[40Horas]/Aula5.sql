-- Seleciona o banco de dados que será utilizado
USE cadastro;

-- Cria a tabela 'pessoas'
CREATE TABLE pessoas (
	-- ID único para cada pessoa (incrementa automaticamente)
	id INT NOT NULL AUTO_INCREMENT,
    
    -- Nome obrigatório com no máximo 30 caracteres
    nome VARCHAR(30) NOT NULL,
    
    -- Data de nascimento da pessoa
    nascimento DATE,
    
    -- Sexo, aceitando apenas M ou F
    sexo ENUM('M', 'F'),
    
    -- Peso com até 5 dígitos no total e 2 casas decimais
    peso DECIMAL(5,2),
    
    -- Altura com até 3 dígitos no total e 2 casas decimais
    altura DECIMAL(3,2),
    
    -- Nacionalidade com valor padrão Brasil caso não seja informada
    nacionalidade VARCHAR(20) DEFAULT 'Brasil',
    
    -- Define o ID como chave primária
    PRIMARY KEY (id)

) DEFAULT CHARSET = utf8;

-- Mostra todos os bancos de dados existentes
SHOW DATABASES;

-- Insere uma pessoa especificando os campos manualmente
INSERT INTO pessoas
(id, nome, nascimento, sexo, peso, altura, nacionalidade)
VALUES
(DEFAULT, 'Derik', '2010-10-16', 'M', '12.0', '2.90', 'Australiano');

-- Exibe todos os registros da tabela pessoas
SELECT * FROM pessoas;

-- Insere múltiplos registros de uma só vez
INSERT INTO pessoas VALUES
(DEFAULT, 'Coringa', '1980-04-05', 'M', '30.9', '1.80', 'EUA'),

-- Aqui a nacionalidade usa o valor padrão (Brasil)
(DEFAULT, 'Marcos', '2015-05-12', 'M', '60.4', '1.50', DEFAULT),

(DEFAULT, 'Janaína', '2008-02-19', 'F', '60.7', '1.20', 'UK');