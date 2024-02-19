package br.com.fiap.myapplication3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.myapplication3.ui.theme.Caveat
import br.com.fiap.myapplication3.ui.theme.MyApplication3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {


    var texto by remember{
        mutableStateOf("")
    }

    var idade by remember{
        mutableStateOf("")
    }

    var email by remember{
        mutableStateOf("")
    }

    var kotlin by remember {
        mutableStateOf(false)
    }

    var java by remember {
        mutableStateOf(false)
    }

    var python by remember {
        mutableStateOf(false)
    }

    var linguagemSelecionada by remember {
        mutableStateOf(0)
    }

    var cor by remember{
        mutableStateOf(Color.Yellow)
    }

    Column(modifier = Modifier.padding(32.dp).background(cor)) {
        TextField(
            value = texto,
            onValueChange = { letra ->
                texto = letra
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Qual o seu nome?")
            },
            placeholder = {
                Text(text = "Digite o nome e sobrenome")
            },
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.person_24), contentDescription = "icone de usuario")
            },
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words)
        )
        TextField(
            value = idade,
            onValueChange = { letra ->
                idade = letra
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
            label = {
                Text(text = "Qual a sua idade?")
            },
            placeholder = {
                Text(text = "Digite um npumero")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = "icone de usuario")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            textStyle = TextStyle(
                textAlign = TextAlign.End
            ),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Magenta,
                unfocusedTextColor = Color.Gray,
                cursorColor = Color.Red
            )
        )
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            label = {
                Text(text = "Qual o seu email?")
            },
            shape = RoundedCornerShape(32.dp)
            )
        Spacer(modifier = Modifier.height(32.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = kotlin , onCheckedChange = { isSelected ->
                kotlin = isSelected
            })
            Text(text = "Kotlin")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = java , onCheckedChange = {
                java = it
            })
            Text(text = "Java")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = python , onCheckedChange = {
                python = it
            })
            Text(text = "Python")
        }
        Spacer(modifier= Modifier.height(32.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = linguagemSelecionada == 0, onClick = { linguagemSelecionada = 0 })
            Text(text = "Windows")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = linguagemSelecionada == 1, onClick = { linguagemSelecionada = 1 })
            Text(text = "MacOs")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = linguagemSelecionada == 2, onClick = { linguagemSelecionada = 2})
            Text(text = "GNU/Linux")
        }
        Spacer(modifier= Modifier.height(32.dp))

        Row(horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
            ) {
          Button(onClick = { cor = Color.Blue }) {
              Icon(imageVector = Icons.Default.Share, contentDescription = "share")
              Text(text = "Clique-me")
          }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApplication3Theme {
        Greeting()
    }
}