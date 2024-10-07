- Bugs funcionais: botão que deveria salvar os dados, mas não salva
- Bug de desempenho: Aplicaitvo que demora muito para carregar
- Bugs de interface: botão fora de lugar
- bugs de segurança- acecsso não autorizado a dados sensíveis
- bugs de compatibilidade: exemplo problemas no android e no IOS funciona corretamente
- Bugs de conectividadae: Exemplo integração com uma api de terceiros
- Bugs de dados: exemplo dados corrompidos durante gravação
- Bugs de lógica: exemplo cálculo matemático que retorna um resultado errado 
- bugs de usabilidade: navegação cconfusa
- bugs de instalação: problemas que afetam a instalação 
- bugs de integração: módulos funcionam bem de forma independente, mas falham quando integrados 

Testes de unidade: focado em métodos e funçõs individuais. Exemplo teste que ve se a função  somar 3+5 = 8
Teste de integração: Como módulos interagem- exemplo lista de tarefas - ve se a tarefa adicionada aparece na lista garantindo que o modulo adicinar e exibir funcionem bm juntos
Teste funcional - focam nos requisistos de negócios da aplicação - exemplo reserva de mesa, ver se uma confirmação foi enviada ao usuário.
Teste de regressão - ve se novas alterações no codigo introduziram novos defeitos nas parets já testadas.
Testde de desempenho0 como o sistema se comporta diante de diferentes cargas de trabalho
Teste de segurança- testes que simulam ataques para evitar vulnerabilidade
Teste exploratório - não segue um roteiro


1. Teste de Caixa Preta
O teste de caixa preta é uma técnica de teste de software focada em verificar as funcionalidades de um sistema, sem considerar o seu funcionamento interno ou o código-fonte. O testador se preocupa com as entradas e saídas do sistema, validando se o sistema faz o que é esperado, mas sem conhecer a lógica por trás.

Objetivo: Verificar se o software atende às suas especificações funcionais.
Exemplo: Se um formulário tem um campo de e-mail, o teste de caixa preta envolve testar diferentes formatos de e-mails válidos e inválidos para verificar se o sistema aceita os válidos e rejeita os inválidos, sem saber como o código por trás do campo foi escrito.
Vantagens:

Não requer conhecimento do código.
Focado na experiência do usuário final e no comportamento do sistema.
Desvantagens:

Não testa o código-fonte diretamente.
Pode não cobrir todas as possíveis falhas internas.
2. Teste de Caixa Branca
O teste de caixa branca (ou teste estrutural) é uma técnica de teste de software onde o testador tem conhecimento do código-fonte e foca em verificar o comportamento interno e a lógica do sistema. Aqui, o objetivo é garantir que as estruturas internas (como loops, condicionais e fluxos de dados) funcionem corretamente.

Objetivo: Validar o funcionamento interno do código, incluindo a lógica e a cobertura do fluxo.
Exemplo: Analisar o código de um algoritmo de ordenação e garantir que todos os caminhos possíveis (condicionais, loops) sejam cobertos e que o algoritmo funcione corretamente com diferentes tipos de dados.
Vantagens:

Garante maior cobertura de código.
Permite identificar falhas na lógica ou defeitos não visíveis em testes externos.
Desvantagens:

Requer conhecimento técnico profundo do código.
Pode ser mais demorado e complexo, especialmente em sistemas grandes.
3. Pirâmide de Testes
A Pirâmide de Testes é um conceito usado para representar o equilíbrio ideal entre diferentes tipos de testes em uma aplicação. Ela ajuda a definir a estratégia de testes, dividida em três níveis principais:

Testes Unitários (base da pirâmide): São muitos e rápidos, testam partes isoladas do código, como funções e métodos individuais. São a fundação da pirâmide, pois garantem que cada componente do sistema funcione corretamente de forma independente.

Testes de Integração (meio da pirâmide): Testam como diferentes componentes do sistema interagem entre si. Embora menos frequentes que os testes unitários, são importantes para garantir que os módulos funcionem corretamente quando combinados.

