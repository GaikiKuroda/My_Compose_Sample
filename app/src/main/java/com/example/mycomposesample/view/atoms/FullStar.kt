package com.example.mycomposesample.view.atoms

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mycomposesample.R

@Composable
fun FullStar() {
    Icon(
        painter = painterResource(id = R.drawable.star_black),
        contentDescription = "",
        Modifier.size(20.dp)
    )
}