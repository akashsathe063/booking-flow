package com.example.bookingflow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
 fun BusDetailBookingScreen(modifier: Modifier = Modifier) {
    Column( modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
        .clip(RoundedCornerShape(bottomStart = 15.dp, bottomEnd = 15.dp))
        .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,) {
        BookingId()
        TextAlignVertically(text1 = "Yolo bus", text2 = "AC Sleeper (2+1)")
        DeviderView()
        CheckInCheckoutScreen(text1 = "Departure", text2 = "Bengaluru", text3 = "16 feb, 11 pm", checkoutText1 = "Arrival", checkoutText2 = "Pune")
        DeviderView()
        SeatdetailScreen()
        Spacer(modifier = Modifier.height(68.dp))
        ViewDetailsButton()
    }
}