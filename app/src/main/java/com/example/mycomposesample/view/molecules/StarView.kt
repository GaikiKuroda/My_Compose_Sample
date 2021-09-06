package com.example.mycomposesample.view.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposesample.view.atoms.EmptyStar
import com.example.mycomposesample.view.atoms.FullStar
import com.example.mycomposesample.view.atoms.HalfStar

@Composable
fun StarView(rating: Double) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        val fullStar = rating - (rating % 1)

        for (i in 0 until 5) {
            when {
                fullStar - i > 0 -> {
                    FullStar()
                }
                rating - i >= 0.5 -> {
                    HalfStar()
                }
                else -> {
                    EmptyStar()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StarViewPreview() {
    StarView(3.5)
}