package com.example.sidechefappclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.sidechefappclone.ui.theme.SideChefAppCLoneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SideChefAppCLoneTheme {

            }
        }
    }
}
