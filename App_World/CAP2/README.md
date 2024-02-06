Para constantes usar a palavra reservada val

val (address,number) = Pair("Av. Lins de Vasconcelos", 1264)
println(address)
println(number)


//A linha abaixo o código não vai compilar
//var driverLicense: String = null
    
// A atribuição de null a um var também não será compilada
//var driverLicense: String = "6789877"
//driverLicense = null // não compila   
// Para que uma variável contenha um valor null é necessário
// o uso do sufixo ? no tipo
var driverLicense: String? = null
println(driverLicense)    
driverLicense = "6789877"
println(driverLicense)    
driverLicense = null // agora compila       
println(driverLicense)


//Criando um Array de Strings vazio
var emptyArray =  arrayOf<String>()
//Criando um Array de Strings e alimentando valores na criação
var shoppingList = arrayOf<String>("Leite", "Pão", "Manteiga", "Açúcar")
//Usando inferência
var inferredShoppingList = arrayOf("Leite", "Pão", "Manteiga", "Açúcar")
//Testando se um Array está vazio
if (shoppingList.isEmpty()) {
   println("A lista de compras está vazia")
} else {
   println("A lista de compras NÃO está vazia")
}
//Recuperando o total de elementos do Array
println("Nossa lista de compras possui ${shoppingList.size} itens")
//Resultado: Nossa lista de compras possui 4 itens
println("Listando todos os itens:")
println(shoppingList[0]) //Primeiro item do array
println(shoppingList[1]) //Segundo item Acessando itens de um Array do array
println(shoppingList[2]) //Terceiro item do array
println(shoppingList[3]) //Quarto item do array

List - permite elementos repetidos 

//Criando um List de Strings
var movies = ArrayList<String> ()
   movies.addAll(listOf(
   "Matrix",
   "Vingadores",
   "Jurassic Park",
   "De Volta para o Futuro"
   ))
//Criando um list vazio
var movies2 = ArrayList<String> ()
//Inserindo elementos
movies.add("Homem-Aranha: De Volta ao Lar")
println(movies.count()) //5
println("\n")
//Perceba que o código abaixo vai alterar a quantidade
//de itens do List pois ele aceita itens repetidos.
movies.add("Homem-Aranha: De Volta ao Lar")
println(movies)   //[Matrix, Vingadores, Jurassic Park, De Volta ao Futuro, Homem-Aranha: De Volta ao Lar, Homem-Aranha: De Volta ao Lar]
println(movies.count()) //6 (2 elementos repetidos)
println("\n")
//Removendo 2 elementos repetidos
movies.remove("Homem-Aranha: De Volta ao Lar")
movies.remove("Homem-Aranha: De Volta ao Lar")
println(movies)   //["Vingadores", "De Volta para o Futuro", "Matrix", "Jurassic Park"]
println("\n")
//Percorrendo um List
for (movie in movies) {
   println(movie)
}
println("\n")
//Verificando se determinado elemento está contido no List
if (movies.contains("Matrix")) {
   println("Matrix está na minha lista de filmes favoritos!!")
}
println("\n")
//Vamos criar um novo List para realizarmos algumas operações
//No exemplo abaixo, usaremos um formato mais simplificado de criação de List
var myWifeMovies  = listOf(
   "De Repente 30",
   "Mensagem para você",
   "Sintonia de Amor",
   "De Volta para o Futuro",
   "Jurassic Park"
)
//Criando um List com todos os filmes
var allMovies = movies + myWifeMovies
println(allMovies)
//[Matrix, Vingadores, Jurassic Park, De Volta para o Futuro, De Repente 30, Mensagem para você, Sintonia de Amor, De Volta para o Futuro, Jurassic Park]
println("\n")


//Criando um Set de Strings
var movies = HashSet<String> ()
var catalog = listOf(
       "Matrix",
       "Vingadores",
       "Jurassic Park",
       "De Volta para o Futuro"
)
movies.addAll(catalog)
//Perceba que o catálogo de filmes está ordenado alfabeticamente
println(movies) //[Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
println(movies.count()) //4
println("\n")
//Criando um set vazio
var movies2 = HashSet<String> ()
//Inserindo elementos
movies.add("Homem-Aranha: De Volta ao o Lar")
println(movies) //[Homem-Aranha: De Volta ao o Lar, Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
println(movies.count()) //5
println("\n")
//Perceba que o código abaixo NÃO alterará a quantidade
//de itens do Set pois ele NÃO aceita itens repetidos.
movies.add("Homem-Aranha: De Volta ao o Lar")
println(movies)   //[Homem-Aranha: De Volta ao o Lar, Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
println(movies.count()) //5 ( Nenhum elemento repetido. E ainda tudo ordenado )
println("\n")
//Removendo elemento
movies.remove("Homem-Aranha: De Volta ao o Lar")
println(movies)   //["Vingadores", "De Volta para o Futuro", "Matrix", "Jurassic Park"]
println(movies.count()) //4
println("\n")
//Percorrendo um Set
for (movie in movies) {
   println(movie)
}
println("\n")
//Verificando se determinado elemento está contido no List
if (movies.contains("Matrix")) {
   println("Matrix está na minha lista de filmes favoritos!!")
}
println("\n")
//Vamos criar um novo set para realizarmos algumas operações
//No exemplo abaixo, usaremos um formato mais simplificado de criação de Set
var myWifeMovies  = setOf(
   "De Repente 30",
   "Mensagem para você",
   "Sintonia de Amor",
   "De Volta para o Futuro",
   "Jurassic Park"
)
//Criando um Set com todos os filmes. SEM repetição. TUDO ordenado ;)
var allMovies = movies + myWifeMovies
println(allMovies) // [Jurassic Park, Matrix, De Volta para o Futuro, Vingadores, De Repente 30, Mensagem para você, Sintonia de Amor]
println(allMovies.count()) //7


