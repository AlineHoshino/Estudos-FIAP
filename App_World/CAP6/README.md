pode mudar o bakcground e o border no mesmo modifier.
O align alinha o componente
o textalign - alinha o texto 
Adicionando outros tipos de fonte => res, botao direito, new, - adroid Resource Diretory - Resource type- abre a lista e localiza font
No nome do recursos não deve utilizar maiusculas, hifen e caractere especial
Clica na fonte colcada botão direito, refactor e rename
Na pasta ui.theme, tem o type.kt que é onde ficam as fontes
va nesse type.kt e crie uma variavel
val Kablamo = FontFamily(Font(R.font.kablamo_regular)) - font é a pasta
Entrada de dados do usuário:
O valor mudou a gente dispar uma ação 
Textfield(value="", onValueChange = {})
Obrigatório, onValueChange é uma função
Os desenhos ficam no res na pasta drawable, para adicionar icones, va em res, drawable, botão direito new, vector asset e clique para escolher seu desenho 
trailingIcon - coloca um icone no final 
leadingIcon - coloca icone no início
Gerenciando estado de um textfield:
