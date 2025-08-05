package es.rmanzanodev.myfirstcomposeapp.component.toggle

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import es.rmanzanodev.myfirstcomposeapp.component.state.CheckBoxState

@Composable
fun MyAdvancedCheckBox(modifier: Modifier) {
    var state by remember {
        mutableStateOf(
            listOf(
                CheckBoxState(id = "terms", "Aceptar los términos y condiciones"),
                CheckBoxState(id = "newsletter", "Recibir la newsletter", checked = true),
                CheckBoxState(id = "updates", "Recibir actualizaciones")
            )
        )
    }
    Column(modifier = modifier.fillMaxSize()) {
        state.forEach { myState ->
            MyCheckBoxWithText(checkBoxState = myState) {
                state = state.map {
                    if (it.id == myState.id) {
                        myState.copy(checked = !myState.checked)
                    } else {
                        it
                    }
                }
            }
        }
    }
}

@Composable
fun MyCheckBoxWithText(
    modifier: Modifier = Modifier,
    checkBoxState: CheckBoxState,
    onCheckChange: (CheckBoxState) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { onCheckChange(checkBoxState) }) {
        Checkbox(
            checked = checkBoxState.checked,
            onCheckedChange = { onCheckChange(checkBoxState) },
            enabled = true,
        )
        Spacer(Modifier.width(12.dp))
        Text(text = checkBoxState.label)
    }
}