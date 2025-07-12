package es.rmanzanodev.myfirstcomposeapp.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier) {
    var number = remember { mutableStateOf(0) }
    Column {
        Text(text = "Pulsame ${number.value}", modifier = modifier.clickable {
            number.value += 1
        })

        Text(text = "Pulsame ", modifier = modifier.clickable {
            number.value += 1
        })

        Text(text = "Pulsame ", modifier = modifier.clickable {
            number.value += 1
        })

        Text(text = "Pulsame ${number.value}", modifier = modifier.clickable {
            number.value += 1
        })

        Text(text = "Pulsame ", modifier = modifier.clickable {
            number.value += 1
        })
    }
}