package com.example.sidechefappclone.screens.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen_Two() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icons.Default.ArrowBack

        Text(
            "Sign Up",
            style = TextStyle(
                fontSize = 32.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            "Save delicious recipes and get personalized content."
        )
    }
}