package es.rmanzanodev.myfirstcomposeapp.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun MyTexts(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = "Text")
        Text(text = "Color Red", color = Color.Red)
        Text(text = "FontSize", fontSize = 25.sp)
        Text(text = "FontStyle", fontStyle = FontStyle.Italic)
        Text(text = "FontWeight", fontWeight = FontWeight.ExtraBold)
        Text(
            text = "FontWeight, FontStyle, FontSize",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic
        )
        Text(text = "LetterSpacing", letterSpacing = 20.sp)
        Text(text = "TextDecoration", textDecoration = TextDecoration.LineThrough)
        Text(
            text = "TextDecoration Combine",
            textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )
        Text(
            text = "Align",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Align Max Lines 1, se usa para cuando no queremos mas de una linea, pero usamos" +
                    "overflow para ponerle un final",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }

}