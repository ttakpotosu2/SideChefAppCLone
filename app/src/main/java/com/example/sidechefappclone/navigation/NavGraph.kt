package com.example.sidechefappclone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sidechefappclone.screens.HomeScreen
import com.example.sidechefappclone.screens.WelcomeScreen

@Composable
fun SetupNavGraph(
    navController : NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Navigation.Welcome.route
    ){
        composable(route = Navigation.Welcome.route){
            WelcomeScreen(navController = navController)
        }
        composable(route = Navigation.Home.route){
            HomeScreen()
        }
    }
}

