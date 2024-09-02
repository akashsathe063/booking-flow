package com.example.bookingflow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//@Preview
@Composable
fun HorizontalScrollBookingTicket(
    index:Int,
    size:Int,
    filterButtonName:String,
//    bookingTickets: List<UpComingCards> = listOf(
//        UpComingCards("stay"),
//        UpComingCards("bus"),
//        UpComingCards("stay"),
//        UpComingCards("stay"),
//        UpComingCards("stay"),
//        UpComingCards("stay"),
//        UpComingCards("bus"),
//        UpComingCards("bus"),
//        UpComingCards("bus"),
//        UpComingCards("bus")
//    )
) {
    val bookingTickets = filterUpcomingData(filterButtonName)
    val pagerState = rememberPagerState(initialPage = index) {
        bookingTickets.size
    }
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        Column(
            verticalArrangement = Arrangement.spacedBy(50.dp),
        ) {

            Box {
                HorizontalPager(state = pagerState) { index ->
                    when (bookingTickets[index].cardName) {
                        "stay" -> {
                            StayBookingScreen()
                        }

                        "bus" -> {
                            BusBookingScreen()
                        }
                    }

                }

            }

            Indicator(pagerState = pagerState,size = size)
        }
    }
}

//@Preview
@Composable
fun Indicator(modifier: Modifier = Modifier, pagerState: PagerState,size: Int) {
    Row(
        modifier
            .fillMaxWidth()
            .background(Color.Black),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(size) {
            val color = if (pagerState.currentPage == it) Color.White else Color.DarkGray
            val indicatorSize = if (pagerState.currentPage == it) 6.dp else 4.dp
            Box(
                modifier = Modifier
                    .padding(2.dp)
                    .clip(CircleShape)
                    .size(indicatorSize)
                    .background(color)
            ) {

            }
        }
    }
}