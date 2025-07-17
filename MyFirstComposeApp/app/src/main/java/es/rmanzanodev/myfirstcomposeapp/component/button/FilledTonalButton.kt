package es.rmanzanodev.myfirstcomposeapp.component.button

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyFilledTonalButton(modifier: Modifier) {
    Column(modifier = modifier) {
        FilledTonalButton(
            onClick = { Log.i("Aris", "Boton pulsado") }
        ) {
            Text(text = "FilledTonalButton")
        }
    }
}