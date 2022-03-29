package com.metehanbolat.swipeablecomponentcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.metehanbolat.swipeablecomponentcompose.ui.theme.SwipeableComponentComposeTheme
import me.saket.swipe.SwipeAction
import me.saket.swipe.SwipeableActionsBox

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwipeableComponentComposeTheme {
                val archive = SwipeAction(
                    onSwipe = {
                        Log.d("MainActivity", "Archive")
                    },
                    icon = {
                        Icon(
                            modifier = Modifier.padding(16.dp),
                            painter = painterResource(id = R.drawable.ic_archive),
                            contentDescription = "Archive Icon",
                            tint = Color.White
                        )
                    },
                    background = Color.Green
                )

                val email = SwipeAction(
                    onSwipe = {
                        Log.d("MainActivity", "Email")
                    },
                    icon = {
                        Icon(
                            modifier = Modifier.padding(16.dp),
                            painter = painterResource(id = R.drawable.ic_email),
                            contentDescription = "Email Icon",
                            tint = Color.White
                        )
                    },
                    background = Color.Red
                )
                SwipeableActionsBox(
                    swipeThreshold = 200.dp,
                    startActions = listOf(archive),
                    endActions = listOf(email)
                ) {
                    SwipeableItem()
                }
            }
        }
    }
}

@Composable
fun SwipeableItem() {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .padding(horizontal = 16.dp)
            .padding(vertical = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(size = 50.dp))
                .background(MaterialTheme.colors.primary)
                .size(50.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier.weight(7f)
        ) {
            Text(
                text = "That's my name!",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(text = "Metehan Bolat")
        }
    }
}
