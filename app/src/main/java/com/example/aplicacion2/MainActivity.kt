package com.example.aplicacion2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // Aquí es donde se llama al composable

                RandomNumberApp()
            }
        }
    }
}

@Composable
fun RandomNumberApp() {
    val typography = Typography(
        h1 = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        ),
         h2= TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        ),
    )

    MaterialTheme(
        typography = typography
    ) {
        // interfaz de usuario
    }


    // Define el estado para el número generado
    var randomNumber by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Número Generado:",
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = randomNumber.toString(),
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            // Generar un número al azar y actualiza a otro numero
            randomNumber = (0..100).random()
        }) {
            Text("Generar Número")
        }
    }
}



