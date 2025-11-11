package com.example.lessonoverviewsheet.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.lessonoverviewsheet.R

val Poltawskinowy = FontFamily(
    Font(
        resId = R.font.poltawskinowy_regular,
        weight = FontWeight.Normal
    ),
    Font(
        resId = R.font.poltawskinowy_bold,
        weight = FontWeight.Bold
    ),
    Font(
        resId = R.font.poltawskinowy_semibold,
        weight = FontWeight.SemiBold
    ),
    Font(
        resId = R.font.poltawskinowy_medium,
        weight = FontWeight.Medium
    ),
    Font(
        resId = R.font.poltawskinowy_medium_italic,
        weight = FontWeight.Medium
    ),
    Font(
        resId = R.font.poltawskinowy_semibold_italic,
        weight = FontWeight.SemiBold
    )
)

val Montserrat = FontFamily(
    Font(
        resId = R.font.montserrat_regualr,
        weight = FontWeight.Normal
    )
)

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = Poltawskinowy,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    titleSmall = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Light,
        fontSize = 18.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp
    )
)