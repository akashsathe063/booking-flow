package com.example.bookingflow

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@Composable
fun TextAlignVertically(modifier: Modifier = Modifier,text1:String = "Sunny Beach Villa", text2:String = "Manali, Himachal Pradesh") {
    Column(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)) {
        Text(
            text = text1,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF111111)
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = text2,
            fontSize = 14.sp,
            lineHeight = 19.8.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF888888)
        )
    }
}