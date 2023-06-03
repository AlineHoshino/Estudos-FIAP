# importando o módulo json
import json

# Criando uma variável de texto
conteudo = (
    "Estou testando criar um arquivo de texto. Então, estou... textando?"
)

# usando a função open para criar um objeto do tipo arquivo
arquivo = open("c:/arquivos/novo_arquivo.txt", "w")

# Escrevendo o conteúdo da variável conteudo dentro do arquivo
arquivo.write(conteudo)

# fechando o arquivo
arquivo.close()

# criando um dicionário para usarmos como exemplo
contatos = {
    "Clark Kent": {"Celular": "123456", "Email": "super@krypton.com"},
    "Bruce Wayne": {"Celular": "654321", "Email": "bat@caverna.com.br"},
}

# convertendo o dicionário para uma string o formato json
final = json.dumps(contatos, indent=4)

# criando um arquivo
arquivo = open("c:/arquivos/agenda.json", "w")

# escrevendo o JSON dentro do arquivo
arquivo.write(final)

# fechando o arquivo
arquivo.close()


# usando a função open para criar um objeto do tipo arquivo
arquivo = open("c:/arquivos/agenda.json")

# colocando o conteúdo do arquivo em uma variável do tipo string
conteudo_do_arquivo = arquivo.read()

# fechando o arquivo
arquivo.close()

# usando o método loads para converter uma string no
# formato json em um dicionário
agenda = json.loads(conteudo_do_arquivo)

# comprovando que o objeto agenda é do tipo dicionário
print("O tipo do objeto agenda é {}".format(type(agenda)))
