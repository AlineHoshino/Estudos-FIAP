Uso de csrds e imagens:

                Image(painter= painterResource(id = R.drawable.healthy),
                    contentDescription= "Imagem de uma moça",
                    modifier = Modifier.size(60.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                    )

Deixar a imagem circular
em values, colors.xml
Posso adicionar cores com os nomes que eu quero e assim puxar pelo nome:     <color name="vermelho_teste">#FFED145B</color>
.background(colorResource(id = R.color.vermelho_teste))

                Card(modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth(),
                     colors = CardDefaults.cardColors(containerColor = Color.Cyan),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    )

Elevation deixa a impressão que o card está mais elevado 
offset para subir o card mais para cima, eixo x e y 

Para não ter tanta responsabilidade criar um arquivo para fazer os cálculos das funções.
