package com.example.bookingflow.navigation

import kotlinx.serialization.Serializable

@Serializable
object BookingFilterList

@Serializable
object StayBookingScreen

@Serializable
data class FilterScreenToBookingFilterScreen(val filter: String, val index: Int)

@Serializable
data class FilterScreen(val index: Int)

@Serializable
data class HorizontalScrollTicketScreen(val index: Int = 0,val size:Int = 0,val filterButton:String)