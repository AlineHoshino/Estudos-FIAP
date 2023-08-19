A Modelagem conecta os desenhos de classe com a programação.
Modelos de arquitetura:
Monolítica -  uma mesma classse de objeto acessando tudo.
UML - padrão internacional de representação
Relação unária - classe com ela mesma 
relação binária -entre duas classes
Relação pode ter seta ou não - da para por seta no rótulo
Relação forte - linha contínua - Existem ibjetos dos dois lados - Ex: Vaga existe não depende de ter um carro. O carro também existe independente um do outro  
Relação fracas - Objeto que depende de outro - Um objeto não existe sem o outro.

Filme existe, você existe , a relação com o ingresso do cinema é fraco - porque só existe quando você compra
Toda classe associativa tem uma relação fraca.
Como por a cardinalidade:

Se eu sou uma pessoa e estou olhando para os meus carros- eu posso ter 0, 1  ou muitos

Pessoa ________ Carro 
Se eu sou um carro e vejo uma pessoa, quantas eu vejo? Uma pessoa porque é a que está no documento do carro.
Losango na ponta da relação é composição ou agregação
Exemplo: Avião a jato, ele tem turbina e a turbina vai dentro dele => então é uma composição turbina é componente do jato. Losango do lado do cara que vai para dentro.
Cadeira de passageiro- Tem avião que não tem cadeira de passageiro => pode ter é agregação 
Cinema pode nao ter salas se for cinema drive-in. - Agregação(Pode ter sala ou não)
Cinema é composto por bilheteria.
Sala é composta de cadeiras - composição
Não existe sessão se não tem filme.
Filme se associa com uma sala - Crio uma sessão em sala
![MicrosoftTeams-image (1)](https://github.com/AlineHoshino/Estudos-FIAP/assets/83770726/0bdb3850-3a2c-4499-9579-6ff1ee0fe0d7)

Herança trazer características diferentes
Herança é como passar um DNA de uma classe mãe para um filho.
Herança:
Classe Pessoa - tem nome
Então pessoa Físca e Pessoa Jurídica recebe o nome da Pessoa.
Classes de Entidade = representam as coisas do mundo sobre as quais desejamos guardar informação.
Controle - bola com Loop - um o ou mais métodos que chama entidades e as DAOS
DAO: Data access object - objeto de acesso a dados
A fronteira trata a tela e os botões
Astah - é um CASE
CASE = Computer Aided Software Engineering - é uma abordagem que utiliza computadores para ajudar na criação de software. Ele oferece ferramentas e métodos que auxiliam os desenvolvedores de software em todas as etapas do processo de desenvolvimento, desde o planejamento e o design até a implementação e a manutenção.