package com.example.bookingflow

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CabBookingScreen(modifier: Modifier = Modifier) {
    Column {
        BusAndCabImageCard(
            tripImage = painterResource(id = R.drawable.car_icon),
            tripLogo = painterResource(id = R.drawable.car_logo),
            cardColor = Color(0xFF2989BF),
            ticketTitle = "Cab to Hyderabad"

        )
        TicketSeparator()
        CabBookingDetails()
    }

}
