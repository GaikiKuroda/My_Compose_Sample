package com.example.mycomposesample.view.atoms

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposesample.R

@Composable
fun PriceView(price: Int) {
    Text(text = price.toPriceString(), color = colorResource(id = R.color.price_text_red))
}

private fun Int.toPriceString(): String =
    "%,d".format(this) + "円"


@Preview(showBackground = true)
@Composable
fun PriceViewPreview() {
    PriceView(19800)
}