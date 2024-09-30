git config user.email "ddhuqhdqu@email.com"
git config user.name "Aline Hoshino"
git branch 
Criar uma nova branch git checkout -b nome-da-branch
git push 
git push --set-upstream origin feature/primeira-action
criar uma pasta na raíz do projeto chamada .github, dentro dessa pasta uma outra pasta chamada workflows
crie um arquivo yaml
on: push 

jobs:
    job1-hello:
        runs-on: ubuntu-lastest
        steps:
        - name: Imprimir mensagem
         run: echo "Olá mundo"
    job2-goodbye:
        runs-on: ubuntu-latest
        steps:
        - name: Step 1 - Sequencia de instruções
          run: |
            echo "uma nova isntruçõ"
            ls
        - name: Step 2 - Imprimir mensagem
          run: echo "Até logo!"

depois de git add .
git commit -m 
git push 

Agora queremos fazer o workflow a partor de uma branch - mudar para branch develop : git switch develop
name - nome do workflow 
on:
  push:
    branches: 'feature/**'

toda branch que começa com feature/ e tudo que vier depis sera executado, é um filtro de execução nessas branchs 

Ações pré-configuradas

https://github.com/marketplace?type=actions

https://hub.docker.com/

Create repository - criar um token no docker hub, clicar no perfil account settings- create acess token , nome do token e permissões de acesso Read and Write
faz o login docker login -u alinehoshino, dedpois colcoa a o token 
depois va no azure
criarum grupo de recursos, criar o banco de dados, criar um web app - app services- container, linux , origem da imagem docker hub
depois que criar o app colocar as variaveis de ambiente nas configurações