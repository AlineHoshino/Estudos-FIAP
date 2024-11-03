

### Resumo da Aula sobre IoT e Soluções Corporativas

1. **Introdução à IoT**:
   - A Internet das Coisas (IoT) envolve o entendimento de dispositivos inteligentes e infraestrutura de dados.
   - Começar com soluções simples, como Arduino, e evoluir para plataformas corporativas que garantam segurança e escalabilidade é recomendado.

2. **Indicadores Essenciais para Plataformas IoT**:
   - **Suporte a aplicações**: Permite customização.
   - **Consolidação de dados**: Gerenciamento e análise eficiente.
   - **Gerenciamento de conectividade**: Integração automática de sistemas e dispositivos.

3. **Critérios para Seleção da Plataforma**:
   - **Compatibilidade** com sistemas existentes.
   - **Largura de Banda** necessária para comunicação eficiente.
   - **Parcerias** estratégicas associadas à plataforma.
   - **Ferramentas Analíticas** para transformação de dados em insights.
   - **Customização e Segurança** efetivas.

4. **Exemplos de Soluções Corporativas em IoT**:
   - **Dojot**, **HPE Universal IoT Platform**, **Siemens MindSphere**, **Amazon AWS IoT**, **Samsung ARTIK**: Diversas plataformas com diferentes focos e capacidades.

5. **Segurança em Aplicações IoT**:
   - A segurança é crucial devido ao aumento de interconectividade e riscos de ciberataques.
   - **Desafios**: Dispositivos expostos e ataques DDoS.
   - Importância da gerenciamento seguro de APIs e autenticação.

6. **Estratégias e Boas Práticas de Segurança**:
   - **Avaliação de Risco** e **Proteção de Dados** com criptografia.
   - **Uso de Senhas Fortes**, controle de atualizações e monitoramento contínuo.

7. **Conclusão**:
   - A escolha da plataforma ideal depende das necessidades do cliente, destacando a importância da adaptação rápida às tecnologias, segurança, escalabilidade e personalização.

Esse resumo captura os principais pontos discutidos na aula sobre IoT e suas aplicações em ambientes corporativos. Se precisar de mais ajuda com algo específico, fique à vontade para perguntar!

EXEMPLOS DE SOLUÇÕES CORPORATIVAS:

Mcrosoft IOT hub - Azure IoT - ferramentas voltadas para internet das coisas 
Plataforma Dojot open source

A **HPE Universal IoT Platform** é uma solução modular e escalável que se destaca por oferecer:

- **Independência de Fornecedores**: Permite integração com diversas tecnologias sem a dependência de um único fornecedor.
- **Segurança Incorporada**: Recursos de segurança são integrados à plataforma, garantindo proteção dos dados e dispositivos conectados.
- **Suporte a Ambientes Locais ou em Nuvem**: Flexibilidade para operar em diferentes ambientes, conforme as necessidades do cliente.
- **Facilidade de Escalabilidade**: A plataforma é projetada para crescer à medida que os requisitos do negócio se expandem.

Essas características fazem da HPE Universal IoT Platform uma escolha robusta para empresas que buscam implementar soluções de IoT de forma segura e eficiente.

O **Siemens MindSphere** é uma plataforma IoT que foca em conectar aplicações industriais. Suas principais características incluem:

- **Sistema Operacional Aberto**: Permite a integração de várias aplicações, proporcionando flexibilidade no uso de diferentes tecnologias.
- **Interoperabilidade**: Focado em facilitar a comunicação entre dispositivos e sistemas de diferentes fabricantes.
- **Rede de Parceiros**: Oferece suporte a um amplo ecossistema de parceiros, possibilitando a criação de soluções colaborativas.
- **Análise de Dados**: Ferramentas integradas para a extração de insights a partir dos dados coletados, melhorando a eficiência operacional.

Essas funcionalidades tornam o Siemens MindSphere uma escolha forte para indústrias que desejam adotar soluções de IoT de forma eficaz e aproveitar o potencial da análise de dados em suas operações. 

Amazon AWS IOT - disponibiliza autenticação e criptografia nos diferenets pontos de conexão

O **Amazon AWS IoT** é uma plataforma que conecta e gerencia dispositivos em um ecossistema IoT. Suas principais características incluem:

- **Conexão de Dispositivos**: Permite a integração de diversos dispositivos, facilitando a comunicação entre eles.
- **Gerenciamento de Dispositivos**: Oferece ferramentas para controlar e monitorar os dispositivos conectados.
- **Autenticação forte**: Implementa métodos de autenticação robustos, garantindo a segurança na comunicação entre dispositivos.
- **Capacidade Offline**: Os dispositivos podem ser conectados e geridos mesmo quando estão offline, aumentando a resiliência da plataforma.

Essas funcionalidades fazem do Amazon AWS IoT uma solução eficaz e segura para empresas que buscam implementar e escalar suas operações IoT de maneira confiável. 

O **Samsung ARTIK** é uma plataforma de IoT que tem como foco facilitar a adoção de soluções IoT em diversos setores. Suas principais características incluem:

- **Segurança Avançada**: Incorpora medidas robustas de segurança para proteger dados e dispositivos conectados.
- **Interoperabilidade**: Promove a compatibilidade entre diferentes dispositivos e sistemas, facilitando a integração.
- **Facilidade de Uso**: A plataforma é projetada para ser intuitiva, simplificando o processo de desenvolvimento e implementação de soluções IoT.
- **Suporte a Diversas Aplicações**: Suporta uma ampla gama de aplicações, permitindo que as empresas adaptem as soluções às suas necessidades específicas.

Essas características fazem do Samsung ARTIK uma opção atraente para empresas que desejam adotar a IoT de forma prática e segura. 

desenvolvendo soluções com dispositivos:


O caso Mirai envolve uma vulnerabilidade em dispositivos IoT (Internet das Coisas), como câmeras de segurança, roteadores e até babás eletrônicas, que foram usados em um dos maiores ataques cibernéticos da história.

Em 2016, os hackers criaram um software malicioso (malware) chamado Mirai, que explorava a falta de segurança desses dispositivos. A maioria dos aparelhos IoT vem com senhas padrão de fábrica, como "admin" ou "password", e muitas pessoas não as trocam. O Mirai vasculhava a internet em busca de dispositivos com essas senhas padrão. Quando os encontrava, infectava o aparelho, transformando-o em parte de uma rede de "zumbis" (um botnet).

Essa rede de dispositivos infectados foi usada para lançar ataques DDoS (Distributed Denial of Service). Em um ataque DDoS, milhares de dispositivos mandam solicitações para um servidor ao mesmo tempo, até ele ficar sobrecarregado e sair do ar. Foi o que aconteceu em 2016: o botnet Mirai fez grandes sites e serviços online, como Netflix, Twitter e Spotify, ficarem indisponíveis por várias horas.

Esse caso mostrou como a falta de segurança em dispositivos IoT pode ter consequências graves, afetando até mesmo serviços de internet amplamente usados. Ele também alertou fabricantes e usuários sobre a importância de proteger esses dispositivos com senhas fortes e atualizações de segurança.

Estudo feito pela Gartner- 3 funcionalidaes esseenciais para uma boa plataforma IOT:

- suporte a aplicações
- consolidação de dados e armazenamento
- gerenciamento de conectividade
