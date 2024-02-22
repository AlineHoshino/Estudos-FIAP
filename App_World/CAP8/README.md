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
            

Passar valor de uma tela para outra - exemplo ver os detalhes do produto, passar o id daquele produto 

                        composable(route = "perfil/{nome}")
                            val nome = it.arguments

Na NavBackStackEntry que eles chamam de it, tem a opção arguments que é onde fica os argumentos que são passados via rota 
                            val nome = it.arguments?.getString("nome")

Coloco o ponto de interrogação para mostrar que ue sei que virá um nulo,uso o getString porque sei que virá uma String, coloco "nome" que é o nome do parametro que vem na rota {nome}
                            PerfilScreen(navController, nome!!)
                            !! - double bang
Chamar uma tela e ser opcional o valor

Como passar parametros opcionais:
                        composable(
                            route = "smart?numero={numero}",
                            arguments = listOf()

depois do nome da rota passar? colocar o nome do argumento, e um segundo paraemtro que é o arguments que recebe uma lista

deixa um default Value e coloca o nome do argumento que quer recuperar ficando assim:
                            arguments = listOf(navArgument(name = "numero"){
                              defaultValue = "sem valor"

Caso eu não passe o argumento na rota ficando assim:
            Button(
                onClick = { navController.navigate("smart") },
fica o valor default que é sem valor


Multiplos parametros entre telas:

                        composable(
                            route = "perfil/{nome}/{idade}",
                            arguments = listOf(
                                navArgument(name = "nome"){
                                    type = NavType.StringType
                                },
                                navArgument(name = "idade"){
                                    type = NavType.IntType
                                }
                            )
                        ){
                            val nome = it.arguments?.getString("nome")
                            val idade = it.arguments?.getInt("idade")
                            PerfilScreen(navController, nome!!, idade!!)
                        }

