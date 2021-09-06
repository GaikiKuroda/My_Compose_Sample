package com.example.mycomposesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.mycomposesample.ui.theme.MyComposeSampleTheme

class ConstrainTestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row() {
        ConstraintLayout(
            modifier = Modifier.padding(16.dp)
        ) {

            val (image, text) = createRefs()

            Box(
                modifier = Modifier.constrainAs(image) {
                    top.linkTo(parent.top)
                    bottom.linkTo(text.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.seihoukei),
                    contentDescription = ""
                )
            }

            Box(
                modifier = Modifier.constrainAs(text) {
                    top.linkTo(image.bottom)
                    bottom.linkTo(parent.top)
                    start.linkTo(image.start)
                    end.linkTo(image.end)
                    width = Dimension.fillToConstraints
                }
            ) {
                Text(
                    text = "textテキストtextテキストtextテキストtextテキストtextテキストtextテキストtextテキスト",
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.subtitle1
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MyComposeSampleTheme {
        Greeting("Android")
    }
}