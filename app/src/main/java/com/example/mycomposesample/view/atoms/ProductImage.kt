package com.example.mycomposesample.view.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposesample.R

@Composable
fun ProductImage(imageUrl: String) {
    Image(
        painter = painterResource(id = R.drawable._077427_01_1591056895),
        contentDescription = ""
    )
}

@Preview(showBackground = true)
@Composable
fun ProductImagePreview() {
    ProductImage("https://www.satofull.jp/upload/save_image/177/017700010/1077427_01_1591056895.jpg")
}