Inteligencia artifical agrupada em 4 classes:
- Sistemas que pensam e agem como humanos
- Sistemas que agem como humanos
- Sistemas que pensame e agem de acordo com a lógica formal 
- Sistemas que agem de acordo com a lógica formal 


### Resumo da Aula sobre Machine Learning e Inteligência Artificial

**1. Introdução à IA**
- A Inteligência Artificial busca simular aspectos da inteligência humana.
- Classificações: sistemas que pensam e agem como humanos, e sistemas que operam com lógica formal.

**2. História da IA**
- Surgiu em 1956, com discussões na Dartmouth College.
- Evoluções de projetos como o chatbot Eliza até o Deep Blue, que venceu um campeão de xadrez.
- Tipos de IA: IA Fraca (ANI), IA Forte (AGI) e Superinteligência (ASI).

**3. Fundamentos de Machine Learning (ML)**
- Subcampo da IA que permite aprendizado a partir de dados.
- Arthur Samuel: &quot;campo que permite que máquinas aprendam sem programação explícita.&quot;
- Etapas de implementação incluem pré-processamento de dados.

**4. Tipos de Aprendizado em ML**
- **Supervisionado**: usa dados rotulados (classificação e regressão).
- **Não Supervisionado**: busca padrões em dados não rotulados (clusterização).
- **Por Reforço**: agente aprende interagindo com o ambiente.

**5. Machine Learning com Python**
- Linguagem popular para ML, com bibliotecas como Scikit-learn, TensorFlow e PyTorch.

**6. Modelos de Aprendizagem**
- **Regressão**: prever valores contínuos (linear e polinomial).
- **Classificação (KNN)**: classifica com base na proximidade de dados.
- **Clusterização (K-Means)**: agrupa dados pela similaridade.

**7. Desafios em ML**
- **Divisão de Dados**: separação em treino e teste para evitar overfitting.
- **Overfitting/Underfitting**: problemas em aprender os dados corretamente.
- **Regularização**: técnicas para reduzir overfitting (L1, L2, Elastic Net).
- **Maldição da Dimensionalidade**: desafios com alta dimensionalidade em dados.

**8. Jornada da Descoberta de Conhecimento**
- Processos de seleção e transformação de dados, modelagem e análise dos resultados.

**9. Considerações Finais**
- Modelo eficaz necessita compreensão das etapas de análise, treinamento e interpretação dos dados.

Historia da inteligencia artificial

discussões sobre ia iniciaram em 1856. Em 1965 surgiu o 1 chatbot Eliza. Em 1970 e 1980 surgiu o CYC (enciclopédia
Em 1997 - Deep Blue ganhou no xadrez contra o Garry kasparov.

Machine Leaning : fundamentos e aplicações:

Os dados que pegamos são boas fontes de coletas? Minha base de dados tem outliers? Tem dados preenchidos de forma equivocadas?
Precisa ter variabilidade. Se tiver dados duplicados pode ter ruídos.
Limpeza de dados: Remoção de duplicatas, tartamento de valores ausentes,  correção de erros.
Transformação de dados:
Normalização, padronização , codificação one-hot- converte variaveis categoricas em um formato binario
Redução de dimensionalidae - nem todos os atributos são uteis.
Seleção de tributos - escolha de variaveis relevantes

Tipos de aprendizado:

- **Supervisionado**: Vou vendo a pergunta e a resposta várias vezes. Exemplo: Mostro muitas fotos minhas, eu coloco um rótulo escrito meu nome. Vai associar com o label. Depois mostro várias fotos do José e escrevo que é o José.
* Essa técnica chamamos de classificação.
- **Não Supervisionado**: Nesse tipo de dados só tem as entradas, não tem os rótulos, é como se tirasse a etiqueta com meu nome. A máquina olha as imganes minha e olha as do José e vi perceber que é mais similar as minhas imagens que as do José. Então começa a construir clusters- Esse é o google photos se voce clica no rosto da foto aparece as outras fotos que tem o rosto parecido. 
* Isso também funciona no streaming, o algoritmo não sabe quem é você, mas percebe que outras pessoas tambem assistiram aquela serie e por similaridade ele conegue te indicar outras séries parecidas.
* Isso tambem acontece no reels.
* Tanto o aprendizado supervisionado quanto o não supervisionado trabalham com a base histórica dos dados.
- **Por Reforço**: Não tem mais dados - não tem fonte para consultar - enquanto interage com o ambiente vai aprendendo. exemplo quando voce tem um cachorrinho filhote e manda ele pegar a bolinha, ele não tem nenhum conhecimento previo disso, mas depois de dar comida quando da certo, ele aprende.
Isso é usado em jogos, bom para exemplos dificeis e complexos, exemplo fazer um foguete dar ré- dificil ter dados- por isso usa o aprendizado por reforço,então usa simuladores- E vejo qual simulador teve a melhor recompensa.O carro da  Tesla está aprendendo com as regras do jogo.

Qual vai ser a temperatura amanhã?

Regressão polinomial trabalha com polinômios de grau n - x³

Prestar atenção nas métricas

KNN - faz o calculo para os vizinhos proximos, exemplo tem pontos azuis do lado direito e pontos vermelhos do lado esquerdo e surge um ponot verde perto dos pontos vermelhos por intuição aachamos que o verde está mais próximo do vermelho. 
Métricas de classificação :
 - acurácia - taxa de acerto
 - F1 score - 0 e 1 
 - precisão e recall
 -matriz de confusão


Não supervisionado - Técnica K-means

Desafios em machine learning: Divisao de dados

1 - A técnica de estratificação em machine learning é usada para garantir que as classes (ou categorias) estejam distribuídas de maneira equilibrada entre os conjuntos de treino e teste. Quando você usa estratificação, divide os dados em subconjuntos mantendo a mesma proporção de classes em cada um.

Imagine que você está classificando imagens de gatos e cachorros, e seu conjunto de dados tem 70% de gatos e 30% de cachorros. Ao dividir seus dados em treino e teste, a estratificação ajuda a garantir que ambas as partes mantêm essa proporção de 70/30. Sem estratificação, você corre o risco de acabar com conjuntos de dados que podem estar desequilibrados, o que pode afetar a precisão do seu modelo.

Exemplo prático
Se você tem 100 imagens, sendo 70 de gatos e 30 de cachorros, uma divisão 80/20 com estratificação resulta em:

Conjunto de treino: 56 gatos e 24 cachorros.
Conjunto de teste: 14 gatos e 6 cachorros.
Assim, seu modelo terá uma visão representativa do problema tanto no treino quanto no teste, levando a uma melhor generalização dos resultados.

2- O cross-validation (ou validação cruzada) é uma técnica para avaliar a performance de um modelo de machine learning de forma mais confiável. Em vez de treinar o modelo apenas uma vez em um conjunto de treino e testá-lo em um único conjunto de teste, o cross-validation divide os dados várias vezes para testar o modelo em diferentes partes do conjunto de dados, permitindo uma avaliação mais robusta.

Exemplo prático
Se você tem um dataset pequeno com 100 exemplos e usa uma 5-fold cross-validation:

Cada fold terá 20 exemplos.
O modelo será treinado em 80 exemplos e testado em 20 exemplos cinco vezes, mudando o fold de teste a cada rodada.
Ao final, você terá 5 resultados de desempenho que são então promediados para uma avaliação mais confiável do modelo.