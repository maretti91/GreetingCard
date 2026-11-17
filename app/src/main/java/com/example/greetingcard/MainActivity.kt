package com.example.greetingcard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable // Define un componente de interfaz.
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) { // Establece el fondo cian.
        Text(
            text = "Hi, my name is $name!", // Muestra el mensaje.
            modifier = modifier.padding(24.dp) // Añade 24 dp de espacio interior.
        )
    }
}


@Preview(showBackground = true) // Activa la vista previa.
@Composable // Define un componente de interfaz.
fun GreetingPreview() {
    GreetingCardTheme { // Aplica el tema visual.
        Greeting("Maretti") // Envía el nombre a la función Greeting.
    }
}