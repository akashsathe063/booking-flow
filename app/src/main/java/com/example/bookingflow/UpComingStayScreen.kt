package com.example.bookingflow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bookingflow.navigation.HorizontalScrollTicketScreen

@Composable
fun UpComingStayScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    index: Int,
    listSize: Int = 0,
    filterButtonName: String
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
                navController.navigate(
                    HorizontalScrollTicketScreen(
                        index = index,
                        listSize,
                        filterButtonName
                    )
                )
            }

    ) {
        UpcomingImageCard()
        if (index == listSize - 1)
            BookingUpcomingDetails()
    }


}

@Preview
@Composable
fun UpcomingImageCard(
    modifier: Modifier = Modifier,
    imageCardColor: Color = Color(0xFFD22D41),
    cardImage: Painter = painterResource(id = R.drawable.baseline_home_24),
    upcomingCardName: String = "Stay At Goa",
    bookingStatus: String = "",
    bookingStatusColor: Color = Color(0xFFFEFEFE)
) {
    val bookingCompleteOrCancelled by remember {
        mutableStateOf(bookingStatus)
    }
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(imageCardColor)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 16.dp, top = 31.dp, bottom = 31.dp)
        ) {
            Image(
                painter = cardImage,
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
//            Text(
//                text = upcomingCardName,
//                fontSize = 16.sp,
//                lineHeight = 22.4.sp,
//                fontWeight = FontWeight(600),
//                color = Color(0xFFFEFEFE),
//                modifier = Modifier.padding(vertical = 5.dp)
//            )
            Column() {
                Text(
                    text = upcomingCardName,
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
                        color = bookingStatusColor,
                    )
                }
            }

        }

        Box(
            modifier = Modifier
                .padding(end = 16.dp)
                .align(Alignment.CenterEnd)
        ) {
//            Image(
//                painter = painterResource(id = R.drawable.house),
//                contentDescription = null,
//                modifier = Modifier
//                    .align(Alignment.BottomEnd)
//                    .padding(top = 13.dp)
//            )
            SetTimeAndDate()
        }


    }


}

@Preview
@Composable
fun SetTimeAndDate(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "16 Feb",
            fontSize = 16.sp,
            lineHeight = 22.4.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFFFEFEFE)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Thu, 11 am",
            fontSize = 14.sp,
            lineHeight = 19.6.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFFFEFEFE)
        )
    }
}

@Preview
@Composable
fun BookingUpcomingDetails(
    modifier: Modifier = Modifier,
    text1: String = "Check in",
    text2: String = "16 Feb",
    text3: String = "Tue, 11 pm",
    checkoutText1: String = "Check out",
    checkoutText2: String = "25 Feb",
    period: String = "9 night"
) {
    Column(
        modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
            .background(Color.White)
            .padding(bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        BookingId()
        DeviderView()
        CheckInCheckoutScreen(
            text1 = text1,
            text2 = text2,
            text3 = text3,
            checkoutText1 = checkoutText1,
            checkoutText2 = checkoutText2,
            period = period
        )
    }
}
