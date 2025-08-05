package es.rmanzanodev.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import es.rmanzanodev.myfirstcomposeapp.component.progress.MyAdvancedProgressIndicator
import es.rmanzanodev.myfirstcomposeapp.component.progress.MyAnimationProgressIndicator
import es.rmanzanodev.myfirstcomposeapp.component.progress.MyCircularProgressIndicator
import es.rmanzanodev.myfirstcomposeapp.component.progress.MyLinearProgressIndicator
import es.rmanzanodev.myfirstcomposeapp.component.slider.MySlider
import es.rmanzanodev.myfirstcomposeapp.component.toggle.MyAdvancedCheckBox
import es.rmanzanodev.myfirstcomposeapp.component.toggle.MyAdvancedRadioButton
import es.rmanzanodev.myfirstcomposeapp.component.toggle.MyCheckBox
import es.rmanzanodev.myfirstcomposeapp.component.toggle.MyRadioButton
import es.rmanzanodev.myfirstcomposeapp.component.toggle.MySwitch
import es.rmanzanodev.myfirstcomposeapp.component.toggle.MyTriStateCheckBox
import es.rmanzanodev.myfirstcomposeapp.login.Greeting
import es.rmanzanodev.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MySlider(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
        Greeting("Android")
    }
}