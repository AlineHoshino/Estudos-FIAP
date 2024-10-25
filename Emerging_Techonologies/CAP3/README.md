Modelos de estimativa de software

Estimativa - o que fa um projeto de software ser mais  fácil ou difícil, mais longo ou mais curto?

Leva em conta: equipe do projeto, processos de produção, infraestrutura disponível, equipe de projeto, escopo do produto, características de uso e do usuário.

Passos para estimar:
- Identifique o tamanho do projeto em termos de funções e dados
- Atribua um esforço relativo a cada função a ser tarbalhada
- Ajuste o esforço em função da qualdiade da sua equipe, das ferrmentas e das caracterísitcas do cliente e da infraestrutura disponível
- Ao final , o esforço deve ser convertido em horas de trabalho e custo 


Método de estimativa de pontuação por julgamento simples:

Planning Poker- Tem o backlog pessoas julgam, usam a seuqencia de fibonacci, temos o ? - avaliadro não se sente confortável para julgar um item. Voto é secreto e só depois todos mostram juntos.Se houver consenso tudo certo, senão o avaliador com a maior nota e o de menor nota fazem uma sessão de explicação. Faz a reavaliação de novo.

Métrica de estimativa - function point analysis- - APF ou FPA - aqui usa cálculos baseados em tabelas de referência

Claro, vou te explicar a Análise de Pontos de Função (Function Point Analysis - FPA) de uma maneira detalhada e simples!

### O Que É a Análise de Pontos de Função?

A Análise de Pontos de Função é um método usado para medir a funcionalidade de um sistema de software com base em seus requisitos. É uma técnica que ajuda a estimar o esforço e o custo de desenvolvimento de software, considerando aspectos tanto funcionais quanto não funcionais.

### Como Funciona a Análise de Pontos de Função?

A FPA envolve algumas etapas principais:

1. **Identificação de Componentes Funcionais**:
   - **Entradas (Inputs)**: Dados que são fornecidos ao sistema (ex.: formulários de cadastro).
   - **Saídas (Outputs)**: Informações que saem do sistema (ex.: relatórios gerados).
   - **Consultas (Inquiries)**: Perguntas feitas ao sistema que retornam dados (ex.: buscas em banco de dados).

2. **Avaliação de Arquivos**:
   - **Arquivos Lógicos Internos**: São dados gerenciados dentro do sistema (ex.: tabelas em um banco de dados).
   - **Arquivos de Interface Externa**: Dados de sistemas externos que o sistema interage (ex.: APIs de terceiros).

3. **Classificação da Complexidade**:
   - Cada um desses componentes é classificado em categorias de complexidade (baixa, média, alta). Isso ajuda a determinar quantos pontos de função cada componente vale.

4. **Aplicação de Tabelas de Ponderação**:
   - São utilizadas tabelas que atribuem valores a cada tipo de componente com base em sua complexidade. Por exemplo:
     - Uma entrada simples pode valer 4 pontos, enquanto uma complexa pode valer 6 pontos.
     
5. **Cálculo dos Pontos de Função Não Ajustados**:
   - Após identificar e classificar todos os componentes, somamos os pontos para obter o total de Pontos de Função Não Ajustados.

6. **Fatores de Ajuste**:
   - A FPA também considera fatores que podem afetar o ambiente de desenvolvimento, como a experiência da equipe ou a complexidade do software. Esses fatores são usados para ajustar os pontos, resultando nos Pontos de Função Ajustados.

   FPA auxilia nos seguintes aspectos: 
- estima casos de teste
 - compreende impactos de um aumento de escopo
 - auxilia em negociações contratuais envolvendo software
 - fornce subsídios para estimativas futuras(base historica)
 - apoia atividades de melhoria contínua de software
### Exemplo Simples

Vamos imaginar um sistema simples de cadastro de usuários:

- **Entradas**: 1 formulário de cadastro (4 pontos).
- **Saídas**: 1 relatório de listagem de usuários (5 pontos).
- **Consultas**: 1 busca de usuário (4 pontos).
- **Arquivos**: 1 tabela de usuários (7 pontos).

**Total de Pontos de Função Não Ajustados**:
- Entradas: 4
- Saídas: 5
- Consultas: 4
- Arquivos: 7
- **Total**: 4 + 5 + 4 + 7 = 20 pontos.

Depois, você aplicaria os fatores de ajuste com uma fórmula para chegar aos Pontos de Função Ajustados.

