package com.example.bookingflow

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CompletetdStayCard(modifier: Modifier = Modifier, index: Int = 0, listSize: Int = 0) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .shadow(
                elevation = 20.dp,
                spotColor = Color(0x40000000),
                ambientColor = Color(0x40000000)
            )
            .border(
                width = 1.dp,
                color = Color(0x33FEFEFE),
                shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
            )
//            .clickable { navController.navigate(HorizontalScrollTicketScreen(index = index)) }
    ) {
        UpcomingImageCard(imageCardColor = Color(0xFF464646))
        if (index == listSize - 1) {
            BookingUpcomingDetails()
        }
    }
}