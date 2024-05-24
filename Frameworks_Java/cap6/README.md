Container tudo que voce precisa para rodar seu aplicativo.
Benefícios do Doker - portabilidade , isolamento, agilidade, escalabilidade
docker container run hello-world
docker container ls -a
ls - só mostra containers em execução
ls -a - mostra os que saíram tambem 
docker image ls - ver as imagens 
a tag da imagem é a versão que a gente quer.


Docker execute um container cujo nome será fiap-helllo-world:
container run --name fiap-hello-world hello-world

docker container stop apache-fiap - para parar o container
iniciar o container - docker container start apache-fiap

docker container rm 

comando para inspecioanr o container:
docker inspect nome do container

gera um json com os metadados.
consigo ver o endreço ip e o gateway.

docker container run -d -p 80:80 --name apache-fiap-80 httpd

esquerdo minha porta, direito porta do container

Acesso ao container pelo terminal


docker container exec --tty --interactive apache-fiap-999 bash

tty - terminal virtual 

interactive - interagir com o terminal

ntrar em cd htdocs, depois nano.index.html para alterar o arquivo html

Dockerização de uma aplicação:

\Precisa transofrmar em um pacote jar: mvn install 
Chamar notepad Dockerfile
 e depois vamos criar o dockerfile

FROM eclipse-temurim:21-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/contatos-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]


ADD APP.JAR SERÁ O NOME DO NOSSO APLICATIVO 
entrypoint comando para executar a aplicação
Construindo a imagem:
 docker build -t coletas:spring-docker2 .

docker container run -d -p 8080:8080 --name meu-container contatos:spring-docker