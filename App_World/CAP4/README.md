Jetpack compose é um frameworl para IU declarativa, apresentada no Google I/O 2019.
Composable - pequenos componentes
Cria um arquivo de tema com o mesmo nome do projeto
Greeting - texto
@Composable - está dizendo que a função é uma função de composição
@Preview mostra a tela como ela vai ficando 
showSystemUi = true, mostra a visualização do usuário
se digitar comp ele auto completa e cria o comosable
digite prev para chamar o preview
No preview colocar - showBackground= true e showSystemUi - para ver o sistema do usuário
Estilização do componente: se colocar o mouse em cima do Text você ve toda a estilização que consegue ser colcada no sistema
ao se aproximar da vírgula de um alt enter e escolha a opçõa de colocar cada css um embaixo do outro 
Alt enter para fazer o import do sp, que é o tamanho da fonte.
A fonte é escalável
TextAlign.Center fica centralizado
colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
Essa opção colors com buttonDefaults é para mudar a cor do conteudo do botão, a superficie do botão
Se abrir o parente do color da para colocar a cor em hexadecimal.