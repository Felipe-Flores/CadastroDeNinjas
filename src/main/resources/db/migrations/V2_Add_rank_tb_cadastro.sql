-- Mogrations para adicionar a coluna de rank na tablela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);