package com.example.bookingflow

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bookingflow.navigation.FilterScreenToBookingFilterScreen

//@Preview
@Composable
fun FilterScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    buttonNameList: List<String> = listOf("All", "Stay", "Bus", "Ride For Sure"),
    index : Int = 0
) {
    var onclick by remember {
        mutableIntStateOf(index)
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
    ) {
        for (index in buttonNameList.indices) {
            SelectedFilter(
                onClick = {
                    onclick = index
                    navController.navigate(FilterScreenToBookingFilterScreen(buttonNameList[index],onclick))

                }, modifier = Modifier.border(
                    width = 1.dp,
                    color = Color(0xFF333333),
                    shape = RoundedCornerShape(size = 55.dp)
                ),
                name = buttonNameList[index],
                isSelected = onclick == index
            )
        }
    }
}