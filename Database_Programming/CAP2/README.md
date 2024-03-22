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


Variável escalar - armazena um único valor
compostos - registro, tabelas e matrizes
referenciais - designam outros itens de programa. Exemplo: REF CURSOR
LOB: Bloco de dados não estruturado - texto, imagem gráfica até 4gb


SET SERVEROUTPUT ON - LIGA O OUTPUT
DECLARE
 v_teste VARCHAR2(30):='HELLO, WORLD';
DBMS_OUTPUT.PUT_LINE(v)


SET SERVEROUTPUT ON
DECLARE    
  v_soma_sal   NUMBER; 
  v_deptno	 NUMBER NOT NULL := 10;           
BEGIN
  SELECT	SUM(sal)  
  INTO		v_soma_sal
  FROM		emp
  WHERE	deptno = v_deptno;
DBMS_OUTPUT.PUT_LINE(‘A soma dos salários do departamento ‘ || v_deptno || ‘ é ‘ || v_soma_sal);
END;
/

|| usando o pipe para concatenar

DECLARE
v_empno NUMBER := 11;
v_ename VARCHAR2(13) := 'SANDRA';
v_job VARCHAR2(13) := 'GERENTE';
v_deptno NUMBER := 10;
BEGIN
   INSERT INTO emp(empno, ename, job, deptno)
          VALUES (v_empno, v_ename, v_job, v_deptno);
END;
/


update:

DECLARE
	v_sal_increase   NUMBER := 2000;
BEGIN
	UPDATE	emp
	SET		sal = sal + v_sal_increase
	WHERE	job = 'ANALYST';
END;
/

Instrução delete:

DECLARE
	v_deptno   NUMBER := 10;               
BEGIN							
	DELETE FROM   emp
	WHERE         deptno = v_deptno;
END;
/

Controle transacional: Confirmar uma sequencia de procedimentos
COMMIT -para confirmar os procedimentos
ROLLBACK- voltar atrás

BEGIN
	INSERT INTO dept VALUES ('A','A','A');
	COMMIT;
EXCEPTION
	WHEN OTHERS THEN ROLLBACK;
END;
/