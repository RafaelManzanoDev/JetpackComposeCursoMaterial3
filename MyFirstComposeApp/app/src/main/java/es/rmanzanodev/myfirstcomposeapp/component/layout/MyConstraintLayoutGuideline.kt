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
fun MyConstraintLayoutExampleGuideline(modifier: Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val boxRed = createRef()
        //val topGuide = createGuidelineFromTop(25.dp)
        val topGuide = createGuidelineFromTop(0.1f)

        Box(modifier = Modifier.size(150.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(topGuide)
        })
    }
}