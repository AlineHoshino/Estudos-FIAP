Para inserirmos dados em uma tabela, utilizamos o comando INSERT. Sua
sintaxe é:
INSERT INTO <nome-tabela>
[(<nome-coluna>, [<nome-coluna>],...)]
VALUES
(<conteúdo>, [<conteúdo>], ...);


UPDATE <nome-tabela>
SET <nome-coluna> = <novo conteúdo para o campo>         
  [,<nome-coluna> = <novo conteúdo para o campo>]
[WHERE <condição>]


DELETE FROM  <nome-tabela>
	[WHERE <condição>]


o princípio ACID.

Atomicidade (Atomicity) – Atômico, tudo (commit) ou nada (rollback).
Consistência (Consistency) – Toda transação executada deve seguir as
regras de integridade do banco de dados, mantendo, assim, a consistência
da base de dados.
• Isolamento (Isolation) – Garante que nenhuma transação seja interferida
por outra até que a primeira seja completada.
• Durabilidade (Durability) – Garante que as informações gravadas no banco
de dados durem de forma imutável até que outra transação de atualização
ou remoção as afete.

Ao inserir linhas que contenham colunas que recebem valores de data,
normalmente utilizamos a função TO_DATE() para informar a data e o formato que
ela está sendo enviada ao SGBD e, assim, evitar problemas durante a gravação.

-- Inserindo DATA e números DECIMAIS
INSERT INTO T_SIP_FUNCIONARIO
( nr_matricula, cd_depto, nm_funcionario,
dt_nascimento, dt_admissao,
ds_endereco, vl_salario )
VALUES ( 1234, 1, 'ANA MARIA',
TO_DATE('10/02/1986','DD/MM/YYYY'),
TO_DATE('09/08/2010','DD/MM/YYYY'),
'R. DARIO PEREIRA, 23', 1234.56);