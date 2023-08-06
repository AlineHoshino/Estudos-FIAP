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