package com.example.bookingflow

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ViewDetailsButton(modifier: Modifier = Modifier) {
    Button(
        modifier = modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
        onClick = { },
        colors = ButtonDefaults.buttonColors(Color(0xFFEBEDFA)),
        shape = MaterialTheme.shapes.medium
    ) {
        Text(text ="View details", fontSize = 14.sp, lineHeight = 19.6.sp, fontWeight = FontWeight(600), color = Color(0xFF3287FA), modifier = Modifier.padding(vertical = 8.dp))
    }
}