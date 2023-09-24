CREATE TABLE <nome-tabela> (
  <nome-coluna> <tipo-do-dado> [NOT NULL]
  PRIMARY KEY (nome-coluna-chave)
  FOREIGN KEY (nome-coluna-chave-estrangeira) 
  REFERENCES <nome-tabela-pai> (nome-coluna-chave-primária));