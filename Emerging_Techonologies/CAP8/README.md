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