//Criando um Map de Strings
var movies = HashMap<Int,String> ()
var catalog = mapOf(
       Pair(10,"Matrix"),
       Pair(20,"Vingadores"),
       Pair(30,"Jurassic Park"),
       Pair(40,"De Volta para o Futuro")
)
//Utilize o método putAll para inserir o catálogo
movies.putAll(catalog)
//Perceba que o catálogo de filmes está ordenado alfabeticamente
println(movies) //{40=De Volta para o Futuro, 10=Matrix, 20=Vingadores, 30=Jurassic Park}
println(movies.count()) //4
println("\n")
//Criando um set vazio
var movies2 = HashSet<String> ()
//Inserindo 1 elemento
movies.put(25,"Homem-Aranha: De Volta ao Lar")
println(movies) //{40=De Volta para o Futuro, 25=Homem-Aranha: De Volta ao Lar, 10=Matrix, 20=Vingadores, 30=Jurassic Park}
println(movies.count()) //5
println("\n")
//Perceba que o código abaixo irá alterar a quantidade
//de itens do Map pois ele aceita itens da chave NÃO repetidos.
//movies.put(25,"Homem-Aranha: De Volta ao Lar")
//Faça um teste com a linha superior de código e a inferir
movies.put(35,"Homem-Aranha: De Volta ao Lar")
println(movies)   //{40=De Volta para o Futuro, 25=Homem-Aranha: De Volta ao Lar, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park}
println(movies.count()) //6
println("\n")
//Removendo elemento
movies.remove(25)
println(movies)   //{40=De Volta para o Futuro, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park}
println(movies.count()) //5
println("\n")
//Pecorrendo um Map
for (movie in movies) {
   println(movie)
}
println("\n")
//Verificando se determinado elemento está contido no List
if (movies.containsValue("Matrix")) {
   println("Matrix está na minha lista de filmes favoritos!!")
}
println("\n")
//Vamos criar um novo map para realizarmos algumas operações
//No exemplo abaixo, usaremos um formato mais simplificado de criação de Map
var myWifeMovies  = mapOf(
   Pair(100,"De Repente 30"),
   Pair(200,"Mensagem para você"),
   Pair(300,"Sintonia de Amor"),
   Pair(400,"De Volta para o Futuro"),
   Pair(500,"Jurassic Park")
)
//Criando um Map com todos os filmes)
var allMovies = movies + myWifeMovies
println(allMovies) // {40=De Volta para o Futuro, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park, 100=De Repente 30, 200=Mensagem para você, 300=Sintonia de Amor, 400=De Volta para o Futuro, 500=Jurassic Park}
println(allMovies.count()) //10
println("\n")
//Lendo Chave e Valor separadamente
for(movie in allMovies) {
   println("Chave => Key => ${movie.key}")
   println("Valor => Value => ${movie.value}")
   var title = movie.value.toUpperCase()
   println("UpperCase => ${title}")
   title = movie.value.toLowerCase()
   println("LowerCase => ${title}")
   println("\n")
}
//Executando uma pesquisa diretamente na chave do Map
var film1 = allMovies.get(400)   //400=De Volta para o Futuro
println("Title => ${film1}") // Retorna String. Retorna o Título
var film2 = allMovies.get(999)   //Não existe
println("Title => ${film2}") // Retorna null
//Verificando a possibilidade de testar antes de imprimir
var code = 1234 // Experimente trocar o código
var film3 = allMovies.get(code)   //Não existe
if(film3.isNullOrEmpty()) {
   println("\nFilme com o código $code não encontrado!")
} else {
   println("\nTitle => ${film3}") // Retorna o título
}

println("\nClosed Range ..")
var numbers = 1..10
for (number in numbers) {
    println(number)   //Imprime de 1 a 10
}
    
println("\nHalf Closed Range (until)")
var newNumbers = (1 until 10)
for (number in newNumbers) {
    println(number)   //Imprime de 1 a 9
}


fun main(args: Array<String>) {
    
    //elaborando um coleção do tipo List com números entre 1 a 10
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    println(numbers)

    //"Filtrando"(filter) somente os números pares da coleção numbers
    //a variável temporária chamada "it" utilizada na operação
    var evenNumbers = numbers.filter { it%2 == 0 }
    println("Listagem de números Pares: $evenNumbers")

    //"Filtrando"(filter) somente os números ímpares da coleção numbers
    //a variável temporária chamada "it" utilizada na operação
    var oddNumbers = numbers.filter { it%2 != 0 }
    println("Listagem de números Ímpares: $oddNumbers")

    //A utilização do Map executa o processamento individual
    //de cada elemento dentro da coleção.
    var multiplyNumbers = numbers.map { it * it }
    println("Multiplicação: $multiplyNumbers")

    //Executa o processamento da coleção de acordo
    //com os parâmetros enviados.
    var sumNumbers = numbers.reduce {
        //Captura o valor anterior ou atual (acc) e o valor atual(it)
        acc, it ->
        //Apresenta as informações
        println("acc = $acc, it = $it")
        //Executa o processamento das informações
        acc + it }

    println("Resultado da Somatório: $sumNumbers") //Total 1+2+3+4+5+6+7+8+9+10=55

}

//Aplicando filter em names
var filteredNames = names.filter({it.length < 6})
println(filteredNames)
//["João", "Paulo", "Ana", "Carla"]

open para deixar que possa fazer herança numa classe

Usar o overirde para dizser: sobrepõe esse método