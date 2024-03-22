Procedimentos dentro do servidor de banco de dados
DROP TABLE dept PURGE;
DROP TABLE emp PURGE;

DECLARE(opcional)
Aqui definimos variaveis e outras estruturas que veremos
BEGIN (obrigatório)
-- Aqui usamos instruções SQL e PL/SQL
EXCEPTION(opcional)
-- Ações que serão tomadas se ocorrer algo
END;(obrigatório)
Variavel composta - mais de um valor
variavel escalável - só um valor
v_ => convenção para variavel 

DECLARE 
		v_variavel varchar2(5);
BEGIN 
		Select  nome_coluna
	into v_variavel
		from nome_tabela;
EXCEPTION 
		When exception_name then
END; 
/

v_data DATE := SYSDATE +7 - nessa variável fica uma data de 7 dias depois 
c_const CONSTANT NUMBER := 54;