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
fun MyConstraintLayoutBarrier(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        val barrier = createEndBarrier(boxRed, boxYellow)

        Box(modifier = Modifier.size(65.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        })

        Box(modifier = Modifier.size(200.dp).background(Color.Yellow).constrainAs(boxYellow) {
            top.linkTo(boxRed.bottom, margin = 40.dp)
            start.linkTo(parent.start, margin = 32.dp)
        })

        Box(modifier = Modifier.size(70.dp).background(Color.Cyan).constrainAs(boxCyan) {
            start.linkTo(barrier)
        })
    }
}