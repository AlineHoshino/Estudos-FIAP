. . . trecho omitido
    Text(
      text = stringResource(id = R.string.login),
      fontSize = 32.sp,
      fontWeight = FontWeight.Bold,
      color = Color.Blue
    )
    Text(text = stringResource(id = R.string.subtitle))
    Spacer(modifier = Modifier.height(48.dp))
. . . trecho omitido


<resources>
    <string name="app_name">Login Prof</string>

    // Strings personalizadas para o inglês
    // que será o idioma padrão da aplicação
    <string name="login">Login</string>
    <string name="subtitle">Please, provide your information</string>
    <string name="email">Enter your e-mail</string>
    <string name="password">Enter your password</string>
    <string name="enter">Enter</string>
    
</resources>

Para não colocar o valor literal, coloc os valores no resource e depois chama  o resource com os valores
Validar a entrada de dados.

onValueChange = {
                       if(it.length < tamanhoMaximo) password = it
                    },
isError modifica a cor para saber que está com erro 

if(erroEmail){
                    Text(text = "O email é obrigatório")
                }

