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
na hora que der o git push vai pedir a senha do token 