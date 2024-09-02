package com.example.bookingflow.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import androidx.navigation.NavController
import com.example.bookingflow.CanceledStayCard
import com.example.bookingflow.CancelledBusBookingCard
import com.example.bookingflow.CompletedBusBookingCard
import com.example.bookingflow.CompletetdStayCard
import com.example.bookingflow.UpComingBusScreen
import com.example.bookingflow.UpComingStayScreen

//@Preview
@Composable
fun LazyCardStack(
    navController: NavController,
    filterButtonName: String = "All",
    modifier: Modifier = Modifier, list: List<UpComingCards> = listOf(
        UpComingCards("stay"),
        UpComingCards("bus"),
        UpComingCards("stay"),
        UpComingCards("stay"),
        UpComingCards("stay"),
        UpComingCards("stay"),
        UpComingCards("bus"),
        UpComingCards("bus"),
        UpComingCards("bus"),
        UpComingCards("bus")
    )
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
//        items(10) {
//            UpComingStayScreen(modifier = Modifier.offset(y = it * (-25).dp), it)
//        }
        itemsIndexed(list) { index, item ->
            when (item.cardName) {
                "stay" -> {
                    UpComingStayScreen(
                        modifier = Modifier.offset(y = index * (-25).dp),
                        index = index,
                        navController = navController,
                        listSize = list.size,
                        filterButtonName = filterButtonName
                    )
                }

                "bus" -> {
                    UpComingBusScreen(
                        modifier = Modifier.offset(y = index * (-25).dp),
                        index = index,
                        navController = navController,
                        listSize = list.size,
                        filterButton = filterButtonName
                    )
                }

                "CompletedStay" -> {
                    CompletetdStayCard(
                        modifier = Modifier.offset(y = index * (-25).dp),
                        index = index,
                        listSize = list.size
                    )
                }

                "CancelledStay" -> {
                    CanceledStayCard(
                        modifier = Modifier.offset(y = index * (-25).dp),
                        index = index,
                        listSize = list.size
                    )
                }

                "CompletedBus" -> {
                    CompletedBusBookingCard(
                        modifier = Modifier.offset(y = index * (-25).dp),
                        index = index,
                        listSize = list.size
                    )
                }

                "CancelledBus" -> {
                    CancelledBusBookingCard(
                        modifier = Modifier.offset(y = index * (-25).dp),
                        index = index,
                        listSize = list.size
                    )
                }
            }
        }
    }
}

data class UpComingCards(val cardName: String)


