package es.rmanzanodev.myfirstcomposeapp.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyTextFieldParent(modifier: Modifier) {
    var user by remember { mutableStateOf("Aris") }
    var value by remember { mutableStateOf("") }
    Column(modifier = modifier) {
        MyTextField(user) { user = it }
        MySecondTextField(value) { value = it }
    }
}

@Composable
fun MyTextField(user: String, onUserChange: (String) -> Unit) {
    TextField(value = user, onValueChange = { onUserChange(it) }, readOnly = user.isEmpty())
}

@Composable
fun MySecondTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(value = value, onValueChange = { onValueChange(it) }, placeholder = {
        Box(Modifier
            .size(40.dp)
            .background(Color.Red))
    }, label = { Text("Introduce tu Email") })
}