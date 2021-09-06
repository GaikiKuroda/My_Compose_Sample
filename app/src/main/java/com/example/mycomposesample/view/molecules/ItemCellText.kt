package com.example.mycomposesample.view.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposesample.view.atoms.CellTitleText
import com.example.mycomposesample.view.atoms.PriceView

@Composable
fun ItemCellText(titleText: String, detailText: String, price: Int) {
    Column() {
        CellTitleText(text = titleText)
        PriceView(price)
        Text(
            text = detailText,
            style = MaterialTheme.typography.subtitle1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LargeCellTextPreview() {
    ItemCellText(
        titleText = "タイトル：タイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトル",
        detailText = "詳細詳細",
        price = 39800
    )
}