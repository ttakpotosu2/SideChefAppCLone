package com.example.sidechefappclone.navigation

sealed class Navigation(val route: String) {
    object IntroPage: Navigation(route = "intro_page")
    object WelcomeScreen: Navigation (route = "welcome_screen")
    object HomeScreen: Navigation(route = "home_screen")
    object ChooseDietScreen: Navigation(route = "choose_diet_screen")
    object GoalsScreen: Navigation(route = "goals_screen")
    object LoginScreenOne: Navigation(route = "login_screen_one")
    object LoginScreenTwo: Navigation(route = "login_screen_two")
    object LargeCardDetailsScreen: Navigation(route = "large_card_details_screen")
    object OnboardingPages: Navigation(route = "onboarding_pages")
}