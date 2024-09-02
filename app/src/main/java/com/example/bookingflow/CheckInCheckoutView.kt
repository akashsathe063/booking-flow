package com.example.bookingflow

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckInCheckOutView(
    text1: String,
    text2: String,
    text3: String
) {
    Column {
        Text(
            text = text1,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF888888)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = text2,
            fontSize = 16.sp,
            lineHeight = 22.4.sp,
            fontWeight = FontWeight(700),
            color = Color(0xFF111111)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = text3,
            fontSize = 14.sp,
            lineHeight = 19.6.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF111111),
//            modifier = Modifier.width(90.dp),
//            minLines = 1,
//            overflow = TextOverflow.Ellipsis,
        )

    }
}

@Composable
fun CheckInCheckoutScreen(
    modifier: Modifier = Modifier,
    text1: String = "Check in",
    text2: String = "16 Feb",
    text3: String = "Tue, 11 pm",
    checkoutText1: String = "Check out",
    checkoutText2: String = "25 Feb",
    period:String = "9 nights"
) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CheckInCheckOutView(text1 = text1, text2 = text2, text3 = text3)
        StayPeriodView(period = period)
        CheckOutView(text1 = checkoutText1, text2 = checkoutText2, text3 = text3)
    }
}


@Composable
private fun CheckOutView(
    text1: String,
    text2: String,
    text3: String
) {
    Column(horizontalAlignment = Alignment.End) {
        Text(
            text = text1,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF888888)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = text2,
            fontSize = 16.sp,
            lineHeight = 22.4.sp,
            fontWeight = FontWeight(700),
            color = Color(0xFF111111)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = text3,
            fontSize = 14.sp,
            lineHeight = 19.6.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF888888),
            minLines = 1
        )

    }
}