package com.example.bookingflow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bookingflow.navigation.FilterScreen
//@Preview
@Composable
fun TripsFilterScreen(navController: NavController, filterButtonName: String, index: Int = 0, onListClicked : (String) -> Unit) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(
                12.dp,
                alignment = Alignment.CenterHorizontally
            ),
        ) {
            ShowAllBookingScreenButton(navController, name = filterButtonName, index = index)
            Verticaldevider()
        }
        StayHorizontalScrollableList(filterbuttonName = filterButtonName, navController = navController,onListClicked = onListClicked)
    }
}

//@Preview
@Composable
fun ShowAllBookingScreenButton(
    navController: NavController,
    modifier: Modifier = Modifier,
    name: String = "All", index: Int = 0
) {

    Box(
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color(0xFF333333),
                shape = RoundedCornerShape(size = 55.dp)
            )
            .clickable {
//                navController.navigate(Screen.StayBookings.route)
                navController.navigate(FilterScreen(index = index))
            }
    ) {
        Row(
            Modifier.padding(vertical = 8.dp, horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = name,
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFEEEEEE)
                )
            )
            Image(
                painter = painterResource(id = R.drawable.expandless_arrow),
                contentDescription = null
            )
        }
    }

}

@Preview
@Composable
private fun Verticaldevider(modifier: Modifier = Modifier) {
    Divider(
        color = Color(0xFF333333), thickness = 1.dp, modifier = modifier
            .width(1.dp)
            .height(40.dp)
    )
}

//@Preview
@Composable
private fun StayHorizontalScrollableList(
    modifier: Modifier = Modifier,
    buttonsNameList: List<String> = listOf(
        "Upcoming",
        "Canceled",
        "Complete"
    ),
    onListClicked: (String) -> Unit,
    filterbuttonName:String = "All",
    navController: NavController
) {
    var changeButtonbackgroundOnTheClick by remember {
        mutableIntStateOf(0)
    }
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(horizontal = 12.dp)
    ) {
        items(buttonsNameList.size) {
            SelectedFilter(
                name = buttonsNameList[it], onClick = {
                    onListClicked(buttonsNameList[it])
                    changeButtonbackgroundOnTheClick = it
                },
                isSelected = changeButtonbackgroundOnTheClick == it,

            )
        }
    }
}

//@Preview
@Composable
fun SelectedFilter(
    modifier: Modifier = Modifier,
    name: String = "",
    onClick: () -> Unit,
    isSelected: Boolean = false,
    filterButtonName:String = ""
) {

    Box(
        modifier = modifier
            .clickable(onClick = onClick)
            .background(
                color = if (isSelected) Color(0xFFFEFEFE) else Color.Black,
                shape = RoundedCornerShape(size = 23.dp)
            )
            .border(
                width = 1.dp,
                color = Color(0xFF333333),
                shape = RoundedCornerShape(size = 23.dp)
            )

    ) {
        Row(
            Modifier.padding(vertical = 8.dp, horizontal = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = name,
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(500),
                    color = if (isSelected) Color(0xFF333333) else Color(0xFFFEFEFE)
                )
            )
        }
    }

}


