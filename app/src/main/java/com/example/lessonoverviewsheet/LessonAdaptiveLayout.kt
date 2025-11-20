package com.example.lessonoverviewsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewDynamicColors
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.lessonoverviewsheet.model.FilterOption
import com.example.lessonoverviewsheet.model.KeyPointItem
import com.example.lessonoverviewsheet.model.Lesson
import com.example.lessonoverviewsheet.ui.theme.LessonOverviewSheetTheme

/**
 *
 * A layout which is not being used currently.
 */
@Composable
fun LessonAdaptiveLayout(
    lesson: Lesson,
    isWideScreen: Boolean
) {

    val contentHorizontalAlignment =
        if (isWideScreen) Alignment.CenterHorizontally else Alignment.Start
    val contentTextAlign = if (isWideScreen) TextAlign.Center else TextAlign.Start

    val filterOptions = listOf(
        FilterOption(
            id = "intermediate",
            backgroundColor = Color(color = 0xffEFEFFC),
            contentColor = Color(color = 0xff6B74F8),
            borderColor = Color.Transparent,
            title = "Intermediate",
            tint = Color(color = 0xff6B74F8),
            iconResId = R.drawable.icon
        ),
        FilterOption(
            id = "science",
            backgroundColor = Color(color = 0xffE5FBF2),
            contentColor = Color(color = 0xff03A564),
            borderColor = Color.Transparent,
            title = "Science",
            tint = Color(color = 0xff03A564)
        ),
        FilterOption(
            id = "physics",
            backgroundColor = Color(color = 0xffE5FBf2),
            contentColor = Color(color = 0xff03A564),
            borderColor = Color.Transparent,
            title = "Physics",
            tint = Color(color = 0xff03A564)
        ),
        FilterOption(
            id = "time",
            backgroundColor = Color(color = 0xffFFFFFF),
            contentColor = Color(color = 0xff4C4F59),
            borderColor = Color(color = 0xffE5E5E9),
            title = "15 mins",
            tint = Color(color = 0xff6B74F8),
            iconResId = R.drawable.clock
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            // This top padding creates the space where the header will live,
            // on top of the 'statusBarColor' background.
            .padding(top = 64.dp) // Adjust this value to control header space
            .clip(RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp))
            .background(color = Color(color = 0xffFFFFFF))
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = contentHorizontalAlignment
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentPadding = WindowInsets.safeDrawing.asPaddingValues(),
            horizontalAlignment = contentHorizontalAlignment
        ) {
            item {
                LessonHeader(
                    title = lesson.title,
                    description = lesson.description,
                    textAlign = contentTextAlign,
                    isWideScreen = isWideScreen
                )
            }

            // ITEM 2: The filter chips.
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    FilterChipGroup(
                        filterOptions = filterOptions,
                        modifier = Modifier.align(
                            if (isWideScreen) Alignment.Center else Alignment.CenterStart
                        )
                    )
                }
            }

            item {
                Spacer(
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(color = Color(color = 0xffE5E5E9))
                )
            }

            item {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = 16.dp,
                            vertical = 10.dp
                        ),
                    text = "What you'll learn:",
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Start,
                    color = Color(0xff13182C)
                )
            }

            items(lesson.keyPoints) { item: KeyPointItem ->
                KeyPointRow(item = item)
            }
        }
        AuthorInfoRow(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 16.dp)
        )
    }
}

@Preview
@PreviewLightDark
@PreviewDynamicColors
@Composable
fun LessonAdaptiveLayoutPreview() {
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
        LessonAdaptiveLayout(
            lesson = lesson,
            isWideScreen = false
        )
    }
}