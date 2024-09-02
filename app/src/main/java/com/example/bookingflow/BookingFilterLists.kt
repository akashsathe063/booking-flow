package com.example.bookingflow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bookingflow.ui.theme.LazyCardStack
import com.example.bookingflow.ui.theme.UpComingCards

//@Preview
@Composable
fun BookingFilterList(
    navController: NavController,
    modifier: Modifier = Modifier,
    filterButtonName: String = "All",
    index: Int = 0
) {
    var list by remember {
        mutableStateOf(filterUpcomingData(filterButtonName))
    }
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(top = 32.dp)
                .background(Color.Black)
        ) {
            TripsFilterScreen(navController, filterButtonName, index) {
                if (it == "Upcoming" && filterButtonName == "Stay") {
                    list = filterUpcomingData(filterButtonName)
                } else if (it == "Complete" && filterButtonName == "Stay") {
                    list = filterUpcomingData("CompletedStay")
                } else if (it == "Canceled" && filterButtonName == "Stay") {
                    list = filterUpcomingData("CancelledStay")
                } else if (it == "Upcoming" && filterButtonName == "Bus") {
                    list = filterUpcomingData(filterButtonName)
                } else if (it == "Complete" && filterButtonName == "Bus") {
                    list = filterUpcomingData("CompletedBus")
                } else if (it == "Canceled" && filterButtonName == "Bus") {
                    list = filterUpcomingData("CancelledBus")
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            LazyCardStack(navController, list = list, filterButtonName = filterButtonName)
        }
    }
}


fun filterUpcomingData(upcomingFilter: String): List<UpComingCards> {
    return when (upcomingFilter) {
        "Stay" -> {
            listOf(
                UpComingCards("stay"),
                UpComingCards("stay"),
                UpComingCards("stay"),
                UpComingCards("stay"),
                UpComingCards("stay")
            )
        }

        "Bus" -> {
            listOf(
                UpComingCards("bus"),
                UpComingCards("bus"),
                UpComingCards("bus"),
                UpComingCards("bus"),
                UpComingCards("bus")
            )
        }

        "CompletedStay" -> {
            listOf(
                UpComingCards("CompletedStay"),
                UpComingCards("CompletedStay"),
                UpComingCards("CompletedStay"),
                UpComingCards("CompletedStay"),
                UpComingCards("CompletedStay")
            )
        }

        "CancelledStay" -> {
            listOf(
                UpComingCards("CancelledStay"),
                UpComingCards("CancelledStay"),
                UpComingCards("CancelledStay"),
                UpComingCards("CancelledStay"),
                UpComingCards("CancelledStay")
            )
        }

        "CompletedBus" -> {
            listOf(
                UpComingCards("CompletedBus"),
                UpComingCards("CompletedBus"),
                UpComingCards("CompletedBus"),
                UpComingCards("CompletedBus"),
                UpComingCards("CompletedBus")
            )
        }

        "CancelledBus" -> {
            listOf(
                UpComingCards("CancelledBus"),
                UpComingCards("CancelledBus"),
                UpComingCards("CancelledBus"),
                UpComingCards("CancelledBus"),
                UpComingCards("CancelledBus")
            )
        }

        else -> {
            listOf(
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
        }
    }
}