package com.example.bookingflow

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview
//@Composable
//private fun CardStackView(modifier: Modifier = Modifier) {
//    //Adjust wallet  height depending if its collapsed or expanded
//    val containerHeight by animateDpAsState(
//        targetValue = if (areCardsStacked) {
//            cardHeight + ((cards.size - 1) * spacing.value).dp
//        } else {
//            (cards.size.toFloat() * cardHeight.value).dp + ((cards.size - 1) * spacing.value).dp
//        },
//        animationSpec = animationSpec,
//        label = ""
//    )
//    Box(
//        modifier = modifier
//            .padding(top = 8.dp)
//            .height(containerHeight),
//        contentAlignment = Alignment.TopCenter
//    ) {
//
//    }
//}