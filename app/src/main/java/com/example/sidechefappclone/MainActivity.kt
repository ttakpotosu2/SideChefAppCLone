package com.example.sidechefappclone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.navigation.compose.rememberNavController
import com.example.sidechefappclone.navigation.SetupNavGraph
import com.example.sidechefappclone.ui.theme.SideChefAppCLoneTheme

@ExperimentalLayoutApi
@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SideChefAppCLoneTheme {
                val navController = rememberNavController()
                SetupNavGraph(navController)
            }
        }
    }
}