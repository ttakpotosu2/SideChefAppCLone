package com.example.sidechefappclone.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sidechefappclone.screens.HomeScreen
import com.example.sidechefappclone.screens.LargeCardDetailsScreen
import com.example.sidechefappclone.screens.onboarding.ChooseDietScreen
import com.example.sidechefappclone.screens.onboarding.GoalsScreen
import com.example.sidechefappclone.screens.onboarding.IntroPage
import com.example.sidechefappclone.screens.onboarding.LoginScreenOne
import com.example.sidechefappclone.screens.onboarding.LoginScreen_Two
import com.example.sidechefappclone.screens.onboarding.OnboardingPages

@ExperimentalLayoutApi
@ExperimentalFoundationApi
@Composable
fun SetupNavGraph (
    navController : NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Navigation.IntroPage.route
    ){
        composable(route = Navigation.OnboardingPages.route){
            OnboardingPages(navController)
        }
        composable(route = Navigation.HomeScreen.route){
            HomeScreen(navController)
        }
        composable(route = Navigation.IntroPage.route){
            IntroPage(navController)
        }
        composable(route = Navigation.ChooseDietScreen.route){
            ChooseDietScreen(navController)
        }
        composable(route = Navigation.GoalsScreen.route){
            GoalsScreen(navController)
        }
        composable(route = Navigation.LoginScreenOne.route){
            LoginScreenOne(navController)
        }
        composable(route = Navigation.LoginScreenTwo.route){
            LoginScreen_Two(navController)
        }
        composable(route = Navigation.LargeCardDetailsScreen.route){
            LargeCardDetailsScreen()
        }
    }
}