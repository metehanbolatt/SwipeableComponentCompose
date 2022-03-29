package com.metehanbolat.swipeablecomponentcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.swipeablecomponentcompose.ui.theme.SwipeableComponentComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwipeableComponentComposeTheme {

            }
        }
    }
}
