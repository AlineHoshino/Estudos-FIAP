Sitaxe da especificação do pacote:
CREATE [ OR REPLACE ] PACKAGE nome_pacote
{IS ou AS}

[ variáveis ]

[ especificação dos cursores ]

[ especificação dos módulos ]

END [nome_pacote ];

Sintaxe do corpo do pacote:


CREATE [ OR REPLACE ] PACKAGE BODY nome_pacote
{IS ou AS}

[ variáveis ]

[ especificação dos cursores ]

[ especificação dos módulos ]

  [BEGIN
     sequencia_de_comandos
   
  [EXCEPTION
     exceções ] ]

END [nome_pacote ];

Pacotes são áreas de armazenamentos dos procedimentos ou PROCEDURES, funções ou FUNCTIONS, constantes, variáveis e cursores em PL/SQL 