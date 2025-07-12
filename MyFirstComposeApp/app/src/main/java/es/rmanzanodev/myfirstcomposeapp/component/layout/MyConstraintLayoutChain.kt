package es.rmanzanodev.myfirstcomposeapp.component.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyConstraintLayoutChain(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()

        Box(modifier = Modifier.size(100.dp).background(Color.Red).constrainAs(boxRed) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(boxYellow.top)
        })

        Box(modifier = Modifier.size(100.dp).background(Color.Yellow).constrainAs(boxYellow) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(boxRed.bottom)
            bottom.linkTo(boxCyan.top)
        })

        Box(modifier = Modifier.size(100.dp).background(Color.Cyan).constrainAs(boxCyan) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(boxYellow.bottom)
            bottom.linkTo(parent.bottom)
        })

        createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.SpreadInside)
    }
}