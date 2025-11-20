package com.example.lessonoverviewsheet

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewDynamicColors
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.lessonoverviewsheet.model.KeyPointItem
import com.example.lessonoverviewsheet.model.Lesson
import com.example.lessonoverviewsheet.ui.theme.LessonOverviewSheetTheme

@Composable
fun LessonOverview(
    modifier: Modifier = Modifier,
    lesson: Lesson,
    backgroundColor: Color = Color(0xff6B74F8)
) {
    val view = LocalView.current

    SideEffect {
        val window = (view.context as Activity).window
        val insetsController = WindowCompat.getInsetsController(window, view)

        insetsController.isAppearanceLightStatusBars = false
        insetsController.isAppearanceLightNavigationBars = false
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val isWideScreen = maxWidth > 600.dp

            LessonAdaptiveScreen(
                lesson = lesson,
                isWideScreen = isWideScreen
            )
        }

    }
}

@Composable
fun LessonHeader(
    title: String,
    description: String,
    textAlign: TextAlign,
    isWideScreen: Boolean
) {
    val layoutPadding = if (isWideScreen) {
        PaddingValues(horizontal = 24.dp, vertical = 16.dp)
    } else {
        PaddingValues(horizontal = 8.dp, vertical = 8.dp)
    }

    val headerPadding = PaddingValues(
        top = 16.dp,
        bottom = 8.dp,
        start = 8.dp,
        end = 8.dp
    )

    Column(
        modifier = Modifier.padding(layoutPadding)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    headerPadding
                ),
            text = title,
            textAlign = textAlign,
            style = MaterialTheme.typography.titleLarge,
            color = Color(0xff13182C) // Readable on the header color
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            text = description,
            textAlign = textAlign,
            style = MaterialTheme.typography.bodyMedium,
            color = Color(color = 0xff4C4F59)
        )
    }
}

@Preview
@PreviewLightDark
@PreviewDynamicColors
@Composable
fun LessonOverviewPreview() {
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
        LessonOverview(
            lesson = lesson
        )
    }
}
