package com.example.lessonoverviewsheet.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewDynamicColors
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.lessonoverviewsheet.model.FilterOption
import com.example.lessonoverviewsheet.model.data.filterOptions
import com.example.lessonoverviewsheet.ui.theme.LessonOverviewSheetTheme

/**
 * Custom Image Filter Chip to meet UI requirements.
 */
@Composable
fun ImageFilterChip(
    option: FilterOption,
    modifier: Modifier = Modifier
) {

    Surface(
        shape = RoundedCornerShape(100.dp),
        color = option.backgroundColor,
        border = BorderStroke(width = 1.dp, option.borderColor),
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .padding(horizontal = 12.dp, vertical = 10.dp)
        ) {
            option.iconResId?.let { iconResId ->
                Image(
                    painter = painterResource(id = iconResId),
                    contentDescription = "${option.title} icon",
                    modifier = Modifier.size(16.dp),
                    colorFilter = ColorFilter.tint(option.tint)
                )
                Spacer(
                    modifier = Modifier.size(4.dp)
                )
                Text(
                    text = option.title,
                    color = option.contentColor,
                    style = MaterialTheme.typography.titleSmall
                )
            } ?: Text(
                text = option.title,
                color = option.contentColor,
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}

@Preview
@PreviewLightDark
@PreviewDynamicColors
@Composable
fun ImageFilterChipPreview() {
    LessonOverviewSheetTheme {
        ImageFilterChip(
            option = filterOptions[0]
        )
    }
}

@Preview
@PreviewLightDark
@PreviewDynamicColors
@Composable
fun ImageFilterChipTimePreview() {
    LessonOverviewSheetTheme {
        ImageFilterChip(
            option = filterOptions[3]
        )
    }
}