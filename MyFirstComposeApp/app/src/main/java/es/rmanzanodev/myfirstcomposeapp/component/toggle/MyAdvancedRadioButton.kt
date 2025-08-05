package es.rmanzanodev.myfirstcomposeapp.component.toggle

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyAdvancedRadioButton(modifier: Modifier = Modifier) {
    var selectedName by remember { mutableStateOf("") }
    Column(modifier = modifier) {
        RadioButtonComponent(name = "Aris", selectedName) { selectedName = it }
        RadioButtonComponent(name = "Pepe", selectedName) { selectedName = it }
        RadioButtonComponent(name = "David", selectedName) { selectedName = it }
        RadioButtonComponent(name = "Coors", selectedName) { selectedName = it }
        RadioButtonComponent(name = "Juan", selectedName) { selectedName = it }
        RadioButtonComponent(name = "Deen", selectedName) { selectedName = it }
    }
}

@Composable
fun RadioButtonComponent(name: String, selectedName: String, onItemSelected: (String) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { onItemSelected(name) }) {
        RadioButton(
            selected = name == selectedName,
            onClick = { onItemSelected(name) }
        )
        Text(text = name)
    }
}