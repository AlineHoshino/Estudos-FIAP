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
leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.person_24), contentDescription = "icone de usuario")
            }
Gerenciando estado de um textfield:
Log.i - para ver o log 
para não ter de digitar a variavel.value e oegar o valor direto faça ssim:
var texto by remember{
        mutableStateOf("")
    }
Coloque o by e faça os imports

Dentro do código podemos chamar uma biblioteca padrão cchamada Icons que possui ícones.
imageVector = Icons.Default.Home
Definir o teclado:
 keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
 Assim o teclado só vai aceitar números
  keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Sentences)
  keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words) - cada plavra começa com maiúscula


Mais cores para o Textfiled:
colors = TextFieldDefaults.colors(focusedTextColor = Color.Magenta, unfocusedTextColor = Color.Gray)
Cor muda se o texto está focado ou não.

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = python , onCheckedChange = {
                python = it
            })
            Text(text = "Python")
        }

No checkbox cria uma variavel booleana

