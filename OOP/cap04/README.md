Pública +
Privada - 
Protegida # - Viśivel para classes derivadas
DE pacote ~ - Classes no mesmo pacote

Em um diagrama de classe, 3 tipos de camadas:
Classe fronteira - comunicação do sistema com os atores
Classe controle - Interpreta os eventos ocorridos na fronteira e os direciona para a classe entidade
Classe entidade - Representa o domínio do negócio


Diagrama de classe resepresnta as classes que fazem parte do sistema, ou seja, a estrutura lógica- Visão estática.

Prespectivas de abstração do diagrama de classe:
- Classe de análise - Classes do mundo real e suas relações

- Classes de projeto - Representa as classes do funcionamento do sistema, é construído na fase de
projeto do desenvolvimento do sistema e tem como objetivo complementar o
Diagrama de Classe de Análise. Nesta fase, normalmente identificamos a
necessidade de criar outras classes, pois esse modelo relaciona a tecnologia utilizada e apresenta todas as camadas de funcionamento do sistema MVC (Model, View e
Controller) ou, simplificadamente, a camada de modelo, fronteira e controle.

- Classes de implementação- Padrão de desenvolvimento

Relacionamentos entre classes:

Associações - vínculos entre as classes
As associações possuem algumas características importantes: multiplicidade,
navegabilidade, papéis e nome da associação e direção de leitura.


Assim como na Composição, a Agregação é um relacionamento do tipo todo-
parte. Podemos dizer que a informação contida no objeto parte é complementar ao
objeto todo, não é essencial para constituir a informação relacionada ao conceito do
negócio do objeto todo.

Exemplo: Venda e desconto

Classe associativa - relacao muito para muitos 
exemplo- classe equipe - classe funcionário - classe associativa ingresso

Generalização - conhecida como herança- objeto geral(super classe) com um objeto específico.

Generalização - conhecida como herança- objeto geral(super classe) com um objeto específico.

Para construção de um diagrama de classe:
- Análise do caso de uso: . Os
casos de uso são utilizados no início do levantamento das classes, e observa-se quais
são os objetos utilizados para que o caso de uso produza um resultado, ou seja, são
verificados quais são os objetos envolvidos no processo da funcionalidade pretendida
para o sistema.
Classes - atributos, associações. Considerar fluxo principal, alternativo e de exceção 
- Análise de robustez: Objetos desenvolvidos por categoria(Fronteira, controle, entidade)
Um objeto de controle para cada caso de uso 

Técnica CRC - Classes, responsabilidades e colaboradores

IMPORTANTE - Passos para criar um diagrama de classe:

1º) Observar os casos de usos. 

2º) Verificar as regras de negócio e identificar 
relacionamentos.

3º) Levantar TODAS as classes possíveis.

4º) Atribuir as responsabilidades das classes que não precisam de outras. 

5º) Identificar as classes que precisam de colaboradores e quem são esses
colaboradores.

6º) Relacionar as classes conforme os conceitos de relacionamento que
abordamos anteriormente.

Modelo de dominio do sistema com ênfase nas classes de Entidade:
No astah, clicar em diagrama de classe, colocar o nome, depois clicar no canto direito em Steriotype - colocar entity 
Clicar em atributo definir se o atributo é privado, pode colocar o tamanho da string
Classe letra maiúscula, atributos em minúsculo
Clicar em operation para criar os métodos
Depois clicar na operação dentro da entidade para criar parametros, clique em Parameters, não precisa colocar se você está falando com a própria pessoa
Depois clicar em Base porque queremos saber o retorno desse método, coloco para retornar o Aluno
Depois cria as outras entidades e faz a ligação entre elas - clicando numa seta assim: __
depois clica no m no meio da seta e coloca as relações e é 1:1 1:N, etc

Diagrama de especificação:

Clica em boundary - fronteira 
Clica em control - Controle para gerar os controles

Quando se trabalha com entidades diferentes para mostrar a relação entre eles em vez de usar a seta de associação usa-se a seta de dependência representado assim: ->

Um mesmo controle compartilhado por mais de uma tela, duas telas usando um controle
