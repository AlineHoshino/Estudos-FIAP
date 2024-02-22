navcontroller - ve o ciclo de navegação
Importar as bibliotecas do navigation

implementation("androidx.navigation:navigation-compose:2.7.7")

dentro da pasta do build.gradle - (Module:app)
backstack - lembrança das telas acessadas
navController vai guardar a pliha de telas que vai navegar
startdestination quem é a tella que começa
NavHost recebe um NavController
Preciso que a tela de login receba a navController para eu ter o histórico de navegação

            Button(
                onClick = { navController.navigate("smart") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.size(width = 200.dp, height = 48.dp)
            ) {
                Text(text = "Pedidos", fontSize = 20.sp, color = Color.Blue)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.size(width = 200.dp, height = 48.dp)
            ) {
                Text(text = "Sair", fontSize = 20.sp, color = Color.Blue)
            }
            