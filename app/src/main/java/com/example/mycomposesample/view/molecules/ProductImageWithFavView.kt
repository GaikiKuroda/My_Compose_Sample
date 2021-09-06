package com.example.mycomposesample.view.molecules

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposesample.view.atoms.FavoriteButton
import com.example.mycomposesample.view.atoms.ProductImage

@Composable
fun ProductImageWithFavView(imageUrl: String) {
    Box(contentAlignment = Alignment.BottomEnd) {
        ProductImage(imageUrl = imageUrl)
        FavoriteButton()
    }
}

@Preview(showBackground = true)
@Composable
fun ProductImageWithFavView() {
    ProductImageWithFavView("")
}