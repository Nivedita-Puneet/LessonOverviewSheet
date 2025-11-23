package com.example.lessonoverviewsheet.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewDynamicColors
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.lessonoverviewsheet.model.FilterOption
import com.example.lessonoverviewsheet.model.data.filterOptions

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FilterChipGroup(
    filterOptions: List<FilterOption>,
    modifier: Modifier = Modifier
) {

    FlowRow(
        modifier = modifier
            .wrapContentWidth()
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
    FilterChipGroup(
        filterOptions = filterOptions
    )
}