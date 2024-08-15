db.createCollection(‘biblioteca’)

Coleção deve obedecer os seguintes critérios: 
coleção deve começar por letra ou sublinhado _
pode conter numeros
nao pode usar $
nao pode exceder 128 caracteres

Criar grupos nomeados(namespace collection) - livros.romance

Variavel db para referecniar

Posso inserir na emp2 mesmo não existindo
db.emp2.insertOne({"Nome": "Lucas"})

ObjectId- atributo e um índice criado por padrão

insertOne - inserir um documento por vez

db.emp.insertOne({
Nome:"Thais",
Idade:20,
Cargo:"Analista",
Salario:1430.77,
Dependentes:["Angela", "Dora", "Hugo"],
Departamento:{
            Nome:"Pesquisa",
						Local:"São Paulo"  
}
})

documentos aninhados

- Buscando documentos:

db.Coleção.find(Consulta, Projeção, Opções)

db.emp.find({Valor:{$lt: 156.55}});

{
  _id: ObjectId('66ba974de9d7d343249c010a'),
  Nome: 'Banco de dados',
  Autor: 'Angélica',
  Novo: true,
  ISBN: 34567890,
  Valor: 133.29
}


Algum possível valor dentro de um atributo podemos utilizar o operador in 

db.emp.find().sort({Nome:1}); - ordenando por nome

ordem descrescente db.emp.find().sort({Cargo:1, Idade:-1});

db.emp.find({Idade:20}, {_id:1, Idade:1, Cargo:1});    - depois da , é a projeção ou seja, só quero que traga id, idade e cargo.


- Atualizando documentos:

db.emp.updateOne({Autor:"Silva"}, {$set:{Valor: 150}});

db.emp.updateOne({Professor:"André"}, {$rename:{"Professor": "Autor"}}); - renomeando um atributo de Professor para autor

db.emp.updateOne({Professor:"Silva"}, {$unset:{Cod:""}}); - remover o aributo cod

- Deletando documentos:

db.emp.deleteOne({Professor:"Rodrigo"});



Removendo a collection:
db.emp2.drop();

Agregação:

Usar aggregate recebe um array

db.emp.aggregate([{$match: {Valor:{$gte:150}}}])

db.emp.aggregate([{$project: {_id:0, Nome:1, Autor:1}}]); - semelhante a projeção


 não é o atributo id, o id será o atributo que define a granularidade, quando não temos uma granularidade definida, faz a agregação utilizando todos os documentos
db.emp.aggregate(
[{$group: {_id:null, ValorMedio: {$avg: '$Valor'}}}])

pipeline = [
        { $match : { … } },
        { $project : { … } },
        { $group : { … } }
       ]


       db.Coletas.find({caminhaoId: "123ABC"}, {_id:0, coletaId:1, dataColeta:1, tipo:1});

$lookup
Realiza uma união externa esquerda em uma coleção no mesmo banco de dados para filtrar documentos da coleção "unida" para processamento. O estágio $lookup adiciona um novo campo de array a cada documento de entrada. O novo campo de array contém os documentos correspondentes da coleção "unida". O estágio $lookup passa esses documentos remodelados para o próximo estágio.
