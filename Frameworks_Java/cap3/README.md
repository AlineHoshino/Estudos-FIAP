Aplicação monolítica, não tinha flexibilidade para mexer num pedaço da aplicação.
Web services - 2 aplicações - front end e o backend - mexendo nos dados.
Web service utiliza protocolos que permitem a comunicação entre diversos sistemas através ded rede local ou internet.
Rest - Representational state transfer - transferir dados do cliente para servidor
Glória do Rest - todos os verbos http de forma correta, links para páginas seguintes, total de itens
Modelo de Maturidade de Richardson

Nível 0 – Conhecido como o Pântano de XML (Extensible Markup Language).
Neste nível, o desenvolvedor não utiliza os verbos HTTP corretamente, assim como
tornar apenas um endpoint responsável por várias funcionalidades, tais como inserir
e consultar alunos. Geralmente utiliza XML para representar os objetos.
Nível 1 – Conhecido como Recursos, onde busca-se a utilização de um
endpoint para cada funcionalidade, mas ainda não se aplicam os verbos HTTP
corretamente. Geralmente são utilizados apenas os verbos GET e POST

Nível 2 – Chamado de Verbos HTTP, pois considera o uso eficiente dos
endpoints (nível 1) e dos verbos HTTP (nível 2). Neste nível também se considera o
retorno correto dos status codes de cada endpoint.
Nível 3 – Neste nível, conhecido como Controle de Hipermídia, além de
aplicar o nível 1 e 2, haverá algo novo, que fornece aos clientes os links para a
navegação entre os recursos da API. Por exemplo, em uma consulta com paginação,
o resultado atual poderá conter o link para as páginas anterior e seguinte, além de
dados como quantidade de páginas, recursos etc.

Headers - variáveis que vão informar que só aceita arquivos html
pode colocar um cabeçalho de autorização. E coloca o token de autenticação.

Spring boot - framewor mais utilizado. Construção das urls das apis

start.spring.io

Todo browse web ouve na prota 80. A da tomcat por padrão é 8080.
Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

Wed May 01 17:43:37 BRT 2024
There was an unexpected error (type=Not Found, status=404).