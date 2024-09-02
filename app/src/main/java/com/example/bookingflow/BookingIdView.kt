package com.example.bookingflow

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@Composable
fun BookingId(
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.8.sp,
        fontWeight = FontWeight(400),
        color = Color(0xFF888888)
    )
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),

    ) {
        Text(text = "Booking ID", style = textStyle)
        Text(text = "RM24252302086694", style = textStyle)
    }
}