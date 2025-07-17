package es.rmanzanodev.myfirstcomposeapp.component.button

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButton(modifier: Modifier) {
    Column(modifier = modifier) {
        Button(
            onClick = { Log.i("Aris", "Boton pulsado") },
            enabled = false,
            shape = RoundedCornerShape(20),
            border = BorderStroke(5.dp, Color.Red),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red,
                containerColor = Color.White,
                disabledContainerColor = Color.Yellow,
                disabledContentColor = Color.Green
            )
        ) {
            Text(text = "Pulsame")
        }
    }
}