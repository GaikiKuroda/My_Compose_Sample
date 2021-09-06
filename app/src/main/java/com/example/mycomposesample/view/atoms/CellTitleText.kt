package com.example.mycomposesample.view.atoms

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CellTitleText(text: String) {
    Text(
        text = text,
        maxLines = 2,
        fontSize = 16.sp,
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.h6
    )
}

@Preview(showBackground = true)
@Composable
fun CellTitleTextPreview() {
    CellTitleText("タイトル・タイトルタイトルタイトルタイトルタイトル")
}