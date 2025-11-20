package com.example.lessonoverviewsheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewDynamicColors
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.lessonoverviewsheet.model.KeyPointItem
import com.example.lessonoverviewsheet.ui.theme.LessonOverviewSheetTheme

@Composable
fun KeyPointRow(
    item: KeyPointItem,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            modifier = Modifier.size(20.dp),
            painter = painterResource(id = item.imageResId),
            contentDescription = null
        )
        Text(
            text = item.title,
            style = MaterialTheme.typography.bodyLarge,
            color = Color(color = 0xff13182C)
        )
    }
}

@Preview
@PreviewLightDark
@PreviewDynamicColors
@Composable
fun KeyPointRowPreview() {
    LessonOverviewSheetTheme {

        val item = KeyPointItem(
            title = "Understand Newton's three laws of motion",
            imageResId = R.drawable.bullet_point
        )

        KeyPointRow(
            item = item,
            modifier = Modifier.background(color = Color(0xffFFFFFF))
        )
    }
}