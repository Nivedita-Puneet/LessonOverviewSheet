package com.example.lessonoverviewsheet.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class FilterOption(
    val id: String,
    val backgroundColor: Color,
    val contentColor: Color,
    val tint: Color,
    val borderColor: Color,
    val title: String,
    @DrawableRes val iconResId: Int? = null
)
