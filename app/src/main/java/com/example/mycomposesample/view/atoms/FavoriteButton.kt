package com.example.mycomposesample.view.atoms

import androidx.compose.animation.animateColorAsState
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.colorResource
import com.example.mycomposesample.R

@Composable
fun FavoriteButton() {
    val checked = remember { mutableStateOf(false) }
    IconToggleButton(checked = checked.value, onCheckedChange = { checked.value = it }) {
        val tint = animateColorAsState(
            targetValue = if (checked.value) {
                colorResource(id = R.color.fav_on)
            } else {
                colorResource(id = R.color.fav_off)
            }
        )
        Icon(Icons.Filled.Favorite, contentDescription = "", tint = tint.value)
    }
}