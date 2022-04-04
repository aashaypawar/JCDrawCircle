package com.geeksforgeeks.jcdrawcircle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Creating a Simple Scaffold Layout for the application
            Scaffold(

                // Creating a Top Bar
                topBar = { TopAppBar(title = { Text("GFG | Draw Circle", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },

                // Creating Content
                content = {

                    // Creating a Column Layout
                    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                        // 1. OUTLINED CIRCLE
                        Row(Modifier.fillMaxWidth().height(100.dp)) {
                            // Creating a Canvas to draw a Circle
                            Canvas(modifier = Modifier.fillMaxSize()) {
                                val canvasWidth = size.width
                                val canvasHeight = size.height

                                drawCircle(
                                    color = Color(0xff0f9d58),
                                    center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
                                    radius = size.minDimension/2,
                                    style = Stroke(10F)
                                )
                            }
                        }

                        // Adding a Space of height 100dp
                        Spacer(modifier = Modifier.height(50.dp))

                        // 2. DASH_PATH_EFFECT CIRCLE
                        Row(Modifier.fillMaxWidth().height(100.dp)) {
                            // Creating a Canvas to draw a Circle
                            Canvas(modifier = Modifier.fillMaxSize()) {
                                val canvasWidth = size.width
                                val canvasHeight = size.height

                                drawCircle(
                                    color = Color(0xff0f9d58),
                                    center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
                                    radius = size.minDimension/2,
                                    style = Stroke(width = 8f, pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f))
                                )
                            }
                        }

                        // Adding a Space of height 100dp
                        Spacer(modifier = Modifier.height(50.dp))

                        // 3. FILLED CIRCLE
                        Row(Modifier.fillMaxWidth().height(100.dp)) {
                            // Creating a Canvas to draw a Circle
                            Canvas(modifier = Modifier.fillMaxSize()) {
                                val canvasWidth = size.width
                                val canvasHeight = size.height

                                drawCircle(
                                    color = Color(0xff0f9d58),
                                    center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
                                    radius = size.minDimension/2
                                )

                            }
                        }

                        // Adding a Space of height 100dp
                        Spacer(modifier = Modifier.height(50.dp))

                        // 4. OUTLINED (Color1) - FILLED (Color2) CIRCLE
                        Row(Modifier.fillMaxWidth().height(100.dp)) {
                            // Creating a Canvas to draw a Circle
                            Canvas(modifier = Modifier.fillMaxSize()) {
                                val canvasWidth = size.width
                                val canvasHeight = size.height

                                drawCircle(
                                    color = Color.Black,
                                    center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
                                    radius = size.minDimension/1.9F
                                )

                                drawCircle(
                                    color = Color(0xff0f9d58),
                                    center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
                                    radius = size.minDimension/2
                                )

                            }
                        }
                    }
                }
            )
        }
    }
}
