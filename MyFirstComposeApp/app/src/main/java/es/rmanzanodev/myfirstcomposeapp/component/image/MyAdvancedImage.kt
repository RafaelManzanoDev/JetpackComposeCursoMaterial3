package es.rmanzanodev.myfirstcomposeapp.component.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.rmanzanodev.myfirstcomposeapp.R

@Preview
@Composable
fun MyAdvancedImage() {
    Image(
        painter = painterResource(R.drawable.payaso),
        contentDescription = "Avatar Image Profile",
        modifier = Modifier.size(300.dp)
            .clip(RoundedCornerShape(50))
            .border(
                width = 5.dp,
                brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Blue, Color.Yellow)),
                shape = CircleShape
            )
        ,
        contentScale = ContentScale.FillWidth
    )
}