package es.rmanzanodev.myfirstcomposeapp.component.button

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyOutlinedButton(modifier: Modifier) {
    Column(modifier = modifier) {
        OutlinedButton(
            onClick = { Log.i("Aris", "Boton pulsado") },
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Blue
            )
        ) {
            Text(text = "Outlined")
        }
    }
}