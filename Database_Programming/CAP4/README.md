Consultar todas as colunas de uma tabela, com o atributo %ROWTYPE
Cursor implícito - SQL%ROWCOUNT - Pegar informações por esse cursor implícito 
DECLARE 
CURSOR  cursor_emp IS 
SELECT deptno, SUM(sal)
FROM emp
GROUP by DEPTNO;
BEGIN 
OPEN cursor_emp;
END;
/

Quando o cursor é aberto que faz o select

CURSOR nome_cursor IS
       consulta;
FECTH - instrução utilizada para extrair dados de um conjunto ativo 

DECLARE
  emprec emp%ROWTYPE;   
  CURSOR cursor_emp IS 
         SELECT deptno, SUM(sal)             
          FROM emp        
        GROUP BY deptno;
BEGIN
   OPEN cursor_emp;
   LOOP
      FETCH cursor_emp INTO emprec.deptno, emprec.sal;
      EXIT WHEN cursor_emp%NOTFOUND;
      DBMS_OUTPUT.PUT_LINE ('Departamento: ' || emprec.deptno);
      DBMS_OUTPUT.PUT_LINE ('Salario     : ' || emprec.sal);
   END LOOP;
END;
/

DECLARE   
  CURSOR cursor_emp IS          
    SELECT deptno, SUM(sal) soma           
    FROM emp          
  GROUP BY deptno; 
BEGIN    
  FOR emprec IN cursor_emp LOOP        
    DBMS_OUTPUT.PUT_LINE ('Departamento: ' || emprec.deptno);       
    DBMS_OUTPUT.PUT_LINE ('Salario     : ' || emprec.soma);    
  END LOOP; 
END; 
/

FOR UPDATE

DECLARE
  emprec emp%ROWTYPE;   
  CURSOR cursor_emp IS 
         SELECT empno, sal             
          FROM emp
            FOR UPDATE; 
BEGIN
   OPEN cursor_emp;
   LOOP
      FETCH cursor_emp INTO emprec.empno, emprec.sal;
      EXIT WHEN cursor_emp%NOTFOUND;
      UPDATE emp SET sal = sal * 1.05 WHERE CURRENT OF cursor_emp;
   END LOOP;
   CLOSE cursor_emp;
END;
/