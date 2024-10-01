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

 A aula aborda os conceitos de Integração Contínua (CI) e Entrega Contínua (CD) e como essas práticas melhoram o desenvolvimento de software. A CI permite a confirmação frequente de código em um repositório compartilhado, facilitando a identificação de erros e a colaboração em equipes grandes. Já a CD possibilita lançamentos de software automatizados, melhorando o feedback entre desenvolvedores e usuários.

A aula também explora a aplicação de CI/CD em uma API desenvolvida em Java com Spring Boot, incluindo a gestão de variáveis sensíveis com Docker e o uso do GitHub Actions para automatizar as etapas do desenvolvimento. São apresentados os componentes, fluxos de trabalho e a importância de um Personal Access Token para segurança.

Na parte prática, é ensinado a criar um workflow no GitHub Actions, monitorar sua execução e utilizar ações do Marketplace para otimização do processo. A aula propõe workflows específicos para CI e CD, consolidando um ciclo de desenvolvimento ágil e eficiente, voltado para desenvolvedores que buscam aprimorar suas práticas de entrega de software.

CD- deployment center em deployment na aplicação - manage publish profile
