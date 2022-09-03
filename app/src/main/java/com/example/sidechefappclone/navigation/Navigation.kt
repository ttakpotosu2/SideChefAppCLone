package com.example.sidechefappclone.navigation

sealed class Navigation(val route: String) {
    object Welcome : Navigation (route = "welcome_screen")
    object Home : Navigation(route = "home_screen")
}
