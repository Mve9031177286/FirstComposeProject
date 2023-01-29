package com.maximvs.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maximvs.firstcomposeproject.ui.InstagramProfileCard
import com.maximvs.firstcomposeproject.ui.theme.FirstComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeProjectTheme {  // метод из Theme.kt, для подключения темной темы (см.записи)
                Box (  // Box на весь экран, чтобы темная/светлая тема отображалась на вес экран,
                    modifier = Modifier  // а не только то, что поместилось в InstagramProfileCard()
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                ) {
                    InstagramProfileCard()
                }
            }
        }
    }
}
