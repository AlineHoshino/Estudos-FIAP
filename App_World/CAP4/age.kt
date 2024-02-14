package br.com.fiap.helloworld

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Meucomponente()
                }
            }
        }
    }
}

@Composable
fun Meucomponente() {

    var idade = remember {
        mutableStateOf(0)
    }

    var tan = remember {
        mutableStateOf("menor")
    }

    if (idade.value >= 18) {
        tan.value = "maior"
    } else {
        tan.value = "menor"
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Qual a sua idade?",
            color = Color.Red,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
//            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Pressione o botão para informar a sua idade.",
            fontSize = 12.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center,
//            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "${idade.value}",
            fontSize = 48.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { idade.value-- },
                modifier = Modifier.size(84.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF88c6a5)), ) {
                Text(text="-")
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(onClick = { idade.value++
                               Log.i("Fiap", "meu comonente: ${idade.value}")
                             },
                modifier = Modifier.size(84.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF88c6a5)),) {
                Text(text="+")
            }

        }
        Text(text = "Você é ${tan.value} de idade!")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MeuComponentPreview() {
    Meucomponente()
}