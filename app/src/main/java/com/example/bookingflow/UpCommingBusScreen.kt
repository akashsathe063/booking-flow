package com.example.bookingflow

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bookingflow.navigation.HorizontalScrollTicketScreen

//@Preview
@Composable
fun UpComingBusScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    index: Int,
    listSize: Int = 0,
    filterButton:String
) {
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
                shape = RoundedCornerShape(size = 20.dp)
            )
            .clickable {
                navController.navigate(HorizontalScrollTicketScreen(index = index, listSize,filterButton))
            }

    ) {
        UpcomingImageCard(
            imageCardColor = Color(0xFF209B60),
            cardImage = painterResource(id = R.drawable.bus_trip_img),
            upcomingCardName = "Bus to Pune"
        )
        if (index == listSize - 1) {
            BookingUpcomingDetails(
                text1 = "From",
                text2 = "Tower A",
                text3 = "Brigade me..",
                checkoutText1 = "Arrival",
                checkoutText2 = "Termenal 2"
            )
        }
    }

}
