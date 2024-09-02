package com.example.bookingflow.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.bookingflow.BookingFilterList
import com.example.bookingflow.FilterScreen
import com.example.bookingflow.HorizontalScrollBookingTicket
import com.example.bookingflow.StayBookingScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = BookingFilterList) {
        composable<BookingFilterList> {
            BookingFilterList(navController = navController)
        }

        composable<StayBookingScreen> {
            StayBookingScreen()
        }
//                    composable<BusBookingScreen> {
//                        BusBookingScreen()
//                    }
        composable<FilterScreen> {
            val args = it.toRoute<FilterScreen>()
            FilterScreen(navController, index = args.index)
        }
        composable<HorizontalScrollTicketScreen> {
            val args = it.toRoute<HorizontalScrollTicketScreen>()
            HorizontalScrollBookingTicket(index = args.index,size = args.size, filterButtonName = args.filterButton)
        }
        composable<FilterScreenToBookingFilterScreen> {
            val args = it.toRoute<FilterScreenToBookingFilterScreen>()
            BookingFilterList(
                navController = navController,
                filterButtonName = args.filter,
                index = args.index
            )
        }
    }

}
