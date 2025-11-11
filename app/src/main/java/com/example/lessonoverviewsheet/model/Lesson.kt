package com.example.lessonoverviewsheet.model

data class Lesson(
    val title: String,
    val description : String,
    val keyPoints: List<KeyPointItem>
)
