package com.example.bookingflow

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DeviderView(modifier: Modifier = Modifier){
  Divider(modifier.fillMaxWidth().padding(horizontal = 16.dp), thickness = 1.dp, color = Color(0xFFE9E9E9))
}