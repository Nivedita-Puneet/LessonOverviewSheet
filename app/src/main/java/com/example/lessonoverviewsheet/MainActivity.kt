package com.example.lessonoverviewsheet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lessonoverviewsheet.model.KeyPointItem
import com.example.lessonoverviewsheet.model.Lesson
import com.example.lessonoverviewsheet.ui.theme.LessonOverviewSheetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            val lesson = Lesson(
                title = "Physics Crash Course",
                description = "The Physics Crash Course offers a foundational overview of essential concepts, teaching learners to understand Newton’s three laws of motion, explain the principle of energy conservation, distinguish between kinetic and potential energy with real-world examples, solve basic problems involving force and mass, and apply the concept of momentum in everyday situations.",
                keyPoints = listOf(
                    KeyPointItem(
                        title = "Understand Newton's three laws of motion",
                        imageResId = R.drawable.bullet_point
                    ),
                    KeyPointItem(
                        title = "Explain the principle of energy conservation",
                        imageResId = R.drawable.bullet_point
                    ),
                    KeyPointItem(
                        title = "Identify real-world examples of kinetic and potential energy",
                        imageResId = R.drawable.bullet_point
                    ),
                    KeyPointItem(
                        title = "Solve simple Physics problems involving Force and mass",
                        imageResId = R.drawable.bullet_point
                    ),
                    KeyPointItem(
                        title = "Apply concepts of momentum in everyday scenarios",
                        imageResId = R.drawable.bullet_point
                    )
                )
            )
            LessonOverviewSheetTheme {
                LessonOverview(lesson = lesson)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LessonOverviewSheetTheme {
        Greeting("Android")
    }
}