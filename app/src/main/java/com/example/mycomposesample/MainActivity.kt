package com.example.mycomposesample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.mycomposesample.ui.theme.MyComposeSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyComposeSampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .size(100.dp)
                                .verticalScroll(rememberScrollState())
                        ) {
                            Button(onClick = {
                                startActivity(Intent(this@MainActivity, ListActivity::class.java))
                            }) { }
                        }

                        Column(
                            modifier = Modifier
                                .size(100.dp)
                                .verticalScroll(rememberScrollState())
                        ) {
                            Button(onClick = {
                                startActivity(Intent(this@MainActivity, ConstrainTestActivity::class.java))
                            }) { }
                        }
                    }
                }
            }
        }
    }
}
