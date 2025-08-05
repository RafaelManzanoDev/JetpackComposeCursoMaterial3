package es.rmanzanodev.myfirstcomposeapp.component.slider

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MySlider(modifier: Modifier = Modifier) {
    var value by remember { mutableFloatStateOf(0f) }
    Column(modifier = modifier.padding(horizontal = 30.dp)) {
        Slider(
            value = value,
            onValueChange = { value = it },
            enabled = true,
            colors = SliderDefaults.colors(
                thumbColor = Color.Red,
                activeTrackColor = Color.Red,
                activeTickColor = Color.Blue,
                inactiveTrackColor = Color.Blue,
                inactiveTickColor = Color.Green,
                disabledThumbColor = Color.DarkGray,
                disabledActiveTrackColor = Color.Gray,
                disabledActiveTickColor = Color.DarkGray,
                disabledInactiveTrackColor = Color.Gray,
                disabledInactiveTickColor = Color.DarkGray
            )
        )
        Text(text = value.toString())
    }
}