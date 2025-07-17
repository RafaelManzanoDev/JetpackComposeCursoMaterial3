package es.rmanzanodev.myfirstcomposeapp.component.text

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyOutlinedTextFieldParent(modifier: Modifier) {
    var value by remember { mutableStateOf("") }
    Column(modifier = modifier) {
        MyOutlinedTextField(value = value) { value = it }
    }
}

@Composable
fun MyOutlinedTextField(value: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(value = value, onValueChange = { onValueChange(it) })
}