### Conclusão

A Análise de Pontos de Função é uma técnica valiosa, pois fornece uma maneira estruturada de medir a funcionalidade do software. Isso ajuda na previsão de tempo, esforço e custo, permitindo que as equipes planejem melhor seus projetos. Se precisar de mais alguma informação ou tiver mais questões, estou aqui para ajudar!

Os 14 fatores de influência não funcionais na Análise de Pontos de Função (APF):

- teleprocessamento : - aplicação necessita de comunicação remota por rede?
- Processamento distribuído: existirá ais de um computador processando os dados?
- performance - tempo de resposta é crítico?
- carga da maquina - uso do processador será intenso?
- volume de transações: quantidade de usuarios e transações será grande?
- entrada de dados online- precisa de um front-end?
- Atualizações online - atualização precisa ser online  síncrona?
- eficiencia usuário final - usuário vai precisar de treinamento?
- complexidade de processaamento - cálculos são complexos?
- reutilização de código- o código visa o reuso?
- faciidaed de implantação- vai precisar de recurso especial?
-facilidaed de operação
- facilidade de manutenção
- operação em múltiplos locais

Esses fatores recebem nota de 0 a 5 


Use case points:


 Vamos entender o conceito de Use Case Points (UCP) de forma detalhada e simples.

### O Que São Use Case Points? Necessário ter sido descrito com diagramas de Casos de Uso UML

Use Case Points (UCP) são uma técnica de estimativa de esforço e custo em projetos de software, focando em funções que o sistema deve desempenhar, descritas através de Casos de Uso. Os Casos de Uso ajudam a descrever interações entre usuários (atores) e o sistema, facilitando a compreensão dos requisitos.

### Como Funciona o UCP?

O processo de estimativa usando UCP envolve duas etapas principais:

1. **Cálculo do UUCP (Use Case Points Não Ajustados)**
2. **Ajustes do UUCP para obter UCP Ajustados**

### Etapa 1: Cálculo do UUCP

A primeira etapa é identificar e classificar os Casos de Uso. Aqui estão os passos:

1. **Identificação dos Casos de Uso**:
   - Liste todos os Casos de Uso relevantes para o sistema.

2. **Classificação dos Casos de Uso**:
   - Cada Caso de Uso é classificado em três categorias de complexidade: **Simples**, **Médio** e **Complexo**. Cada categoria atribui uma quantidade específica de pontos. Por exemplo:
     - Simples: 5 pontos
     - Médio: 10 pontos
     - Complexo: 15 pontos

3. **Cálculo do Total de UUCP**:
   - Some os pontos dos Casos de Uso classificados para obter o valor total de UUCP.

### Etapa 2: Ajustes no UUCP

Após calcular os UUCP, ajustamos com base em fatores técnicos e ambientais. Os passos são:

1. **Identificação dos Fatores de Ajuste**:
   - Considere fatores que afetam o desenvolvimento, como experiência da equipe, tecnologias utilizadas, complexidade do projeto, entre outros. Existem 13 fatores que podem ser identificados e classificados.

2. **Cálculo do Fator Total**:
   - Atribua um peso a cada fator identificado, e some para obter um **Fator Total**.

3. **Cálculo do UCP Ajustado**:
   - A fórmula para obter o UCP Ajustado é:
   \[
   \text{UCP Ajustado} = \text{UUCP} \times (0,65 + 0,01 \times \text{Fator Total})
   \]

### Exemplo Prático

Vamos considerar um exemplo simples:

- Casos de Uso:
  - 3 Simples (3 x 5 = 15 pontos)
  - 2 Médios (2 x 10 = 20 pontos)
  - 1 Complexo (1 x 15 = 15 pontos)

**Total de UUCP**: 
- 15 + 20 + 15 = 50 pontos.

**Fatores de Ajuste**:
- Se o Fator Total for, digamos, 10, então:

**Cálculo do UCP Ajustado**:
\[
\text{UCP Ajustado} = 50 \times (0,65 + 0,01 \times 10) = 50 \times 0,75 = 37,5
\]
Assim, a estimativa do esforço e custo do projeto pode ser baseada no UCP Ajustado.

### Conclusão

O Use Case Points são uma maneira eficaz de estimar o esforço de desenvolvimento de software, proporcionando uma abordagem sistemática que favorece a compreensão dos requisitos. Se precisar de mais esclarecimentos ou se tiver outras perguntas, estou aqui para ajudar!