package com.example.bookingflow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CabBookingDetails(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(bottomStart = 15.dp, bottomEnd = 15.dp))
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),

        ) {
        BookingId()
        TextAlignVertically(text1 = "Indica swift", text2 = "AC Sleeper (2+1)")
        DeviderView()
        CheckInCheckoutScreen(
            text1 = "From",
            text2 = "Tower A",
            text3 = "Brigade ",
            checkoutText1 = "To",
            checkoutText2 = "Terminal 2"
        )
        DeviderView()
        PickUpTimeInfoScreen()
        Spacer(modifier = Modifier.height(116.dp))
        ViewDetailsButton()
    }
}

@Preview
@Composable
private fun PickUpTimeInfoScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)) {
        Text(
            text = "Pickup Time", style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF888888),
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "16 feb, 11 pm", style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF111111),

                )
        )
    }
}