Testes de Interface (ou End-to-End) (topo da pirâmide): Testam o sistema como um todo, simulando o comportamento real do usuário. Esses testes são mais complexos e demorados, portanto, são realizados em menor quantidade.

Objetivo: Garantir um equilíbrio entre testes rápidos e frequentes (unitários) e testes mais complexos e demorados (integração e interface), reduzindo o custo de manutenção e tornando os testes mais eficientes.

Vantagens:

Estrutura de testes otimizada, com foco em qualidade e rapidez.
Reduz o custo de execução e manutenção de testes.
Desvantagens:

Exige planejamento e equilíbrio cuidadoso entre os tipos de testes.
Esses três conceitos são complementares: o teste de caixa preta foca no comportamento externo, o teste de caixa branca no funcionamento interno, e a pirâmide de testes em como estruturar a estratégia de testes em diferentes níveis de complexidade.
A aula aborda a importância da qualidade de software para atender às expectativas dos usuários e minimizar problemas como bugs e falhas de desempenho. Apresenta definições sobre qualidade de software, seus impactos em aplicativos e os tipos de testes necessários. Destaca duas normas principais: a ISO/IEC 25010:2011, que divide a qualidade em características como usabilidade e segurança, e a ISO/IEC 29119, focada nos processos de teste e documentação. A aula conclui enfatizando que investir em qualidade traz economias e benefícios a longo prazo, como redução de defeitos e aumento da satisfação do cliente.

A norma ISO/IEC 25010:2011 é fundamental para a avaliação da qualidade de produtos de software. Ela categoriza a qualidade em duas principais vertentes: qualidade em uso e qualidade do produto. Dentro da qualidade do produto, ela descreve características essenciais, que incluem:

1. **Adequação Funcional**: Refere-se às funcionalidades do software e se elas atendem às necessidades dos usuários.
2. **Desempenho**: Envolve a eficiência do software em termos de resposta e uso de recursos.
3. **Compatibilidade**: É a capacidade do software de funcionar em diferentes ambientes e interagir com outros sistemas.
4. **Usabilidade**: Diz respeito à facilidade de uso e acessibilidade do software para os usuários.
5. **Confiabilidade**: Relaciona-se à capacidade do software de manter seu desempenho sob certas condições e por um determinado período.
6. **Segurança**: Refere-se à proteção de dados e à capacidade do software de resistir a acessos não autorizados.
7. **Manutenibilidade**: Refere-se à facilidade com que o software pode ser mantido e atualizado.
8. **Portabilidade**: É a capacidade do software de ser transferido e utilizado em diferentes ambientes.

Essas características são essenciais para garantir que o software funcione de maneira eficiente e segura, satisfazendo as necessidades dos usuários.]


A norma ISO/IEC 29119 é voltada para os processos de teste de software, oferecendo diretrizes abrangentes desde o planejamento até a documentação dos testes. Ela é dividida em diferentes partes, que cobrem aspectos essenciais para a realização de testes eficazes. Aqui estão alguns dos principais pontos abordados pela norma:

1. **Planejamento de Testes**: Fornece orientações sobre como planejar testes, incluindo a definição de objetivos, recursos necessários e cronogramas.

2. **Desenvolvimento de Testes**: Trata da criação de casos de teste, métodos de teste e critérios de passagem/falha para avaliar a qualidade do software.

3. **Execução de Testes**: Apresenta diretrizes sobre como realizar os testes na prática, assegurando que os casos de teste sejam executados de forma controlada e eficiente.

4. **Avaliação de Testes**: Enfatiza a importância de avaliar os resultados dos testes para garantir que o software atenda aos requisitos e expectativas definidos.

5. **Documentação de Testes**: A norma orienta sobre a documentação adequada durante todo o processo de teste, o que é crucial para a rastreabilidade e para avaliações futuras.

Essas diretrizes ajudam a estruturar o processo de teste, tornando-o mais organizado e eficaz, e garantindo que as falhas sejam identificadas e tratadas de forma eficiente, contribuindo para a melhoria contínua da qualidade do software.