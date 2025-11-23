package com.example.lessonoverviewsheet.model.data

import androidx.compose.ui.graphics.Color
import com.example.lessonoverviewsheet.R
import com.example.lessonoverviewsheet.model.FilterOption
import com.example.lessonoverviewsheet.model.KeyPointItem
import com.example.lessonoverviewsheet.model.Lesson

val overviewSheetDataSource = Lesson(
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
        backgroundColor = Color(color = 0xffE5E5E9),
        contentColor = Color(color = 0xff4C4F59),
        borderColor = Color(color = 0xff4C4F59),
        title = "15 mins",
        tint = Color(color = 0xff6B74F8),
        iconResId = R.drawable.clock
    )
)
