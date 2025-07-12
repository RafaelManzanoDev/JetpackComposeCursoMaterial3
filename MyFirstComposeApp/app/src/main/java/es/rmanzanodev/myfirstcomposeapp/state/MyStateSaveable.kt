package es.rmanzanodev.myfirstcomposeapp.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyStateSaveable(modifier: Modifier) {
    var number by rememberSaveable { mutableIntStateOf(0) }
    Column {
        Text(text = "Pulsame $number", modifier = modifier.clickable {
            number += 1
        })

        Text(text = "Pulsame $number", modifier = modifier.clickable {
            number += 1
        })
    }
}