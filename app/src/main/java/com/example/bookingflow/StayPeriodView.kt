package com.example.bookingflow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun StayPeriodView(modifier: Modifier = Modifier, period: String = "9 night") {
    Row(verticalAlignment = Alignment.CenterVertically) {
        LeftSpacerLine()
        Box(
            Modifier
                .clip(shape = RoundedCornerShape(20.dp))
                .background(Color(0xFFF0F0F0))
        ) {
            Text(
                modifier = Modifier.padding(vertical = 4.dp, horizontal = 16.dp),
                text = period,
                fontSize = 12.sp,
                lineHeight = 16.8.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF888888)
            )
        }

        RightSpacerLine()
    }

}

@Preview
@Composable
fun LeftSpacerLine(modifier: Modifier = Modifier) {

    Spacer(
        modifier = modifier
            .width(8.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp))
            .background(Color(0xFFF0F0F0))
            .padding(1.dp)
    )
}

@Preview
@Composable
fun RightSpacerLine(modifier: Modifier = Modifier) {

    Spacer(
        modifier = modifier
            .width(8.dp)
            .clip(RoundedCornerShape(topEnd = 20.dp, bottomEnd = 20.dp))
            .background(Color(0xFFF0F0F0))
            .padding(1.dp)
    )
}