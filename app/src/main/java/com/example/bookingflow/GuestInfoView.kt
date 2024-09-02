package com.example.bookingflow

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GuestInfoView(modifier: Modifier = Modifier) {
    Column(modifier.padding(horizontal = 16.dp)) {
        Text(
            text = "Guests",
            fontSize = 14.sp,
            lineHeight = 19.6.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF888888)
        )
        Row {
            Text(
                text = "Sushavon Paul Sushavon Paul Sushavon Paul",
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF111111),
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "+1 adult, 2 children",
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF888888)
            )
        }
    }

}