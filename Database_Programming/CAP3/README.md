Alteradno  a coluna de 18 caracterres para 30.
Tinha este comando 
TRUNCATE TABLE tabela1;

ALTER TABLE tabela1
MODIFY col1 VARCHAR2(30);

INSERT INTO tabela1
  VALUES ('Tamanho alterado para 30 bytes');

SET SERVEROUTPUT ON

DECLARE
  v_col1 VARCHAR2(18);
BEGIN
  SELECT col1 INTO v_col1
    FROM tabela1;
  DBMS_OUTPUT.PUT_LINE ('Valor = ' || v_col1);
END;
/

ORA-06502: PL/SQL: numeric or value error: character string buffer too small
ORA-06512: at line 

declarei uma variavel de tamanho 18 e tentei pegar um valor de tamanho 30 e colocar nessa variavel 
%TYPE

DECLARE
  v_col1 tabela1.col1%TYPE;
BEGIN
  SELECT col1 INTO v_col1
    FROM tabela1;
  DBMS_OUTPUT.PUT_LINE ('Valor = ' || v_col1);
END;
/

Pegue o tipo de dado que esta na tabela 1 e aplique nesta variavel

Condiicionais dentro do Pl/SQL
IF (condição) THEN
    conjunto de instruções;
END IF;

DECLARE
  v_col1    tabela1.col1%TYPE;   
  v_tamanho NUMBER(3); 
BEGIN   
  SELECT LENGTH(col1), col1 INTO v_tamanho, v_col1     
    FROM tabela1;   
  IF v_tamanho > 25 THEN      
    DBMS_OUTPUT.PUT_LINE ('Texto = ' || v_col1);
  ELSE
     DBMS_OUTPUT.PUT_LINE ('Texto menor ou igual a 25');
  END IF; 
END;
/

IF (condição1 ) THEN
          conjunto de instruções 1;
ELSIF (condição 2)
          conjunto de instruções  2 ;
...
ELSE
           conjunto de instruções n;
END IF;

Loop básico: LOOP END LOOP

DECLARE
  v_contador NUMBER(2) :=1; 
BEGIN   
  LOOP
    INSERT INTO tabela1
    VALUES ('Inserindo texto numero ' || v_contador);
    v_contador := v_contador + 1;   
  EXIT WHEN v_contador > 10;   
  END LOOP;
END;
/

LOOP FOR
BEGIN   
  FOR i IN 1..10 LOOP
    INSERT INTO tabela1
    VALUES ('Inserindo texto numero ' || i);
  END LOOP;
END;
/

LOOP WHILE

WHILE condição LOOP
  conjunto de instruções;
    . . .
END LOOP;


LOOP ANINHADO 

BEGIN   
  <<loopexterno>>
  FOR i IN 1..3 LOOP
    <<loopexterno>>   
    FOR j IN 1..5 LOOP
        INSERT INTO tabela1
        VALUES ('Inserindo texto numero ' || i || j);
    END LOOP loopexterno;
  END LOOP loopexterno;
END;
/