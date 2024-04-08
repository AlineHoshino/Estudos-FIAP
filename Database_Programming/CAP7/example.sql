CREATE OR REPLACE PROCEDURE incluir_dept
(p_cod  IN dept.deptno%TYPE DEFAULT '50',
 p_nome IN dept.dname%TYPE DEFAULT 'FIAP',
 p_loc  IN dept.loc%TYPE DEFAULT 'SP')
IS
BEGIN
  INSERT INTO dept(deptno, dname, loc)
  VALUES(p_cod, p_nome, p_loc);
END incluir_dept;
/

BEGIN
   incluir_dept (55, 'Onze', 'SC');
END;
/

BEGIN
   incluir_dept (p_cod => 60, p_nome => 'Doze', p_loc => 'RJ');
END;
/

BEGIN
   incluir_dept (65, p_nome => 'Treze');
END;
/