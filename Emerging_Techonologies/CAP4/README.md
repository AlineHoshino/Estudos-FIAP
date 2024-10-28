
### Resumo da Aula - Internet das Coisas (IoT)

1. **Introdução**
   - A IoT é essencial para a Internet de Todas as Coisas (IoE), integrando pessoas, dados, processos e dispositivos inteligentes.

2. **Arquitetura dos Dispositivos Inteligentes**
   - Composta por quatro elementos principais:
     - **Processamento/Memória**: Microcontroladores e conversores analógicos com baixo consumo de energia.
     - **Comunicação**: Endereçamento IP para identificação na internet.
     - **Energia**: Fonte de energia necessária para funcionamento.
     - **Sensores/Atuadores**: Coletam dados ou executam ações.

3. **Tecnologias de Comunicação**
   - Principais tecnologias incluem:
     - **RFID**
     - **NFC**
     - **Bluetooth**
     - **iBeacons**
     - **Zigbee**

4. **Arquiteturas para Aplicações Web e Mobile**
   - Camadas para garantir interoperabilidade:
     - **Acesso à Rede**: 6LoWPAN, mDNS.
     - **Internet**: IPV4, IPV6.
     - **Transporte**: UDP, QUIC, DTLS.
     - **Aplicação**: MQTT, CoAP, XMPP.

5. **Sensores e Atuadores**
   - **Sensores**: Detectam mudanças em variáveis físicas.
   - **Atuadores**: Realizam ações no mundo físico.

6. **Plataformas para Aplicações IoT**
   - Principais plataformas middleware:
     1. Google Cloud IoT
     2. AWS IoT
     3. OpenIoT
     4. WSO2 IoT
     5. Microsoft Azure IoT

7. **Conclusão**
   - A IoT é marcada pela comunicação entre dispositivos inteligentes, com desafios de interoperabilidade e escalabilidade. As plataformas middleware são cruciais para gerenciamento e segurança.

8. **Comparação das Plataformas**
   - Todas as plataformas oferecem suporte a protocolos de integração, descoberta de dispositivos, mecanismos de segurança e escalabilidade.


Essas camadas fazem parte do modelo TCP/IP, que é uma forma de organizar a comunicação na internet para que dados cheguem corretamente de um dispositivo a outro. Vamos entender cada camada e seus protocolos:

1. Camada de Acesso à Rede
Função: É responsável por enviar dados entre dispositivos que estão na mesma rede local, como seu computador e o roteador. Essa camada envolve os aspectos físicos e de conexão, como cabos, sinais, e como os dados são transportados dentro da rede local (ex.: Wi-Fi, Ethernet).

Protocolos comuns:

Ethernet: Conecta dispositivos em redes locais (LANs).
Wi-Fi: Permite conexão sem fio entre dispositivos em uma área local.
2. Camada de Internet
Função: Roteia os dados de uma rede para outra até o destino final. É aqui que os dados começam a "viajar" pela internet, passando por vários roteadores e redes diferentes.

Protocolos comuns:

IP (Internet Protocol): Define endereços IP e roteia pacotes de dados pela rede até o destino.
ICMP (Internet Control Message Protocol): Envia mensagens de erro e informações de status (por exemplo, quando um dispositivo está inacessível).
3. Camada de Transporte
Função: Garante que os dados cheguem corretamente ao destino e na ordem certa. É como o "chefe" da comunicação, gerenciando a entrega de dados.

Protocolos comuns:

TCP (Transmission Control Protocol): Assegura que todos os dados cheguem corretamente e na ordem.
UDP (User Datagram Protocol): Envia os dados de forma rápida, mas sem garantir que todos os pacotes cheguem (bom para streaming, onde velocidade é mais importante que a precisão).
4. Camada de Aplicação
Função: Facilita a interação entre o usuário e a rede, ou seja, é onde estão as funções e serviços que as pessoas usam diretamente, como e-mail e navegação web.

Protocolos comuns:

HTTP/HTTPS: Para navegação web.
SMTP: Para envio de e-mails.
FTP: Para transferir arquivos.
Em resumo:

Acesso à Rede: Conexão e envio dentro de redes locais.
Internet: Roteamento entre redes.
Transporte: Garante entrega correta e ordenada.
Aplicação: Serviços visíveis ao usuário (ex.: e-mail, navegação).

