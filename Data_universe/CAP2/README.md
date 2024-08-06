Os bancos relacionais conforme precisa de mais recurso precisa de um computador mais potente
NOSQL - não precisa scalar a máquina, adiiciona maquinas em paralelo e trabalha de forma horizontal, consegue trabalhar com mais volumes de dados
Teorema CAP - quais bancos funcionam melhor para determinadas soluções- consistencia, tolerancia a particionamento e disponibilidade
Chvae - valor - preformance excepcional para consulta de dados simples - geralmente ele fica me memoria, utilizado em cache
Colunar - valores agregados em colunas, ajuda na agregação - Cassandra - liguagem CQL - não faz joins
Grafo - orientado para enconyrar relacionamentos - relacionamento entre clientes
Orientado a documentos - estrutura dos dados pode ser mais complexas.Não precisa ser com a chave primária a busca. MongoDb - exemplo 

BASE - Basically Available, Soft State, Eventual Consistency

Nesta aula, foi introduzido o conceito de NoSQL (Not only SQL ou não somente SQL), que é uma nova geração de bancos de dados. NoSQL surgiu para lidar com a necessidade de armazenar diferentes tipos de dados semiestruturados ou não-estruturados, em grandes volumes e com alta disponibilidade.
Foram discutidos os desafios enfrentados na área de armazenamento de informações e a comparação entre o modelo de banco de dados relacional e o NoSQL. Destacou-se que o modelo relacional não é tão eficiente quanto o NoSQL para lidar com uma grande variedade e volume de dados distribuídos em clusters de servidores.
Foi apresentado o histórico do termo NoSQL e suas principais diferenças em relação ao SQL. Os bancos NoSQL não utilizam a linguagem SQL e possuem suas próprias linguagens de consulta. A maioria deles é composta por projetos de código aberto.
As características do NoSQL, como a ausência de um esquema fixo (schemaless) e a independência de linguagens, foram abordadas. A funcionalidade determina a escolha do banco de dados NoSQL, pois cada tipo é mais indicado para resolver problemas específicos.
Foram apresentados os principais tipos de bancos de dados NoSQL, como chave-valor, colunares, orientados a grafos e orientados a documentos. Cada um é indicado para diferentes tipos de dados e necessidades específicas.
