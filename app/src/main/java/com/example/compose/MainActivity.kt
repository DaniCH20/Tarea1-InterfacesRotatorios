package com.example.compose

import android.content.res.Configuration
import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Surface(modifier = Modifier.fillMaxSize())
                {
                    //Greeting(
                    //name = "Android",
                    //  modifier = Modifier.padding(innerPadding)
                    //)
                    calculadora()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    calculadora()

    /*

    Column {
        Row(
            modifier = Modifier.padding(10.dp)
                .fillMaxWidth()
        ) {
            Text(
                "Calculadora",
                modifier = Modifier.padding(bottom = 10.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth()
        ) {

        }
        Row(
            modifier = Modifier
                .padding(60.dp)
                .fillMaxWidth()
        ) {

        }
        Row(
            modifier = Modifier
                .padding(1.dp)
                .fillMaxWidth()
        ) {
            Button(
                onClick = { onClick() },

                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
                    .testTag("buton.")
            ) {
                Text(".")
            }
            Button(
                onClick = { onClick() },
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
                    .testTag("butonDEL")
            ) {
                Text("DEL")
            }
            Button(
                onClick = { onClick() },
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
                    .testTag("butonAC")
            ) {
                Text("AC")
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(1.dp)
                .fillMaxWidth()
        ) {
            Button(
                onClick = { onClick() },
                modifier = Modifier
                    .padding(10.dp)
                    .testTag("buton1")
            ) {
                Text("1")
            }
            Button(
                onClick = { onClick() },
                modifier = Modifier
                    .padding(10.dp)
                    .testTag("buton2")
            ) {
                Text("2")
            }
            Button(
                onClick = { onClick() },
                modifier = Modifier
                    .padding(10.dp)
                    .testTag("buton3")
            ) {
                Text("3")
            }
            Button(
                onClick = { onClick() },
                modifier = Modifier
                    .padding(3.dp)
                    .weight(1f)
                    .testTag("buton-")
            ) {
                Text("-")
            }
            Button(
                onClick = { onClick() },
                modifier = Modifier
                    .padding(3.dp)
                    .weight(1f)
                    .testTag("buton+")

            ) {
                Text("+")
            }


        }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(1.dp)
            .fillMaxWidth()

    ) {
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(10.dp)
                .testTag("buton4")
        ) {
            Text("4")
        }
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(10.dp)
                .testTag("buton5")
        ) {
            Text("5")
        }
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(10.dp)
                .testTag("buton6")
        ) {
            Text("6")
        }
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(3.dp)
                .weight(1f)
                .testTag("butonx")
        ) {
            Text("X")
        }
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(3.dp)
                .weight(1f)
                .testTag("buton/")
        ) {
            Text("/")
        }
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(1.dp)
            .fillMaxWidth()
    ) {
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(10.dp)
                .testTag("buton7")
        ) {
            Text("7")
        }
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(10.dp)
                .testTag("buton8")
        ) {
            Text("8")
        }
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(10.dp)
                .testTag("buton9")
        ) {
            Text("9")
        }
        Button(
            onClick = { onClick() },
            modifier = Modifier.padding(5.dp)
                .weight(1f)
                .testTag("buton=")
        ) {
            Text("=")
        }
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(1.dp)
            .fillMaxWidth()
    ) {
        Button(
            onClick = { onClick() },
            modifier = Modifier.padding(10.dp)
                .weight(1f)
                .testTag("buton0")
        ) {
            Text("0")
        }

    }


    }


     */
}

fun isNumeric(toCheck: String): Boolean {
    val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
    return toCheck.matches(regex)

}

@Composable
fun calculadora() {
    var contador: MutableState<Int> = rememberSaveable { mutableStateOf(0) }
    val (oldVal, setOldVal) = remember { mutableStateOf("") }
    val (operador, setOperador) = remember { mutableStateOf("") }
    val (result, setResult) = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Text(
            text = "Calculadora",
            modifier = Modifier.padding(bottom = 5.dp).background(color =Color.White)

        )
        OutlinedTextField(value = result , onValueChange = {},
            modifier = Modifier.padding(bottom = 5.dp).background(color =Color.White))
        var listaA = listOf<String>(".", "  DEL  ", "  AC  ")
        var listaB = listOf<String>("9", "8", "7", "+", "-")
        var listaC = listOf<String>("6", "5", "4", "x", "/")
        var listaD = listOf<String>("3", "2", "1", "         =          ")
        var listaE = listOf<String>("                  0                   ")
        var listaFinal = listOf<List<String>>(listaA, listaB, listaC, listaD, listaE)
        listaFinal.forEach {
            var lista = it
            Row() {
                lista.forEach {
                    Button(
                        onClick = {
                            if (isNumeric(it)) {
                                setResult(result + it.toString())
                            }
                            if (it.equals("                  0                   ")) {
                                setResult(result + 0)
                            }
                            if (it.equals("/") || it.equals("x") ||
                                it.equals("+") || it.equals("-")
                            ) {
                                setOldVal(result)
                                setResult("")
                                setOperador(it.toString())
                            }
                            if (it.equals("  AC  ")) {
                                setResult("")
                            }
                            if (it.equals("  DEL  ")) {
                                setResult("")
                            }
                            if (it.equals(".")) {
                                setResult(result + ".")
                            }
                            if (it.equals("         =          ")) {
                                val num1 = oldVal.toDouble()
                                val num2 = result.toDouble()
                                when (operador) {
                                    "/" -> setResult((num1 / num2).toString())
                                    "x" -> setResult((num1 * num2).toString())
                                    "-" -> setResult((num1 - num2).toString())
                                    "+" -> setResult((num1 + num2).toString())
                                }
                            }
                        }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                        modifier = Modifier.padding(10.dp)

                    ) {
                        Text(text = it)
                    }
                }

            }
        }
    }
}