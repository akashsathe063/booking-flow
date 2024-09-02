package com.example.bookingflow

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun StayCompleteScreen(modifier: Modifier = Modifier) {
    Column {
        StayImageCard(
            tripImage = painterResource(id = R.drawable.icon_home),
            tripLogo = painterResource(id = R.drawable.stay_complete_logo),
            cardColor = Color(0xFF464646),
            bookingStatus = "Completed"
        )
        TicketSeparator()
        StayDetailBookingScreen()
    }
}