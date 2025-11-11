package com.example.lessonoverviewsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewDynamicColors
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.lessonoverviewsheet.model.FilterOption

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FilterChipGroup(
    filterOptions: List<FilterOption>,
    modifier: Modifier = Modifier
) {

    FlowRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = 8.dp,
                vertical = 8.dp
            ),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        filterOptions.forEach { filterOption ->
            ImageFilterChip(
                option = filterOption
            )
        }
    }
}

@Preview
@PreviewLightDark
@PreviewDynamicColors
@Composable
fun FilterChipGroupPreview() {
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

    FilterChipGroup(
        filterOptions = filterOptions
    )
}