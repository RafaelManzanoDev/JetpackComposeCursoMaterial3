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
fun MyConstraintLayoutExercise(modifier: Modifier) {
    val sizeSmallBox = 75.dp
    val sizeBigBox = 175.dp
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxMagenta, boxGray, boxYellow, boxBlue, boxDarkGray, boxCyan, boxBlack) = createRefs()

        Box(modifier = Modifier
            .size(sizeBigBox)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                top.linkTo(boxYellow.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

        Box(modifier = Modifier
            .size(sizeSmallBox)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                bottom.linkTo(parent.bottom)
                top.linkTo(parent.top)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
            })

        Box(modifier = Modifier
            .size(sizeSmallBox)
            .background(Color.Gray)
            .constrainAs(boxGray) {
                end.linkTo(boxYellow.start)
                top.linkTo(boxYellow.bottom)
            })

        Box(modifier = Modifier
            .size(sizeSmallBox)
            .background(Color.Red)
            .constrainAs(boxRed) {
                start.linkTo(boxYellow.end)
                top.linkTo(boxYellow.bottom)
            })

        Box(
            modifier = Modifier
                .size(sizeSmallBox)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    end.linkTo(boxYellow.start)
                    bottom.linkTo(boxYellow.top)
                })

        Box(modifier = Modifier
            .size(sizeSmallBox)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                start.linkTo(boxYellow.end)
                bottom.linkTo(boxYellow.top)
            })

        Box(modifier = Modifier
            .size(sizeSmallBox)
            .background(Color.Black)
            .constrainAs(boxBlack) {
                start.linkTo(boxCyan.end)
                end.linkTo(boxDarkGray.start)
                top.linkTo(boxCyan.top)
                bottom.linkTo(boxCyan.bottom)
            })

        Box(modifier = Modifier
            .size(sizeBigBox)
            .background(Color.Cyan)
            .constrainAs(boxCyan) {
                bottom.linkTo(boxMagenta.top)
                end.linkTo(boxMagenta.end)
            })

        Box(
            modifier = Modifier
                .size(sizeBigBox)
                .background(Color.DarkGray)
                .constrainAs(boxDarkGray) {
                    bottom.linkTo(boxGreen.top)
                    start.linkTo(boxGreen.start)
                })
    }
}