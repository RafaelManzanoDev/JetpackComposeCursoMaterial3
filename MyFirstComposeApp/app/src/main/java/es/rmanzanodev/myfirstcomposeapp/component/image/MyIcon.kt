package es.rmanzanodev.myfirstcomposeapp.component.image

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.rmanzanodev.myfirstcomposeapp.R

@Preview
@Composable
fun MyIcon(){
    Icon(
        painter = painterResource(R.drawable.ic_personita),
        contentDescription = null,
        modifier = Modifier.size(300.dp),
        tint = Color.Blue
    )
}