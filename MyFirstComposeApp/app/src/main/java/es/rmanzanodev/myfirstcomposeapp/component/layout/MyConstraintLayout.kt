package es.rmanzanodev.myfirstcomposeapp.component.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyBasicConstraintLayout(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxMagenta, boxGray, boxYellow) = createRefs()

        Box(modifier = Modifier.size(150.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.end)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Gray).constrainAs(boxGray) {
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Green).constrainAs(boxGreen) {
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Magenta).constrainAs(boxMagenta) {
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Yellow).constrainAs(boxYellow) {
            bottom.linkTo(parent.bottom)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
        })
    }
}