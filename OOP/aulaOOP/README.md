Classe - template, molde modelo, forma - Receita
Objeto - Instância de uma classe

Carro A = new Carro()
Carro A - referência para objeto que está na memória
Se eu só fizer new Carrro() - não estou guardando a referência

Jlabel texto = newJlabel("FIAP");
texto.setFont(newFont("courier", Font.Iatlic,12))- Criando a instancia dentro do parametro
É possível criar instância sem ter referência 

Ao começar a programar primeiros passos:
1- Identificar os objetos:

- Vendedor
- Cliente
- Produto 
- Pedido

2 - Modelar o objeto(Classe):


|  Pedido                   |
|------------------         |
|numero:int                 |
|valorTotal:double          |
|dataPedido: Date           |
|cliente: Cliente           |
|vendedor:Vendedor          |
|produtos:Produto[]         |
|------------------         |
|faturar()                  |
|aplicarDesconto(percentual)|

|Vendedor     |
|-------------|
|nome         |
|identificacao|
|departamento |
|email        |
|telefone     |

|Cliente       |
|--------------|
|nome          |       
|cpf           | 
|endereco      |
|dataNascimento|
|email         |
|telefone      |

|Produto   |
|----------|
|codigo    |
|categoria |
|nome      |
|preco     |
|descricao |

Composição um objeto é composto por outro objeto: Exemplo Pedido que tem o cliente.
[] - vetor - para dizer que tem muitos produtos dentro de um pedido
Um Pedido é uma especificação.

Uma classe que não tem comportamento é perfeitamente possível.
Método- abre e fecha parenteses.
Dentro dos parenteses vai os argumentos dos métodos.
Podemos ter parametros que não estão na classe.
