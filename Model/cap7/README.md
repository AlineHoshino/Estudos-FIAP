SELECT * FROM T_SIP_FUNCIONARIO;

SELECT NR_MATRICULA ,
       CD_DEPTO     ,
       DT_ADMISSAO  ,
       VL_SALARIO
       FROM T_SIP_FUNCIONARIO;


SELECT 	DISTINCT CD_DEPTO 
       FROM 	T_SIP_FUNCIONARIO;


-- Exemplo de filtro com números
SELECT 	NR_MATRICULA   ,
              NM_FUNCIONARIO ,
              VL_SALARIO
       FROM 	T_SIP_FUNCIONARIO
       WHERE   VL_SALARIO > 1500.50 ;


-- EXIBIR O TEXTO: "O FUNCIONARIO <NOME> FOI 
       ADMITIDO EM <DATA ADMISSAO>"
SELECT    NR_MATRICULA         ,
              'O FUNCIONARIO '       || 
                     NM_NOME               || 
              ',  FOI ADMITIDO EM  ' || 
              DT_ADMISSAO       
FROM     T_SIP_FUNCIONARIO;


Todas as tabelas possuem a pseudocoluna ROWNUN, utilizada quando
precisamos limitar a quantidade de linhas retornadas por meio de um comando
SELECT. Podemos usá-la, por exemplo, para recuperar certo número de linhas por
vez para auxiliar a paginação em uma página WEB.
Semelhante ao LIMIT
