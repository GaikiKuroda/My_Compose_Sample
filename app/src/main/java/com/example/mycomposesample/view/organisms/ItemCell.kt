package com.example.mycomposesample.view.organisms

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.mycomposesample.model.LargeCellViewItem
import com.example.mycomposesample.view.molecules.ItemCellText
import com.example.mycomposesample.view.molecules.ProductImageWithFavView
import com.example.mycomposesample.view.molecules.StarView

@Composable
fun ItemCell(viewItem: LargeCellViewItem) {
    ConstraintLayout(
        modifier = Modifier.padding(16.dp)
    ) {

        val (productImage, cellText, starView) = createRefs()

        Box(
            modifier = Modifier.constrainAs(productImage) {
                top.linkTo(parent.top)
                bottom.linkTo(cellText.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            ProductImageWithFavView(viewItem.imageUrl)
        }

        Box(
            modifier = Modifier.constrainAs(cellText) {
                top.linkTo(productImage.bottom)
                bottom.linkTo(starView.top)
                start.linkTo(productImage.start)
                end.linkTo(productImage.end)
                width = Dimension.fillToConstraints
            }
        ) {
            ItemCellText(
                titleText = viewItem.titleText,
                detailText = viewItem.detailText,
                price = viewItem.price
            )
        }

        Box(
            modifier = Modifier.constrainAs(starView) {
                top.linkTo(cellText.bottom)
                bottom.linkTo(parent.top)
                start.linkTo(productImage.start)
            }
        ) {

            StarView(viewItem.ratings)
        }


    }
}

@Preview(showBackground = true)
@Composable
fun ItemCellPreview() {
    val item = LargeCellViewItem(
        imageUrl = "https://www.satofull.jp/upload/save_image/177/017700010/1077427_01_1591056895.jpg",
        titleText = "タイトル：タイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトル",
        detailText = "詳細詳細",
        price = 39800,
        ratings = 2.5,
    )
    ItemCell(item)
}