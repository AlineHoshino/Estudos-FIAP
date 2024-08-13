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