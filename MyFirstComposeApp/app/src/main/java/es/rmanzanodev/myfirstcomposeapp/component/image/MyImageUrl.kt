package es.rmanzanodev.myfirstcomposeapp.component.image

import android.util.Log
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun MyImageUrl(modifier: Modifier) {
    AsyncImage(
        model = "https://avatars.githubusercontent.com/u/184818253?v=4",
        contentDescription = null,
        modifier = modifier.size(200.dp),
        onError = {
            Log.i("Image", "Error en la image ${it.result.throwable.message}")
        }
    )
}