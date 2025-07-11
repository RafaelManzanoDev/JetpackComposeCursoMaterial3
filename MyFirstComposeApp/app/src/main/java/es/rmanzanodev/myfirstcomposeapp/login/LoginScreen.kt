package es.rmanzanodev.myfirstcomposeapp.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview()
@Composable
fun ExamplePreview() {
    Example("Testing")
}

@Composable
fun Example(nombre: String) {
    Text(
        text = "Rafa $nombre",
        modifier = Modifier
            .background(Color.Red)
            .padding(top = 30.dp)
    )
}

