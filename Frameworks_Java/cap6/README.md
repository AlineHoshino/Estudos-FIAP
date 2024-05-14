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