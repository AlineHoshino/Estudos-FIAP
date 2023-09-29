• DDL (Data Definition Language) – Linguagem de Definição de Dados.
Utilizada para definir tabelas e elementos associados à estrutura dos dados.
• Exemplos: CREATE, DROP, ALTER, RENAME, TRUNCATE.
• DML (Data Manipulation Language) – Linguagem de Manipulação de
Dados.
• Utilizada para inserir, atualizar e excluir dados, ou seja, para modificar o
conteúdo das tabelas.
• Exemplos: INSERT, UPDATE, DELETE.
• DCL (Data Control Language) – Linguagem de Controle de Dados.
• Utilizada para controlar autorização de acesso a dados e operações.
• Exemplos: GRANT, REVOKE.
• DTL (Data Transaction Language) – Linguagem de Transação de Dados.
• Utilizada para controlar as transações de banco de dados, permitindo o
registro permanente das alterações ou desfazendo as alterações.
• Exemplos: COMMIT, ROLLBACK, SAVEPOINT.
• DQL (Data Query Language) – Linguagem de Consulta de Dados.
Também chamada de DRS (Data Retrieve Statement).
• Utilizada para especificar consultas, é composta de várias cláusulas e
opções, o que possibilita a elaboração de consultas simples a complexas.
• Exemplos: SELECT.


A restrição CHECK pode ser utilizada para validar o valor que será atribuído a
um campo. Um bom exemplo disso é a definição de um domínio, isto é, a definição de
valores possíveis para o conteúdo de uma coluna de acordo com as Regras do
Negócio.
Situação-problema 1: o campo sexo, utilizado para armazenar o gênero de
um funcionário, é um campo cujo domínio é conhecido e podemos definir um padrão
para o armazenamento dos dados e a validação da entrada. Por exemplo, f=feminino,
m=masculino e o=outro, utilizaremos a constraint check para indicarmos o domínio
dessa coluna.
CREATE TABLE T_SIP_FUNCIONARIO (...
sexo char(1) CHECK (UPPER(SEXO)= ‘M’ OR UPPER(SEXO) = ‘F’ OR
UPPER(SEXO) = ‘O’)


A partir da sintaxe básica, observamos que é possível executar as seguintes
ações:
• DROP COLUMN – Permite eliminar colunas de uma tabela.
• ADD – Permite adicionar colunas ou restrições a uma tabela existente.
• RENAME – Permite renomear a própria tabela, colunas e constraints.
• MODIFY – Permite modificar a estrutura das colunas, como um tipo de dado,
tamanho ou restrições.

-- VISUALIZAR CONSTRAINTS DE UMA TABELA ESPECÍFICA
SELECT TABLE_NAME, CONSTRAINT_NAME,
       CONSTRAINT_TYPE, SEARCH_CONDITION
  FROM ALL_CONSTRAINTS
 WHERE UPPER(TABLE_NAME)= 'T_SIP_FUNCIONARIO';

 Exemplo do comando DDL para criar a sequência de números inteiros que
serão utilizados na Chave Primária.
CREATE SEQUENCE SQ_AUTOR
INCREMENT BY 1
START WITH 1
MAXVALUE 999
NOCACHE
NOCYCLE;

Pagina 5 sobre o DDL- botao direito visualizar DDL