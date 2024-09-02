package com.example.bookingflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.bookingflow.navigation.Navigation
import com.example.bookingflow.ui.theme.BookingFlowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookingFlowTheme {
                Navigation()
            }
        }
    }
}


    @Preview(showBackground = true)
    @Composable
    fun StayImageCardPreview() {
        BookingFlowTheme {
            StayImageCard()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun BookingIdPreview() {
        BookingFlowTheme {
            BookingId()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun TextAlignVerticallyPreview() {
        BookingFlowTheme {
            TextAlignVertically()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DeviderPreview() {
        BookingFlowTheme {
            DeviderView()
        }
    }

    //@Preview(showBackground = true)
//@Composable
//fun CheckInCheckoutViewPreview() {
//    BookingFlowTheme {
//        CheckInCheckOutView()
//    }
//}
    @Preview(showBackground = true)
    @Composable
    fun CheckInCheckoutScreenPreview() {
        BookingFlowTheme {
            CheckInCheckoutScreen()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GuestInfoViewPreview() {
        BookingFlowTheme {
            GuestInfoView()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ViewDetailsButtonPreview() {
        BookingFlowTheme {
            ViewDetailsButton()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun StayDetailBookingScreenPreview() {
        BookingFlowTheme {
            StayDetailBookingScreen()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun StayBookingScreenPreview() {
        BookingFlowTheme {
            StayBookingScreen()
        }
    }


