package com.example.sidechefappclone

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.sidechefappclone.screens.WelcomeScreen
import com.example.sidechefappclone.ui.theme.SideChefAppCLoneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        // set FLAG_LAYOUT_NO_LIMITS
//        // app content will extend to system bars
//        // it should be before setContent block
//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//        )

        setContent {
            SideChefAppCLoneTheme {
                WelcomeScreen(navController = rememberNavController())
            }
        }
    }
}
