package br.com.fiap.myapplication3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
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
    Column {
        Text(
            modifier =
            Modifier.background(Color(149, 184, 213, 255))
                .border(border = BorderStroke(1.dp, color = Color.Blue))
                .padding(vertical = 32.dp)
                .width(200.dp)
                .align(Alignment.CenterHorizontally),
            text = "oie",
            textAlign = TextAlign.Start,
            fontFamily = Caveat,
            fontSize = 32.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplication3Theme {
        Greeting()
    }