package com.example.sidechefappclone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.sidechefappclone.screens.WelcomeScreen
import com.example.sidechefappclone.ui.theme.SideChefAppCLoneTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SideChefAppCLoneTheme {

                WelcomeScreen(navController = rememberNavController())
            }
        }
    }
}
