package com.maximvs.firstcomposeproject.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maximvs.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import com.maximvs.firstcomposeproject.R

@Composable
fun InstagramProfileCard() {
    Card(  // вызвал функцию Card (импортирую), есть параметры: бордер, шейп, элеватион и пр.
        modifier = Modifier
            .padding(8.dp),
        shape = RoundedCornerShape(
            topStart = 6.dp,
            topEnd = 6.dp,
        ),
        backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.photo_inst),
                    contentDescription = "image", // обязательный параметр, системный
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(8.dp)


                )
                // данные, прописанные далее, в настоящем приложении получают из вью модели
                UserStatistics(
                    title = "Posts",
                    value = "6,950"
                )  // а пока указываю случайным образом
                UserStatistics(title = "Followers", value = "436M")
                UserStatistics(title = "Folloving", value = "76")
            }
            Text(
                text = "Instagram",
                fontSize = 32.sp,
                fontFamily = FontFamily.Cursive
            )
            Text(
                text = "#YousrToMake",
                fontSize = 14.sp
            )
            Text(
                text = "www.facebook.com",
                fontSize = 14.sp
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Follow")
            }
        }

    }
}

@Composable
private fun UserStatistics(  // функция принимает в качестве параметров:
    title: String,  //  заголовок
    value: String   // значение
) {
    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value,
            fontSize = 24.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewCardLight() {
    FirstComposeProjectTheme(
        darkTheme = false
    ) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewCardDark() {
    FirstComposeProjectTheme(
        darkTheme = true
    ) {
        InstagramProfileCard()
    }
}