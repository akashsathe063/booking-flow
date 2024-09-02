package com.example.bookingflow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun StayBookingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        StayImageCard()
        TicketSeparator()
        StayDetailBookingScreen()
    }
}

//@Preview(showBackground = true)
//@Composable
//fun LazyRowImp() {
//    LazyRow {
//        items(10) {
//            Box(
//                Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 16.dp)
//            ) {
//                StayBookingScreen()
//            }
//        }
//    }
//}

//@Preview
//@Composable
//fun ReviewCard() {
//    Column(
//        modifier = Modifier
//            .width(300.dp)
//            .background(Color.Black)
//    ) {
//        Text(modifier = Modifier.fillMaxWidth(), text = "Abhishek", color = Color.White)
//        Text(modifier = Modifier.fillMaxWidth(), text = "Good Product", color = Color.White)
//        Text(modifier = Modifier.fillMaxWidth(), text = "5 Rating", color = Color.White)
//    }
//}


@Composable
fun TicketSeparator(modifier: Modifier = Modifier) {
    Box(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.curved_img),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp),
            contentScale = ContentScale.FillBounds
        )
    }

}

@Preview
@Composable
fun StayImageCard(
    modifier: Modifier = Modifier,
    tripImage: Painter = painterResource(id = R.drawable.icon_home),
    tripLogo: Painter = painterResource(id = R.drawable.house),
    cardColor: Color = Color(0xFFD22D41),
    bookingStatus: String = ""
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
            Column() {
                Text(
                    text = "Stay At goa",
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
                    .padding(top = 13.dp, end = 16.dp)
            )
        }

    }


}

