package com.example.mycomposesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposesample.model.LargeCellViewItem
import com.example.mycomposesample.ui.theme.MyComposeSampleTheme
import com.example.mycomposesample.view.organisms.ItemCell
import java.util.concurrent.ThreadLocalRandom
import kotlin.random.Random

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeSampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier
                            .size(100.dp)
                            .verticalScroll(rememberScrollState())) {
                        repeat(10){

                            ItemCell(makeMockItem())

                        }

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeSampleTheme {
        ItemCell(makeMockItem())
    }
}

fun makeMockItem(): LargeCellViewItem = LargeCellViewItem(
    imageUrl = "https://www.satofull.jp/upload/save_image/177/017700010/1077427_01_1591056895.jpg",
    titleText = "タイトル：タイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトルタイトル",
    detailText = "詳細詳細詳細表示",
    price = Random.nextInt(10000,100000),
    ratings = ThreadLocalRandom.current().nextDouble(1.0, 5.0),
)
