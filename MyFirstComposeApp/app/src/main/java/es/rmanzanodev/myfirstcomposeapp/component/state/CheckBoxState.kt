package es.rmanzanodev.myfirstcomposeapp.component.state

data class CheckBoxState(
    val id: String,
    val label: String,
    val checked: Boolean = false
)
