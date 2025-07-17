package es.rmanzanodev.myfirstcomposeapp.component.button

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyTextButton(modifier: Modifier) {
    Column(modifier = modifier) {
        TextButton(
            onClick = { Log.i("Aris", "Boton pulsado") }
        ) {
            Text(text = "TextButton")
        }
    }
}