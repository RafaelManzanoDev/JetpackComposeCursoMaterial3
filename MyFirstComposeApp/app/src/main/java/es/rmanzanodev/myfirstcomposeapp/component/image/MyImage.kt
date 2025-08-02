package es.rmanzanodev.myfirstcomposeapp.component.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.rmanzanodev.myfirstcomposeapp.R

@Preview
@Composable
fun MyImage() {
    Image(
        painter = painterResource(R.drawable.payaso),
        contentDescription = "Avatar Image Profile",
        modifier = Modifier.height(200.dp).width(30.dp),
        contentScale = ContentScale.FillWidth
    )
}