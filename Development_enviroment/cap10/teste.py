nome = input("digite seu nome")
print(nome + " é um programador incrível!")

print("Esse programa exibirá seu nome completo. ")
nome = input("Digite seu primeiro nome, por favor: ")
sobrenome = input("Digite seu sobrenome, por favor: ")
nome_completo = nome + " " + sobrenome
print(nome_completo)

resposta = "sim"
texto = "Brasil"
print("s" in resposta)
print("n" not in resposta)
print("b" in texto)
print("B" in texto)
# operador de associação são utilizados para averiguar se um objeto está
# contido em uma sequência

cidade_p1 = "São Paulo"
cidade_p2 = "São Paulo"
cidade_p3 = "Rio de Janeiro"
print(id(cidade_p1))
print(id(cidade_p2))
print(id(cidade_p3))
print(cidade_p1 is cidade_p2)

# operador de identidade, quando precisamos comparar se dois objetos
#  utilizam a mesma posição de memória no Python
# usamos os operadores is e not is. Operador de
# identidade analisa o endereço e o de igualdade == analisa o valor
# método id retorna o endereço de memória de um objeto
