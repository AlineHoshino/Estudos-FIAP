quebrar em componenetes diferentes
estado fica numa hierarquia mais alta
state hoisting

exemplo:

package br.com.fiap.myapplication.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeEntrada(
    label: String,
    placeholder: String,
    value: String,
    keyboardType: KeyboardType,
    modifier: Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = {},
        modifier = modifier,
        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = placeholder)
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )
}

    atualizarValor: () -> Unit

É uma função que não retorna nada

                    CaixaDeEntrada(
                        label = "Valor do Investimento",
                        placeholder = "Quanto deseja investir",
                        value = capital,
                        keyboardType =  KeyboardType.Decimal,
                        modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                        atualizarValor = {
                            capital = it
                        }
                    )

                    CaixaDeEntrada(
                        label = "Taxa de juros",
                        placeholder = "Qual a taxa de juros?",
                        value = taxa,
                        keyboardType =  KeyboardType.Decimal,
                        modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                        atualizarValor = {
                            taxa = it
                        }
                    )
                    CaixaDeEntrada(
                        label = "Período em meses",
                        placeholder = "Qual o período em meses?",
                        value = tempo,
                        keyboardType =  KeyboardType.Decimal,
                        modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                        atualizarValor = {
                            tempo = it
                        }
                    )


Fica mais clean com menos códgo na main 

Padrão MVVM - Model-View-ViewModel
Model é a camada de dados - um cálculo, base de dados
View caamada de apresentação dos dados - a tela
ViewModel faz o meio de campo
Ctrl + Alt + O - remove imports que não estão mais sendo usados
O arquivo que guarda a tela, cria uma classe chamada HurosScreenViewModel é o que cuida do estado 
Fazemos a nossa classe JurosScreenViewModel, herdar de ViewModel 
Uma variavel obervavel e um observador
_capital - está dizendo que é uma variavel privada

    private val _capital =  MutableLiveData<String>()
    val capital: LiveData<String> = _capital

A capital é oublica, mas não é modificavel

Colocar no parametro da jurosCreen - a jurosScreenViewModel para ela saber qual viewmodel que está ligada

package br.com.fiap.myapplication.juros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JurosScreenViewModel: ViewModel() {

    private val _capital =  MutableLiveData<String>()
    val capital: LiveData<String> = _capital

    fun onCapitalChanged(novoCapital: String){
        _capital.value = novoCapital
    }
}


cria os métodos que mudam os valores


view só precisa saber que ela tem de observar 
