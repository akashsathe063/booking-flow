package com.example.bookingflow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
 fun BusBookingScreen(modifier: Modifier = Modifier) {
    Column( modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black)) {
        BusAndCabImageCard()
        TicketSeparator()
        BusDetailBookingScreen()

    }

}

@Preview
@Composable
fun BusAndCabImageCard(
    modifier: Modifier = Modifier,
    tripImage: Painter = painterResource(id = R.drawable.bus_trip_img),
    tripLogo: Painter = painterResource(id = R.drawable.bus_logo),
    cardColor: Color = Color(0xFF209B60),
    bookingStatus: String = "",
    ticketTitle:String = "Bus To Hyderabad"
) {
    val bookingCompleteOrCancelled by remember {
        mutableStateOf(bookingStatus)
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
            .background(cardColor)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 16.dp, top = 31.dp)
        ) {
            Image(
                painter = tripImage,
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = ticketTitle,
                    fontSize = 16.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFEFEFE),
                    modifier = if (bookingCompleteOrCancelled.isNotEmpty()) {
                        Modifier
                            .padding(top = 5.dp)
                    } else {
                        Modifier
                            .padding(vertical = 5.dp)
                    }

                )
                if (bookingCompleteOrCancelled.isNotEmpty()) {
                    Text(
                        text = bookingCompleteOrCancelled,
                        fontSize = 12.sp,
                        lineHeight = 16.8.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFEFEFE),
                    )
                }
            }


        }

        Box(
            modifier = modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = tripLogo,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(top = 13.dp)
            )
        }

    }

}

@Preview
@Composable
fun SeatdetailScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxWidth()
        .background(Color(0xFFFEFEFE))
        .padding(horizontal = 16.dp)) {
        Text(
            text = "Seats",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF888888)
            )
        )

        LazyColumn {
            items(5) {
                SeatdetailListItem()
            }
        }

    }
}

@Preview
@Composable
fun SeatdetailListItem(modifier: Modifier = Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Sushavon Paul", style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF111111)
            )
        )
        Text(
            text = "S25", style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF111111)
            )
        )

    }
}